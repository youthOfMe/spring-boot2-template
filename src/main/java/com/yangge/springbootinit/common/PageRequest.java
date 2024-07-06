package com.yangge.springbootinit.common;

import com.yangge.springbootinit.constant.CommonConstant;
import lombok.Data;

/**
 * 分页请求
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 程序字段
     */
    private String sortField;

    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
