package com.hlh.cbms.domain.entity;

import lombok.Data;

@Data
public class Admin {
    /**
    * 账号
    */
    private String aName;

    /**
    * 密码
    */
    private String password;
}