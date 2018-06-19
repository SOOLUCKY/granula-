package com.lyb.granula.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

@Data
public class DataPrescriptionDetail implements Serializable {

    /**
     * 自动编号
     */
    private String id;

    /**
     * 颗粒序号
     */
    private Integer no;

    /**
     * 配方颗粒ID
     */
    private String granuleId;

    /**
     * 颗粒名称
     */
    private String granuleName;

    /**
     * 饮片剂量
     */
    private BigDecimal doseHerb;

    /**
     * 当量
     */
    private Integer equivalent;

    /**
     * 颗粒当量
     */
    private BigDecimal dose;

    /**
     * 颗粒价格
     */
    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", no=").append(no);
        sb.append(", granuleId=").append(granuleId);
        sb.append(", granuleName=").append(granuleName);
        sb.append(", doseHerb=").append(doseHerb);
        sb.append(", equivalent=").append(equivalent);
        sb.append(", dose=").append(dose);
        sb.append(", price=").append(price);
        sb.append("]");
        return sb.toString();
    }
}