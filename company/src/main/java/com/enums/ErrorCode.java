package com.enums;

import lombok.Getter;


@Getter
public enum ErrorCode {
    USER_NOT_FOUND(1001,"用户不存在"),
    PASSWORD_ERROR(1002,"密码错误"),
    TOKEN_INVALID(1003,"token无效或已过期"),
    PARAM_ERROR(1004,"参数校验失败");
    private final Integer code;
    private final String message;

    ErrorCode(Integer code,String message){
        this.code = code;
        this.message=message;
    }

}
