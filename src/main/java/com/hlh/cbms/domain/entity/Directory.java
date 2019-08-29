package com.hlh.cbms.domain.entity;

import lombok.Data;

@Data
public class Directory {
    /**
    * 栏目导航ID
    */
    private Integer dId;

    /**
    * 栏目导航内容
    */
    private String dName;

    /**
    * 导航条id
    */
    private Integer navId;
}