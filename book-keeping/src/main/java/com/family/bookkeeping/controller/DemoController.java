package com.family.bookkeeping.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feiya
 * @date 2021/07/07
 */
@Api(tags = "demo")
@RestController("demo")
public class DemoController {

    @ApiImplicitParam(name = "name", value = "姓名", required = true)
    @ApiOperation(value = "demo hello")
    @GetMapping("hello")
    public String demo(@RequestParam("name") String name) {
        return name;
    }
}
