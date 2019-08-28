package com.hlh.cbms.domain.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Ice {
    private Integer iceId;

    private String iceImage;

    private String iceType;

    private BigDecimal icePrice;

    private String iceDetails;

    private Integer iceStatu;

    private String typeId;
}