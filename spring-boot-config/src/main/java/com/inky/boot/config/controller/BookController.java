//package com.example.boot.basic.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.*;
//import com.example.boot.basic.controller.dto.AjaxResponse;
//import com.example.boot.basic.controller.dto.Param;
//import com.example.boot.basic.entity.Book;
//import com.example.boot.basic.entity.BookReader;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.File;
//import java.io.IOException;
//import java.time.YearMonth;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//
//
///**
// * @Author asus
// * @Description BookController
// * @Date 2021/3/5
// **/
//@RestController
//@RequestMapping(value = "/api/v1/books")
//@Slf4j
//public class BookController {
//    @GetMapping("all")
//    public AjaxResponse selectBooks() {
//        BookReader[] readers = {
//                BookReader.builder()
//                        .name("aaa")
//                        .age(20)
//                        .build(),
//                BookReader.builder()
//                        .name("bbb")
//                        .age(19)
//                        .build(),
//        };
//        List<BookReader> readerList = Arrays.asList(readers);
//        Book book1 = Book.builder()
//                .id(123)
//                .author("inky")
//                .title("SpringBoot")
//                .content("SpringBoot从入门到精通")
//                .createTime(new Date())
//                .readers(readerList)
//                .build();
//        Book book2 = Book.builder()
//                .id(456)
//                .author("inky")
//                .title("Vue.js")
//                .content("Vue.js从入门到精通")
//                .createTime(new Date())
//                .readers(readerList)
//                .build();
//
//        Book[] books = {book1, book2};
//        List<Book> bookList = Arrays.asList(books);
//
//        return AjaxResponse.success(bookList);
//    }
//
//    @GetMapping("{id}")
//    public AjaxResponse getBook(@PathVariable int id) {
//        Book book = Book.builder()
//                .id(id)
//                .author("asus")
//                .title("Java")
//                .content("Java从入门到精通")
//                .createTime(new Date())
//                .build();
//        return AjaxResponse.success(book);
//    }
//
//    @PostMapping("{id}")
//    public AjaxResponse saveBook(@RequestBody Book book) {
//        log.info("saveBook:" + book);
//        return AjaxResponse.success();
//    }
//
//    @PutMapping("{id}")
//    public AjaxResponse updateBook(@RequestBody Book book) {
//        Book book1 = Book.builder()
//                .id(111)
//                .author("asus")
//                .title("Java")
//                .content("Java从入门到精通")
//                .createTime(new Date())
//                .build();
//        log.info("book:" + book);
//
//        book1.setId(book.getId());
//        book1.setTitle(book.getTitle());
//
//        log.info("book:" + book);
//        return AjaxResponse.success();
//
//
//    }
//
////    @DeleteMapping("{id}")
////    public AjaxResponse deleteBook(@PathVariable int id) {
////        log.info("id:" + id);
////        return  AjaxResponse.success();
////    }
//
////    @DeleteMapping()
////    public AjaxResponse deleteBook(@RequestParam(value = "id",defaultValue = "888") int idd, @RequestParam("title") String ti){
////        log.info("id:" + idd);
////        log.info("title:" + ti);
////        return  AjaxResponse.success();
////    }
//
//    @DeleteMapping("{id}")
//    public AjaxResponse deleteBook(@PathVariable int id) {
//        log.info("id:" + id);
//        return AjaxResponse.success();
//    }
//
//
////    @PostMapping("upload")
////     public AjaxResponse handleUpload(MultipartFile[] file, HttpServletRequest request) {
////         //创建文件在服务器的存储路径
////         String path = request.getServletContext().getRealPath("/upload");
////         log.info(path);
////         File fileDir = new File(path);
////         if (!fileDir.exists()) {
////             fileDir.mkdirs();
////             boolean flag = fileDir.mkdirs();
////             log.info("flag" + flag);
////         }
////         //生成文件在服务器的名字的前缀
////         String prefixName = UUID.randomUUID().toString();
////         //取得原文件名
////         String originalFilename = file.getOriginalFilename();
////         //从原文件名中分离出扩展名（后缀）  111.jpg ——> jpg
////         assert originalFilename !=null;
////         String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
////         //拼接新的文件名
////         String fileName = prefixName + suffixName;
////         log.info(fileName);
////         //创建上传的文件名
////         File saveFile = new File(path + "/" + fileName);
////         try {
////             file.transferTo(saveFile);
////         } catch (IOException e) {
////             log.info(e.getMessage());
////             AjaxResponse.failure("文件上传失败");
////
////         }
//
//    @PostMapping("upload2")
//    public AjaxResponse multiUpload(MultipartFile[] files, HttpServletRequest request) {
//        List fileName = new ArrayList();
//        //创建文件在服务器的存放路径
//        YearMonth ym = YearMonth.now();
//        Calendar now = Calendar.getInstance();
//        for (MultipartFile file : files) {
//            //判断文件是否为空
//            if (file.isEmpty()) {
//                System.out.println("该文件为空");
//            } else {
//                //生成文件在服务器的名称前缀
//                String prefixName = UUID.randomUUID().toString();
//                //提取源文件名
//                String originalFilename = file.getOriginalFilename();
//                //从原文件名分离出扩展名
//                assert originalFilename != null;
//                String suffixName = originalFilename.substring(originalFilename.lastIndexOf("."));
//                //拼接新的文件名
//                String newFileName = prefixName + suffixName;
//                //处理文件夹
//                String s = ym.format(DateTimeFormatter.ofPattern("yyyy-MM"));
//                int d = now.get(Calendar.DAY_OF_MONTH);
//                String path = request.getServletContext().getRealPath("upload/" + s + "/" + d + "/" + suffixName);
//                log.info(path);
//                File fileDir = new File(path);
//                if (!fileDir.exists()) {
//                    boolean flag = fileDir.mkdirs();
//                    log.info("flag" + flag);
//
//                }
//                //创建上传的文件名
//                File saveFile = new File(path + "/" + fileName);
//                try {
//                    file.transferTo(saveFile);
//                } catch (IOException e) {
//                    log.info(e.getMessage());
//                    AjaxResponse.failure("文件上传失败");
//                }
//                fileName.add(newFileName);
//                log.info(fileName.toString());
//            }
//
//
//        }
//        return AjaxResponse.success(fileName);
//    }
//}
