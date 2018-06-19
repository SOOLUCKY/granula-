package com.lyb.granula.entity.ext;

import com.lyb.granula.common.util.DateUtils;
import com.lyb.granula.entity.RecipelInfo;
import com.lyb.granula.entity.ext.RecipelItemKljExt;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class RecipelInfoExt extends RecipelInfo {

    private String doctorName;

    private String hospitalName;

    private String memberMobile;

    private String memberName;

    private String memberBirthday;

    private String memberSex;

    private List<RecipelItemKljExt> kljItems;

    private Integer age;

    public Integer getAge() {
        return DateUtils.getAge(Optional.ofNullable(getMemberBirthday()).orElse(""));
    }
}
