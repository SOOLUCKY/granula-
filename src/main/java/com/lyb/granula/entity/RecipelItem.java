package com.lyb.granula.entity;

import com.lyb.granula.common.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class RecipelItem extends BaseEntity implements Serializable {
    /**
     * 处方流水号
     */
    private String reciId;

    /**
     * 门店 ID
     */
    private String hospitalId;

    /**
     * 开放时选择的药房ID
     */
    private String pharmacyId;

    /**
     * 购买时的药房ID
     */
    private String buyPharmacyId;

    /**
     * WAITING:待发药 SEND：发药 RETURN：退药
     */
    private String status;

    /**
     * 顺序号
     */
    private Integer seq;

    /**
     * 药品ID号
     */
    private String drugId;

    /**
     * 药品 名称
     */
    private String drugName;

    /**
     * 项目类型：药品、诊疗、代煎、快递
     */
    private String itemType;

    /**
     * 中药单次用量
     */
    private BigDecimal unitNum;

    /**
     * 处方剂数
     */
    private Integer totalDose;

    /**
     * 总量
     */
    private BigDecimal totalNum;

    /**
     * 已退数量
     */
    private BigDecimal returnNum;

    /**
     * 用户购买剂数
     */
    private Integer buyDose;

    /**
     * 用户购买的数量
     */
    private BigDecimal buyTotalNum;

    /**
     * 已退剂数
     */
    private Integer returnDose;

    /**
     * 原价（药房直接计算的原始价格）
     */
    private BigDecimal originalPrice;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 备注
     */
    private String notes;

    /**
     * 给药途径（成药）：口服 oral/外用 ext
     */
    private String useRoute;

    /**
     * 药品类型中成药中   成药 ZCNY 中草药 ZCY  辅料：ACC
     */
    private String drugType;

    /**
     * 规格 g 盒 支
     */
    private String unitStandard;

    /**
     * N:不待筹 Y:待筹（参与计算价格，不扣减库存）
     */
    private String toBuy;

    /**
     * Y：自备 N：否
     */
    private String self;

    /**
     * 提示：例如孕妇禁用
     */
    private String takeTips;

    /**
     * 煎法方式一  先煎：XJ   后下：HX  单煎：DJ（XJ-10为先煎10分钟）
     */
    private String decoType1;

    /**
     * 煎法方式二  包煎：BJ  捣碎：DS  水洗：SX  打粉：DF
     */
    private String decoType2;

    /**
     * 煎法方式三  烊化：YH  冲服：CF  焗服：JF  兑服：DF  吞服：TF
     */
    private String decoType3;

    private String decoTime;

    private static final long serialVersionUID = 1L;

    private String standard;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reciId=").append(reciId);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", pharmacyId=").append(pharmacyId);
        sb.append(", buyPharmacyId=").append(buyPharmacyId);
        sb.append(", status=").append(status);
        sb.append(", seq=").append(seq);
        sb.append(", drugId=").append(drugId);
        sb.append(", drugName=").append(drugName);
        sb.append(", itemType=").append(itemType);
        sb.append(", unitNum=").append(unitNum);
        sb.append(", totalDose=").append(totalDose);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", returnNum=").append(returnNum);
        sb.append(", buyDose=").append(buyDose);
        sb.append(", buyTotalNum=").append(buyTotalNum);
        sb.append(", returnDose=").append(returnDose);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", notes=").append(notes);
        sb.append(", useRoute=").append(useRoute);
        sb.append(", drugType=").append(drugType);
        sb.append(", unitStandard=").append(unitStandard);
        sb.append(", toBuy=").append(toBuy);
        sb.append(", self=").append(self);
        sb.append(", takeTips=").append(takeTips);
        sb.append(", decoType1=").append(decoType1);
        sb.append(", decoType2=").append(decoType2);
        sb.append(", decoType3=").append(decoType3);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", modifyUser=").append(modifyUser);
        sb.append("]");
        return sb.toString();
    }
}