package com.atguigu.ssyx.common.result;

import lombok.Getter;

/**
 * ClassName:    ResultCodeEnum
 * Package:      com.atguigu.ssyx.common.result
 *
 * @Author: Seven
 * @Create: 2023/6/10 21:22
 * @Version:
 * @Description:
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(200, "OK"),
    FAIL(201,"失败"),

    SERVICE_ERROR(2012,"服务器异常"),
    DATA_ERROR(204,"数据异常"),
    ILLEGAL_REQUEST(205,"非法请求"),
    REPEAT_SUBMIT(206,"重复提交"),

    LOGIN_AUTH(208,"未登录"),
    PERMISSION(209,"没有权限"),

    ORDER_PRICE_ERROR(210,"订单商品价格变化"),
    ORDER_STOCK_FAIL(204,"订单库存锁定失败"),
    CREATE_ORDER_FAIL(210,"创建订单失败"),

    COUPON_GET(220,"优惠券已经领取"),
    COUPON_LIMIT_GET(221,"购物券发放完毕"),
    URL_ENCODE_ERROR(216,"URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(217,"非法回调请求"),
    FETCH_ACCESSTOKEN_FAILD(218,"获取Access Token失败"),
    FETCH_USERINFO_ERROR(219,"获取用户信息失败"),

    SKU_LIMIT_ERROR(230,"购买数量不能大于限购数量"),
    REGION_OPEN(240,"该区域已开通"),
    REGION_NO_OPEN(241,"该区域未开通"),
    PAYMENT_WAITING(242,"订单支付中"),
    PAYMENT_SUCCESS(243,"订单支付成功"),
    PAYMENT_FAIL(244,"订单支付失败"),
    ;

    private final Integer code;
    private final String message;

    private ResultCodeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
