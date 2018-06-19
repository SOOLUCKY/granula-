package com.lyb.granula.entity;

import com.lyb.granula.common.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class RecipelInfo extends BaseEntity implements Serializable {
    /**
     * 对应ims的rxsource_type字段 policlinical门诊处方 accordingparty照方抓药  foreignparty外来方  对应code_dict type=rxtreattype的字典 ps:数据同步用到
     */
    private String rxsourceType;

    /**
     * 对应ims的rxdrug_type 处方类型：中草药：zcy 中成药：zcny 院内产品：yncp 治疗方: treat
     */
    private String tempType;

    /**
     * ims rxusage_type字段 剂型（s：汤剂、p：散剂、w：丸剂、c：膏剂、k：颗粒剂）
     */
    private String dosageform;

    /**
     * 子类型 sw水丸 smw水蜜丸 dmw大蜜丸
     */
    private String subDosageform;

    /**
     * 处方总价,划价金额
     */
    private BigDecimal price;

    /**
     * 支付金额
     */
    private BigDecimal paymentFee;

    /**
     * 药房标记退费金额
     */
    private BigDecimal markReturnFee;

    /**
     * 对应member_visit_record表的id
     */
    private String visitId;

    /**
     * 挂号编号
     */
    private String registrationNum;

    /**
     * 预约ID
     */
    private String reserveId;

    /**
     * 医馆id
     */
    private String hospitalId;

    /**
     * 指定发药药房
     */
    private String pharmacyId;

    /**  */
    private String doctorId;

    /**  */
    private String doctorName;

    /**
     * 病人编号
     */
    private String memberId;

    /**
     * 病人姓名
     */
    private String memberName;

    /**  */
    private String memberPhone;

    /**
     * 会员等级
     */
    private String memberLevel;

    /**
     * 就诊类型：初诊、复诊
     */
    private String visitType;

    /**
     * 疾病诊断内容
     */
    private String diagnosis;

    /**
     * 主诉医嘱
     */
    private String complain;

    /**
     * 关联处方编号
     */
    private String linkedReciId;

    /**
     * 总剂数
     */
    private Integer totalNum;

    /**
     * 购买的数量
     */
    private Integer buyNum;

    /**
     * x剂y天x
     */
    private Integer splitNum;

    /**
     * x剂y天y
     */
    private Integer splitDay;

    /**
     * 一天服用几次
     */
    private Integer dailyNum;

    /**
     * 一次数量多少g，多少ml，多少勺
     */
    private Integer onceNum;

    /**
     * 每袋剂量ml
     */
    private Integer rxdosepertime;

    /**
     * 用法-剂型2
     */
    private String rxusageTypeChild;

    /**
     * ml 酒煎 加酒
     */
    private Double rxusageTypeValue;

    /**
     * 待补处方
     */
    private String needCompleted;

    /**
     * 是否全方外购
     */
    private String isPurchasedOutside;

    /**
     * 一煎时间
     */
    private Integer firstBrewingTime;

    /**
     * 二煎时间
     */
    private Integer secondBrewingTime;

    /**
     * 三煎时间
     */
    private Integer thirdBrewingTime;

    /**
     * 是否有外带
     */
    private Integer isOut;

    /**
     * NF:内服  WY:外用
     */
    private String useRoute;

    /**
     * 服药时间 ，用逗号分隔，id标识，建一个服药时间表
     */
    private String medicineTime;

    /**
     * 备注-复诊用
     */
    private String remark;

    /**
     * 药费优惠类型
     */
    private String drugPretype;

    /**
     * 优惠码
     */
    private String preCode;

    /**
     * 交易类型
     */
    private String tradeType;

    /**
     * 退费标记 0部分退 1全退
     */
    private String refundMark;

    /**
     * 退药标记 0部分 1全部
     */
    private String returnDrugMark;

    /**
     * 退药原因
     */
    private String returnDrugReason;

    /**
     * 退费关联处方
     */
    private String refundLinkedReciid;

    /**
     * 发药状态 WAITING：待发药 SEND: 已发药 RETURN:退药
     */
    private String dispensingStatus;

    /**
     * 发药人
     */
    private String dispensingUserid;

    /**
     * 发药时间
     */
    private Date dispensingTime;

    /**
     * 空 非门诊 0 普通门诊 1 专科门诊
     */
    private String isSpecialist;

    /**
     * 专科id
     */
    private String specialistId;

    /**
     * 转科套餐id
     */
    private String specialistPlanid;

    /**  */
    private String isCollect;

    /**
     * DJ:已登记 TJ:已提交 BH:驳回 YSH:已审核 YSF:已收费 YFY:已发药 QF:欠费
     */
    private String currentStatus;

    /**
     * 复诊时间
     */
    private Date visitTime;

    /**  */
    private String payRemark;

    /**  */
    private String qianfeiRemark;

    /**  */
    private String tf;

    /**
     * Y：自备 N：否
     */
    private String self;

    /**
     * 图片地址
     */
    private String img;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否隐藏处方详情：Y为隐藏，N为不隐藏
     */
    private String hideRecipel;

    /**
     * 审批时间
     */
    private Date approvalTime;

    /**
     * 审批人
     */
    private String approvalUser;

    /**
     * 审核提示
     */
    private String approvalNote;

    /**
     * 服药期间忌口 ，用逗号分隔，id标识，需要建个忌口表
     */
    private String avoid;

    /**
     * 服药期间禁忌，用逗号分隔，用id来标识，需要建个禁忌表
     */
    private String taboo;

    /**
     * 煎药说明
     */
    private String decoction;

    /**
     * 服药补充说明
     */
    private String supplement;

    /**
     * 处方来源 PC:ims后台 APP：医生客户端
     */
    private String origin;

    /**
     * 处方购买次数
     */
    private Integer purCount;

    /**
     * 特殊说明，此字段有值则不计算服药说明
     */
    private String specialExplanation;

    /**
     * 处方分组id
     */
    private String groupId;

    /**
     * 代煎Y，自煎N
     */
    private String decoMake;

    /**
     * 检查
     */
    private String checkUp;

    /**
     * 治疗方案
     */
    private String treatmentPlan;

    /**
     * N正常 Y已删
     */
    private String isDeleted;

    /**  */
    private String qyflag;

    /**
     * 超量的签名地址
     */
    private String signImg;

    private List<RecipelItem> items;
    /**
     * 是否发送到调剂设备（Y:是，N:否）
     */
    private String isSend;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rxsourceType=").append(rxsourceType);
        sb.append(", tempType=").append(tempType);
        sb.append(", dosageform=").append(dosageform);
        sb.append(", subDosageform=").append(subDosageform);
        sb.append(", price=").append(price);
        sb.append(", paymentFee=").append(paymentFee);
        sb.append(", markReturnFee=").append(markReturnFee);
        sb.append(", visitId=").append(visitId);
        sb.append(", registrationNum=").append(registrationNum);
        sb.append(", reserveId=").append(reserveId);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", pharmacyId=").append(pharmacyId);
        sb.append(", doctorId=").append(doctorId);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", memberId=").append(memberId);
        sb.append(", memberName=").append(memberName);
        sb.append(", memberPhone=").append(memberPhone);
        sb.append(", memberLevel=").append(memberLevel);
        sb.append(", visitType=").append(visitType);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", complain=").append(complain);
        sb.append(", linkedReciId=").append(linkedReciId);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", buyNum=").append(buyNum);
        sb.append(", splitNum=").append(splitNum);
        sb.append(", splitDay=").append(splitDay);
        sb.append(", dailyNum=").append(dailyNum);
        sb.append(", onceNum=").append(onceNum);
        sb.append(", rxdosepertime=").append(rxdosepertime);
        sb.append(", rxusageTypeChild=").append(rxusageTypeChild);
        sb.append(", rxusageTypeValue=").append(rxusageTypeValue);
        sb.append(", needCompleted=").append(needCompleted);
        sb.append(", isPurchasedOutside=").append(isPurchasedOutside);
        sb.append(", firstBrewingTime=").append(firstBrewingTime);
        sb.append(", secondBrewingTime=").append(secondBrewingTime);
        sb.append(", thirdBrewingTime=").append(thirdBrewingTime);
        sb.append(", isOut=").append(isOut);
        sb.append(", useRoute=").append(useRoute);
        sb.append(", medicineTime=").append(medicineTime);
        sb.append(", remark=").append(remark);
        sb.append(", drugPretype=").append(drugPretype);
        sb.append(", preCode=").append(preCode);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", refundMark=").append(refundMark);
        sb.append(", returnDrugMark=").append(returnDrugMark);
        sb.append(", returnDrugReason=").append(returnDrugReason);
        sb.append(", refundLinkedReciid=").append(refundLinkedReciid);
        sb.append(", dispensingStatus=").append(dispensingStatus);
        sb.append(", dispensingUserid=").append(dispensingUserid);
        sb.append(", dispensingTime=").append(dispensingTime);
        sb.append(", isSpecialist=").append(isSpecialist);
        sb.append(", specialistId=").append(specialistId);
        sb.append(", specialistPlanid=").append(specialistPlanid);
        sb.append(", isCollect=").append(isCollect);
        sb.append(", currentStatus=").append(currentStatus);
        sb.append(", visitTime=").append(visitTime);
        sb.append(", payRemark=").append(payRemark);
        sb.append(", qianfeiRemark=").append(qianfeiRemark);
        sb.append(", tf=").append(tf);
        sb.append(", self=").append(self);
        sb.append(", img=").append(img);
        sb.append(", name=").append(name);
        sb.append(", hideRecipel=").append(hideRecipel);
        sb.append(", approvalTime=").append(approvalTime);
        sb.append(", approvalUser=").append(approvalUser);
        sb.append(", approvalNote=").append(approvalNote);
        sb.append(", avoid=").append(avoid);
        sb.append(", taboo=").append(taboo);
        sb.append(", decoction=").append(decoction);
        sb.append(", supplement=").append(supplement);
        sb.append(", origin=").append(origin);
        sb.append(", purCount=").append(purCount);
        sb.append(", specialExplanation=").append(specialExplanation);
        sb.append(", groupId=").append(groupId);
        sb.append(", decoMake=").append(decoMake);
        sb.append(", checkUp=").append(checkUp);
        sb.append(", treatmentPlan=").append(treatmentPlan);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", modifyUser=").append(modifyUser);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", qyflag=").append(qyflag);
        sb.append(", signImg=").append(signImg);
        sb.append(", isSend=").append(isSend);
        sb.append("]");
        return sb.toString();
    }
}