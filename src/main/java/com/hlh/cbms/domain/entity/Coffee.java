package com.hlh.cbms.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Coffee {
    private Integer coffeeId;

    private String coffeeImage;

    private String coffeeType;

    private BigDecimal coffeePrice;

    private String coffeeDetails;

    private Integer coffeeStatu;

    private String typeId;
}