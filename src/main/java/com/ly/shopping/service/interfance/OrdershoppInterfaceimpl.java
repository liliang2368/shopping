package com.ly.shopping.service.interfance;

import com.ly.shopping.dao.Interface.OrdershoppMapper;
import com.ly.shopping.dao.bo.Ordershopp;
import com.ly.shopping.util.ObjectMapperUtil;
import com.sun.deploy.util.OrderedHashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdershoppInterfaceimpl implements OrdershoppInterface{
     @Autowired
     private ImportService importService;
     @Autowired
     private OrdershoppMapper ordershoppMapper;


    @Override
    public void insertOrdershopp(InputStream inputStream, String filename) throws Exception {

        List<List<Object>> list = importService.getBankListbyExcel(inputStream, filename);
        for(int i=0;i<list.size();i++)
        {
            List<Object> objects = list.get(i);

            //
            String s = ObjectMapperUtil.toJSON(objects);
            Ordershopp ordershopp = ObjectMapperUtil.toObject(s, Ordershopp.class);
            System.out.println(ordershopp.toString());

        }

    }
}
