package com.wingliberty.common.Utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 生成随机数
 *
 * @author aiLun
 * @date 2023/4/22-13:24
 */
public class RandomUtils {
    private RandomUtils() {

    }

    /**
     * 生成随机数字字符串
     * @param length
     * @return
     */
    public static String randomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

}
