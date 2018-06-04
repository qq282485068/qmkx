package com.zzgele.qmkf.commons.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @version 1.0
 * @author: HaijunLiu
 * @description：操作类型 1查询操作，2添加，3修改，4删除，5其它操作
 * @date: 2018/4/15 11:47
 * @mofified By:
 */
public enum OperationLogTypeEnum implements IEnum {

    QUERY(1, "查询操作"), ADD(2, "添加"), MODIFY(3, "修改"), DELETE(4, "删除"), OTHER(5, "其它操作");

    private int key;

    private String value;

    private OperationLogTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    @JsonValue
    @Override
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
    public static OperationLogTypeEnum locateIEnum(int key) {
        for (OperationLogTypeEnum status : OperationLogTypeEnum.values()) {
            if (status.getKey() == key) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的枚举类型：" + key);
    }

}
