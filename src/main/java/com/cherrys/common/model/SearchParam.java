package com.cherrys.common.model;

import lombok.Data;

/**
 * @Description TODO
 * @Author wu383
 * @Date 2019/10/27 10:14
 * @Version 1.0
 **/
@Data
public class SearchParam {

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 当前页数
     */
    private Integer pageNum;

    /**
     * 开始时间
     */
    private String createTime;

    /**
     * 结束时间
     */
    private String endTime;


}
