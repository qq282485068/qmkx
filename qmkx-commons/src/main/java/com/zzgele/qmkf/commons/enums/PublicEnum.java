/*
 * ====================================================================
 * 龙果学院： www.roncoo.com （微信公众号：RonCoo_com）
 * 超级教程系列：《微服务架构的分布式事务解决方案》视频教程
 * 讲师：吴水成（水到渠成），840765167@qq.com
 * 课程地址：http://www.roncoo.com/details/7ae3d7eddc4742f78b0548aa8bd9ccdb
 * ====================================================================
 */
package com.zzgele.qmkf.commons.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.zzgele.qmkf.commons.enums.IEnum;

/**
 * @version 1.0
 * @author: HaijunLiu
 * @email: isaiah@@sohu.com
 * @description：是否状态字段通过枚举
 * @date: 2018/2/4 13:47
 * @mofified By:
 */
public enum PublicEnum implements IEnum {

    YES(1, "是"), NO(0, "否");

    // 成员变量
    private int key;

    private String value;

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

    // 构造方法
    private PublicEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 枚举类型转换，由于构造函数获取了枚举的子类enums，让遍历更加高效快捷
     *
     * @param key 数据库中存储的自定义code属性
     * @return code对应的枚举类
     */
    public static PublicEnum locateIEnum(int key) {
        for (PublicEnum status : PublicEnum.values()) {
            if (status.getKey() == key) {
                return status;
            }
        }
        throw new IllegalArgumentException("未知的枚举类型：" + key + ",请核对");
    }
}
