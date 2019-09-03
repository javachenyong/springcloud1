package com.zb.feign;

import com.zb.enilty.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "xinprovider")
public interface FeignClientDept {
    @RequestMapping(value = "quan",method = RequestMethod.GET)
    public List<Dept> quan();
}
