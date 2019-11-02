package com.cherrys.common.utils;

import java.util.UUID;

/**
 * @ClassName StringUtils
 * @Description TODO
 * @Author Wurui
 * @DATE 2019/10/25 11:05
 * @Version 1.0
 **/
public class StringUtils {


    /**
     * 生成ID
     * @return
     */
    public static String GenerateID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
