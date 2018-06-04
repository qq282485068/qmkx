package com.zzgele.qmkf.commons.enums;

import com.fasterxml.jackson.annotation.JsonValue;


/**
 * @version 1.0
 * @author: HaijunLiu
 * @description：性别枚举类 性别【0=未知/1=男/2=女】
 * @date: 2018/1/26 11:47
 * @mofified By:
 */
public enum GenderEnum implements IEnum {

    UNKNOW(0, "未知"), MALES(1, "男"), FEMALES(2, "女");

    private int key;

    private String value;

    private GenderEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    @JsonValue
    public int getKey() {
        return key;
    }

    @Override
    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 枚举类型转换，由于构造函数获取了枚举的子类enums，让遍历更加高效快捷
     *
     * @param key 数据库中存储的自定义code属性
     * @return code对应的枚举类
     */
    public static GenderEnum locateIEnum(int key) {
        for (GenderEnum status : GenderEnum.values()) {
            if (status.getKey() == key) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的枚举类型");
    }
}
