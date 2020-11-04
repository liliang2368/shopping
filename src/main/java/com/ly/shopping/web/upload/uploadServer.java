package com.ly.shopping.web.upload;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.security.Principal;
@RestController
@Scope("prototype")
@Controller
@RequestMapping("/api")
public class uploadServer {
    @RequestMapping("/upload")
    public String logUpload(@RequestParam("file") MultipartFile file) throws Exception {
        InputStream in=file.getInputStream();
        int iAvail = in.available();
        byte[] bytes = new byte[iAvail];
        in.read(bytes);
        System.out.println("文件内容:\n" + new String(bytes));
        in.close();
        return "admin";

    }

}
