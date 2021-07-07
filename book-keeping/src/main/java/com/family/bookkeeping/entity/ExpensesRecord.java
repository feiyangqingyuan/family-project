package com.family.bookkeeping.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * (ExpensesRecord)实体类
 *
 * @author feiya
 * @since 2021-07-07 15:25:52
 */
@Data
public class ExpensesRecord implements Serializable {

    private static final long serialVersionUID = -32288063682095632L;
    /**
     * 主键
     */
    private Long id;
    /**
     * 金额
     */
    private Double amount;
    /**
     * 描述
     */
    private String description;
    /**
     * 消费日期
     */
    private Date consumptionDate;
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
}
