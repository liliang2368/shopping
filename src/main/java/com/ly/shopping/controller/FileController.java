package com.ly.shopping.controller;

import com.ly.shopping.service.interfance.ImportService;
import com.ly.shopping.service.interfance.OrdershoppInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@Api(value="文件上传层",tags= {"文件上传层","控制层"})
public class FileController {
    @Autowired
    private ImportService importService;
    @Autowired
    private OrdershoppInterface ordershoppInterface;

//    @RequestMapping("/file")
//    @ResponseBody
//    public String file(MultipartFile fileImage) throws IOException {
//        //准备文件上传的路径
//        String filepath="User/src";
//        File  filedir=new File(filepath);
//        if(!filedir.exists())
//        {
//            filedir.mkdirs();
//        }
//        //获取文件的名称 上传到不同的文件
//        String originalFilename = fileImage.getOriginalFilename();
//        File file=new File(filepath+"/"+originalFilename);
//
//        if(!file.exists())
//        {
//            file.mkdirs();
//        }
//        fileImage.transferTo(file);
//
//        return  "文件上传成功";
//    }
   // @ApiOperation(value = "文件上传测试接口", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value="/file")
    public String uploadExcel(MultipartFile fileImage) throws Exception
    {
        //MultipartHttpServletRequest multipartHttpServletRequest= (MultipartHttpServletRequest) request;
    //    MultipartFile file=  multipartHttpServletRequest.getFile("acvb0815.xlsx");
       if(fileImage.isEmpty())
    {
         return "文件不能为空";
       }
       InputStream inputStream= fileImage.getInputStream();
//        List<List<Object>> list=importService.getBankListbyExcel(inputStream,fileImage.getOriginalFilename());
//        inputStream.close();
//        for(int i=0;i<list.size();i++)
//        {
//            List<Object> lo=list.get(i);
//            //把整行数据插入到数据库中
//            System.out.println(lo);
//        }
        ordershoppInterface.insertOrdershopp(inputStream,fileImage.getOriginalFilename());
        return "上传成功";
    }

}
