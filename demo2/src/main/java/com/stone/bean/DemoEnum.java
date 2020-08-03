package com.stone.bean;

import org.thymeleaf.expression.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * stone 2020/7/27
 * 枚举类demo
 */
public enum DemoEnum {
    MONDAY("星期一","1"),
    TUESDAY("星期二","2"),
    WEDNESDAY("星期三","3"),
    THURSDAY("星期四","4"),
    FRIDAY("星期五","5"),
    SATURDAY("星期六","6"),
    SUNDAY("星期日","7");

    private String desc;
    private String code;

    private DemoEnum(String desc, String code) {
        this.desc = desc;
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public String getCode() {
        return code;
    }
    public static void main (String[] args) {
        DemoEnum[] values = DemoEnum.values();
        for (DemoEnum value : values) {
            System.out.println("desc :" + value.getDesc() + "\t" + "code :" + value.getCode());
        }
    }

    private static Map<String, String> map;

    static {
        map = new HashMap<>();
        DemoEnum[] values = DemoEnum.values();
        for (DemoEnum value : values) {
            map.put(value.code, value.desc);
        }
    }

    public static String getDesc (String code) {
        String desc = map.get(code);
        return desc == null ? code : desc;
    }
}
