package com.wingliberty.common.dto;

/**
 * @author aiLun
 * @date 2023/4/22-08:04
 */
public enum ResultCode {
    success(200),
    failed(500)
    ;
    final int code;
    ResultCode(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
