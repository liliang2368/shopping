package com.ly.shopping.service;

import com.ly.shopping.service.interfance.ImportService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@Service
public class ImportServiceimpl  implements ImportService {
    @Override
    public List<List<Object>> getBankListbyExcel(InputStream in, String filename) throws Exception {
        List list = new ArrayList<>();
        //创建excel工作薄
        Workbook work = this.getWorkbook(in, filename);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null) {
                continue;
            }
            for (int j = sheet.getFirstRowNum(); j < sheet.getLastRowNum(); j++) {
                row = sheet.getRow(j);
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }
                List<Object> li = new ArrayList<>();
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    li.add(cell);
                }
                list.add(li);
            }
        }
        work.close();
        return list;
    }

    private Workbook getWorkbook(InputStream in, String filename) throws Exception {
        Workbook workbook = null;
        String filetype = filename.substring(filename.lastIndexOf("."));
        if (".xls".equals(filetype)) {
            workbook = new HSSFWorkbook(in);

        } else if (".xlsx".equals(filetype)) {
            workbook = new XSSFWorkbook(in);
        } else {
            throw new Exception("请上传excel文件");
        }
        return workbook;

    }
}
