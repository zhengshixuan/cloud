package com.tianjian.order;

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
    public List<String> listOrders() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("111");
        return strings;

    }
}
