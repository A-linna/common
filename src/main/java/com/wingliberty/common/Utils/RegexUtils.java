package com.wingliberty.common.Utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则工具类
 *
 * @author aiLun
 * @date 2023/4/22-07:12
 */
public class RegexUtils {


    //大陆手机号
    private static final Pattern CHINA_PATTERN = Pattern.compile("^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$");

    private RegexUtils() {

    }

    /**
     * 校验 手机号
     *
     * @param phone
     * @return
     */
    public static boolean isMobile(String phone) {
        if (StringUtils.isBlank(phone)) {
            return false;
        }
        Matcher matcher = CHINA_PATTERN.matcher(phone);
        return matcher.matches();
    }

}
