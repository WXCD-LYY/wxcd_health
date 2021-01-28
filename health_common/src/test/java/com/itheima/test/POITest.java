package com.itheima.test;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Company: CUG
 * @Description: TODO
 * @Author: LiYangyong
 * @Date: 2021/1/20/020 18:15
 **/
public class POITest {

    // 使用POI读取Excel文件中的数据
    @Test
    public void test1() throws Exception{
        // 加载指定文件，创建一个Excel对象（工作簿）
        XSSFWorkbook excel = new XSSFWorkbook(new FileInputStream(new File("H:\\IT视频教程\\Java项目\\poi.xlsx")));
        // 读取Excel文件中第一个Sheet标签页
        XSSFSheet sheet = excel.getSheetAt(0);
        // 遍历Sheet标签页，获得每一行数据
        for (Row row : sheet) {
            // 遍历行，获得每个单元格
            for (Cell cell : row) {
                System.out.println(cell.getStringCellValue());
            }
        }
        // 关闭资源
        excel.close();
    }


    // 使用POI读取Excel文件中的数据
    @Test
    public void test2() throws Exception{
        // 加载指定文件，创建一个Excel对象（工作簿）
        XSSFWorkbook excel = new XSSFWorkbook(new FileInputStream(new File("H:\\IT视频教程\\Java项目\\poi.xlsx")));
        // 读取Excel文件中第一个Sheet标签页
        XSSFSheet sheet = excel.getSheetAt(0);

        // 获得最后一个行号，需要注意：行号从零开始
        int lastRowNum = sheet.getLastRowNum();
        for (int i = 0; i <= lastRowNum; i++) {
            XSSFRow row = sheet.getRow(i); // 根据行号获取每一行
            System.out.println("lastRowNum:" + lastRowNum);
            // 获取当前行最后一个单元格索引
            short lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                XSSFCell cell = row.getCell(j);
                System.out.println(cell.getStringCellValue());
            }
        }
        // 关闭资源
        excel.close();
    }

    // 使用POI向Excel文件写入数据，并通过输出流将创建的Excel文件保存到本地文件
    @Test
    public void test3() throws Exception {
        // 在内存中创建一个Excel文件（工作簿）
        XSSFWorkbook excel = new XSSFWorkbook();
        // 创建一个工作表对象
        XSSFSheet sheet = excel.createSheet("传智播客");
        // 在工作表中创建行对象
        XSSFRow title = sheet.createRow(0);
        // 在行中创建单元格对象
        title.createCell(0).setCellValue("姓名");
        title.createCell(1).setCellValue("地址");
        title.createCell(2).setCellValue("年龄");

        XSSFRow dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue("小明");
        dataRow.createCell(1).setCellValue("北京");
        dataRow.createCell(2).setCellValue("20");

        // 创建一个输出流，通过输出流将内存中的Excel文件写到磁盘
        FileOutputStream out = new FileOutputStream(new File("H:\\IT视频教程\\Java项目\\test.xlsx"));
        excel.write(out);
        out.flush();
        excel.close();
    }
}
