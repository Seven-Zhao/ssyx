package com.atguigu.ssyx.common.result;

import lombok.Data;

/**
 * ClassName:    Result
 * Package:      com.atguigu.ssyx.common.result
 *
 * @Author: Seven
 * @Create: 2023/6/10 22:26
 * @Version:
 * @Description:
 */

@Data
public class Result<T> {
    // 状态码
    private Integer code;

    // 信息
    private String message;

    // 数据
    private T data;

    public Result() {
    }

    /**
     * 设置数据，返回结果对象
     *
     * @param data    数据
     * @param code    状态码
     * @param message 信息
     * @param <T>     输入的泛型
     * @return 返回结果对象
     */
    private static <T> Result<T> build(T data, Integer code, String message) {
        // 创建Result对象，设置值，返回对象
        Result<T> result = new Result<>();

        if (data != null) {
            result.setData(data);
        }

        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    private static <T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<>();

        if (data != null) {
            result.setData(data);
        }
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    public static <T> Result<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    public static <T> Result<T> fail(T data) {
        return build(data, ResultCodeEnum.FAIL);
    }

}
