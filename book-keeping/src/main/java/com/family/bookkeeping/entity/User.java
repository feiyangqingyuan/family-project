package com.family.bookkeeping.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * (User)实体类
 *
 * @author feiya
 * @since 2021-07-07 15:26:03
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 600852627529577770L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 登录密码
     */
    private String loginPassword;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private Long createBy;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人
     */
    private Long updateBy;
    /**
     * 是否删除，0=未删除，1=已删除
     */
    private Boolean deleted;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}
