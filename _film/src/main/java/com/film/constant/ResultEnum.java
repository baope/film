package com.film.constant;

public enum ResultEnum {

    UNKNOWN_ERROR(-555, "未知错误"),
    NEED_LOGIN(-555, "未登录"),
    REPEAT_REGISTER(-555, "该用户已注册"),
    USER_NOT_EXIST(-555, "不存在该用户"),
    PASSWORD_ERROR(-555, "密码错误"),
    EMPTY_USERNAME(-555, "用户名为空"),
    EMPTY_PASSWORD(-555, "密码为空"),
    SUCCESS(0, "success");

    private Integer code;
    private String msg;
    private ResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
