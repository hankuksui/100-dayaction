package com.chen.dayaction.designpattern.factory4.exportfile;

/**
 * Created by ChenTian on 2018/9/11.
   导出格式为PDF，结构为财务报表的导出文件
 */
public class ExportFinancialPdfFile extends ExportFile {
    @Override
    public void export() {
        System.out.println("导出格式为PDF，结构为财务报表的导出文件");
    }
}
