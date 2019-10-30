package com.tianjian.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "PROVIDER")
public interface OrderService {
    @RequestMapping("/list")
    public List<String> list();

}
