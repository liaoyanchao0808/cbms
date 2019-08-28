package com.hlh.cbms.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Steak {
    private Integer steakId;

    private String steakImage;

    private String steakType;

    private BigDecimal steakPrice;

    private String steakDetails;

    private Integer steakStatu;

    private String typeId;
}