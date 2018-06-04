package com.zzgele.qmkf.commons.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: ${file_name}
 * @Description: 实体类基础父类
 * @author: Haijun
 * @emial: isaiah@sohu.com
 * @date 2018/6/4下午1:34
 */
public class BaseEntity implements Serializable {

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
