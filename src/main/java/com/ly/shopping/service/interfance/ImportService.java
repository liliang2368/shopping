package com.ly.shopping.service.interfance;

import java.io.InputStream;
import java.util.List;

public interface ImportService {
    List<List<Object>> getBankListbyExcel(InputStream inputStream,  String filename) throws Exception;
}
