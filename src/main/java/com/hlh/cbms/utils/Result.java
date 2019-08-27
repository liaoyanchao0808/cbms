package com.hlh.cbms.utils;

import lombok.Data;

@Data
public class Result<T> {
    private String msg;
    private Integer status;
    private T data;

    public static Result success(Object obj){
        Result result =new Result();
        result.setMsg(Constants.SUCCESS_MSG);
        result.setData(obj);
        result.setStatus(Constants.SUCCESS_MSG_200);
        return result;
    }

    public static Result error(){
        Result result =new Result();
        result.setMsg(Constants.error_msg);
        result.setStatus(Constants.error_msg_404);
        return result;
    }
}
