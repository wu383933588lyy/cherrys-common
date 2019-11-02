package com.cherrys.common.utils;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author wu383
 * @Date 2019/10/27 10:38
 * @Version 1.0
 **/
public class PageUtils {

    /**
     * 重新封装 PageInfo 返回参数
     * @param pageInfo
     * @return
     */
    public static Map<String,Object> pageMap(PageInfo pageInfo){
        return new HashMap<String, Object>(){{
            put("total",pageInfo.getTotal());
            put("rows",pageInfo.getList());
        }};
    }
}
