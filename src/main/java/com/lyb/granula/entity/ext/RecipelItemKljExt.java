package com.lyb.granula.entity.ext;

import com.lyb.granula.entity.RecipelItem;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class RecipelItemKljExt extends RecipelItem implements Serializable {

    /**
     * 颗粒剂总量
     */
    private BigDecimal kljTotalNum;
}