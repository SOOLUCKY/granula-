package com.lyb.granula.common.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiechunlu on 2018-05-08 下午1:16
 */

public class CommonConstant {

    public static final Map<String, String> GENDER = new HashMap<>();

    static {
        GENDER.put("M", "男");
        GENDER.put("F", "女");
        GENDER.put("XM", "小朋友男");
        GENDER.put("XF", "小朋友女");
    }

}
