package com.family.bookkeeping.service;

import com.family.bookkeeping.entity.ExpensesRecord;
import java.util.List;

/**
 * (ExpensesRecord)表服务接口
 *
 * @author feiya
 * @since 2021-07-07 15:25:59
 */
public interface ExpensesRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ExpensesRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ExpensesRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param expensesRecord 实例对象
     * @return 实例对象
     */
    ExpensesRecord insert(ExpensesRecord expensesRecord);

    /**
     * 修改数据
     *
     * @param expensesRecord 实例对象
     * @return 实例对象
     */
    ExpensesRecord update(ExpensesRecord expensesRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
