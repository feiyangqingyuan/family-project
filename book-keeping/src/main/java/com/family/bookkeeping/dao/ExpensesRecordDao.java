package com.family.bookkeeping.dao;

import com.family.bookkeeping.entity.ExpensesRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * (ExpensesRecord)表数据库访问层
 *
 * @author feiya
 * @since 2021-07-07 15:25:57
 */
public interface ExpensesRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ExpensesRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ExpensesRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param expensesRecord 实例对象
     * @return 对象列表
     */
    List<ExpensesRecord> queryAll(ExpensesRecord expensesRecord);

    /**
     * 新增数据
     *
     * @param expensesRecord 实例对象
     * @return 影响行数
     */
    int insert(ExpensesRecord expensesRecord);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ExpensesRecord> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ExpensesRecord> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ExpensesRecord> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ExpensesRecord> entities);

    /**
     * 修改数据
     *
     * @param expensesRecord 实例对象
     * @return 影响行数
     */
    int update(ExpensesRecord expensesRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

