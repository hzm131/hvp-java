package com.hzm.utils;

public class ResultUtil {
    public static Result success(Object object) {
        Result result = new Result();
        result.setStatus(200);
        result.setCode(1);
        result.setMessage("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(int status,int code, String message) {
        Result result = new Result();
        result.setStatus(status);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
