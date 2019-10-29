package com.tianjian.order;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author travel
 */
@RestController
public class OrderController {
    @RequestMapping("/list")
    @HystrixCommand(fallbackMethod = "listOrders_hystrix")
    public List<String> listOrders() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("111");
        if(strings.size()<2){
            throw new RuntimeException("测试hystrix");
        }
        return strings;

    }
    public List<String> listOrders_hystrix() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("listOrders_hystrix");
        return strings;

    }
}
