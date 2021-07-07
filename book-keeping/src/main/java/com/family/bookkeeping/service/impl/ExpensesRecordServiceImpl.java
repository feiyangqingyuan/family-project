package com.family.bookkeeping.service.impl;

import com.family.bookkeeping.dao.ExpensesRecordDao;
import com.family.bookkeeping.entity.ExpensesRecord;
import com.family.bookkeeping.service.ExpensesRecordService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * (ExpensesRecord)表服务实现类
 *
 * @author feiya
 * @since 2021-07-07 15:26:00
 */
@Service("expensesRecordService")
public class ExpensesRecordServiceImpl implements ExpensesRecordService {

    @Resource
    private ExpensesRecordDao expensesRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ExpensesRecord queryById(Long id) {
        return this.expensesRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ExpensesRecord> queryAllByLimit(int offset, int limit) {
        return this.expensesRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param expensesRecord 实例对象
     * @return 实例对象
     */
    @Override
    public ExpensesRecord insert(ExpensesRecord expensesRecord) {
        this.expensesRecordDao.insert(expensesRecord);
        return expensesRecord;
    }

    /**
     * 修改数据
     *
     * @param expensesRecord 实例对象
     * @return 实例对象
     */
    @Override
    public ExpensesRecord update(ExpensesRecord expensesRecord) {
        this.expensesRecordDao.update(expensesRecord);
        return this.queryById(expensesRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.expensesRecordDao.deleteById(id) > 0;
    }
}
