package com.expcetion;

import com.enums.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
    private final Integer code;
    public BusinessException(ErrorCode errorCode){
        super((errorCode.getMessage()));
        this.code=errorCode.getCode();
    }
}
