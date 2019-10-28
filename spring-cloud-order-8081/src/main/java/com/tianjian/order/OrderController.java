package com.tianjian.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author travel
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    public List<String> listOrders() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("111");
        strings.add("222");
        return strings;

    }
}
