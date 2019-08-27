package com.hlh.cbms.domain.entity;

import lombok.Data;

@Data
public class Address {
    private Integer aid;

    /**
    * 现在居住地
    */
    private String city;

    /**
    * 籍贯
    */
    private String nativePlace;

    /**
    * 用户ID
    */
    private String eid;
}