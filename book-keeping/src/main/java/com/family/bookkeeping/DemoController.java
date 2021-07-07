package com.family.bookkeeping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feiya
 * @date 2021/07/07
 */
@RestController
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        return "hello demo";
    }
}
