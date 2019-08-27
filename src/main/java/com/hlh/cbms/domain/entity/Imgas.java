package com.hlh.cbms.domain.entity;

import lombok.Data;

@Data
public class Imgas {
    private Integer iId;

    /**
    * 用户ID
    */
    private String eid;

    /**
    * 员工照片
    */
    private String iImg;
}