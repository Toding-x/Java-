package com.result;

import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private Object data;

    public static<T> Result<T> success(Object data){
        Result result = new Result();
        result.code = 200;
        result.message="success";
        result.data=data;
        return result;

    }
    public static<T> Result<T> error(String message){
        Result result = new Result();
        result.code=500;
        result.message=message;
        result.data=null;
        return result;
    }

}
