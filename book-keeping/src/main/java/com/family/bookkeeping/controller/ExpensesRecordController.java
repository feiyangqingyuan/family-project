package com.family.bookkeeping.controller;

import com.family.bookkeeping.entity.ExpensesRecord;
import com.family.bookkeeping.service.ExpensesRecordService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (ExpensesRecord)表控制层
 *
 * @author feiya
 * @since 2021-07-07 15:26:00
 */
@RestController
@RequestMapping("expensesRecord")
public class ExpensesRecordController {

    /**
     * 服务对象
     */
    @Resource
    private ExpensesRecordService expensesRecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ExpensesRecord selectOne(Long id) {
        return this.expensesRecordService.queryById(id);
    }

}
