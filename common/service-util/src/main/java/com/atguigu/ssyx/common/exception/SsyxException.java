package com.atguigu.ssyx.common.exception;

import com.atguigu.ssyx.common.result.ResultCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName:    SsyxException
 * Package:      com.atguigu.ssyx.common.exception
 *
 * @Author: Seven
 * @Create: 2023/6/11 21:44
 * @Version:
 * @Description:
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class SsyxException extends RuntimeException {

    // 异常处理类状态码
    private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     *
     * @param message 信息
     * @param code    状态码
     */
    public SsyxException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    /**
     * 接收枚举类型对象
     *
     * @param resultCodeEnum
     */
    public SsyxException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "SsyxException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
