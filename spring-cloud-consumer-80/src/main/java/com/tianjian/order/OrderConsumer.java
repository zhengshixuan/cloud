package com.tianjian.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author travel
 */
@RestController
public class OrderConsumer {
    private static final String REST_URL_PREFIX ="http://PROVIDER";
    @Autowired
    private OrderService orderService;
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/consumer/list")
    public List<String> list(){
        List list = restTemplate.getForObject(REST_URL_PREFIX+"/list", List.class);
        return list;
    }

    @RequestMapping("/feign/list")
    public List<String> list2(){
        List<String> list = orderService.list();
        return list;
    }



}
