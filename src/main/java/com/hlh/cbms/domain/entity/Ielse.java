package com.hlh.cbms.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Ielse {
    private Integer elseId;

    private String elseImage;

    private String elseType;

    private BigDecimal elsePrice;

    private String elseDetails;

    private Integer elseStatu;

    private String typeId;
}