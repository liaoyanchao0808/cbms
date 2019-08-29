package com.hlh.cbms.domain.entity;

import lombok.Data;

@Data
public class Navigation {
    /**
    * 导航条ID
    */
    private Integer navId;

    /**
    * 导航条名字
    */
    private String navName;
}