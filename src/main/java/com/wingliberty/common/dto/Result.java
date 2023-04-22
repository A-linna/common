package com.wingliberty.common.dto;

/**
 * 基础响应给前端对象
 *
 * @author aiLun
 * @date 2023/4/22-07:58
 */
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result() {
    }


    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 响应成功-有返回值
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T t) {
        return new Result<>(ResultCode.success.code, ResultCode.success.name(), t);
    }

    /**
     * 响应成功-无返回值
     * @return
     * @param <T>
     */
    public static <T> Result<T> success() {
        return new Result<>(ResultCode.success.code, ResultCode.success.name(), null);
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }
}
