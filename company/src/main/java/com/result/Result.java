package com.result;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success(Object data){
        Result rs =new Result();
        rs.code=200;
        rs.msg="操作成功";
        rs.data=data;
        return rs;
    }
    public static Result succsess(){
        Result rs = new Result();
        rs.code=200;
        rs.msg="操作成功";
        rs.data=null;
        return rs;
    }
    public static Result error(String msg){
        Result rs= new Result();
        rs.code=500;
        rs.data=null;
        rs.msg=msg;
        return rs;
    }
    public static Result error(Integer code,String msg){
        Result rs = new Result();
        rs.code=code;
        rs.msg=msg;
        rs.data=null;
        return rs;
    }
}

