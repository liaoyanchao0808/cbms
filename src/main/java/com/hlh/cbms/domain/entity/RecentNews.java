package com.hlh.cbms.domain.entity;

import lombok.Data;

@Data
public class RecentNews {
    /**
    * 最新咨询ID
    */
    private Integer rnId;

    /**
    * 最新资讯内容
    */
    private String rnName;

    /**
    * 栏目导航id
    */
    private Integer dId;
}