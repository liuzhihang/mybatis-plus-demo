package com.liuzhihang.demo.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * 状态枚举
 *
 * @author liuzhihang
 * @date 2019/12/26 14:19
 */
public enum OrderStatusEnum {
    INIT(0, "初始状态"),
    SUCCESS(1, "成功"),
    FAIL(2, "失败"),
    ;

    @EnumValue
    private final int code;

    private final String desc;

    OrderStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}
