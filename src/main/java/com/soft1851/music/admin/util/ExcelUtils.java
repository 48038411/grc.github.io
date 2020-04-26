package com.soft1851.music.admin.util;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 导出工具类
 *
 * @author：Guorc
 * @create 2020-04-24 23:46
 */
@Slf4j
public class ExcelUtils {
    public static void exportExcel(HttpServletResponse response, List list, Map<String,String> map,String title){
        //通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getWriter(true);
    }
}
