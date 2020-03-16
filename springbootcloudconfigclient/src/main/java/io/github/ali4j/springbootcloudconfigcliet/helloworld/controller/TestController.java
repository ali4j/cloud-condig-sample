package io.github.ali4j.springbootcloudconfigcliet.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${test_name}")
    String testName;

    @GetMapping("/get")
    public String handle() {
        return "this is the value of test_name: " + testName;
    }
}
