package com.zzgele.qmkf.commons.anno;


import com.zzgele.qmkf.commons.enums.OperationLogTypeEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @version 1.0
 * @author: HaijunLiu
 * @email: isaiah@sohu.com
 * @description 记录日志
 * @date: 2018/1/31 13:24
 * @mofified By:
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserOperationLog {

    /**
     * 描述业务操作 例:用户管理-查询用户列表
     *
     * @return
     */
    String description();

    OperationLogTypeEnum type() default OperationLogTypeEnum.QUERY;
}
