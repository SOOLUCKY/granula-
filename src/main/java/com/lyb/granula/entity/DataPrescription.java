package com.lyb.granula.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class DataPrescription implements Serializable {
    /**
     * 自动编号
     */
    private Integer autoid;

    /**
     * 处方号
     */
    private String id;

    /**
     * 挂号单 ID
     */
    private String registerId;

    /**
     * 患者姓名
     */
    private String name;

    /**
     * 患者性别
     */
    private String sex;

    /**
     * 患者年龄
     */
    private Integer age;

    /**
     * 患者联系电话
     */
    private String tele;

    /**
     * 患者电邮
     */
    private String email;

    /**
     * 科室名称
     */
    private String departmentName;

    /**
     * 医生名称
     */
    private String doctorName;

    /**
     * 协定处方名称
     */
    private String prescriptionName;

    /**
     * 处方开具时间
     */
    private Date prescribeTime;

    /**
     * 录入员姓名
     */
    private String creatorName;

    /**
     * 录入时间
     */
    private Date creationTime;

    /**
     * 划价单号
     */
    private String valueSn;

    /**
     * 划价员姓名
     */
    private String valuerName;

    /**
     * 划价时间
     */
    private Date valuationTime;

    /**
     * 处方单剂价格
     */
    private BigDecimal price;

    /**
     * 剂数（袋数）
     */
    private Integer quantity;

    /**
     * 剂数（付数）
     */
    private Integer quantityDay;

    /**
     * 处方总价
     */
    private BigDecimal priceTotal;

    /**
     * 缴费类型
     */
    private String paymentType;

    /**
     * 缴费状态
     */
    private String paymentStatus;

    /**
     * 处方来源
     */
    private String dataSource;

    /**
     * 调剂设备
     */
    private String deviceId;

    /**
     * 调剂状态
     */
    private String processStatus;

    /**
     * 备注说明
     */
    private String description;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", autoid=").append(autoid);
        sb.append(", registerId=").append(registerId);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", tele=").append(tele);
        sb.append(", email=").append(email);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", prescriptionName=").append(prescriptionName);
        sb.append(", prescribeTime=").append(prescribeTime);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", valueSn=").append(valueSn);
        sb.append(", valuerName=").append(valuerName);
        sb.append(", valuationTime=").append(valuationTime);
        sb.append(", price=").append(price);
        sb.append(", quantity=").append(quantity);
        sb.append(", quantityDay=").append(quantityDay);
        sb.append(", priceTotal=").append(priceTotal);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", paymentStatus=").append(paymentStatus);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", processStatus=").append(processStatus);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();

    }
}