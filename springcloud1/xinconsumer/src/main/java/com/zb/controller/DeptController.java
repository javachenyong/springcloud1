package com.zb.controller;

import com.zb.enilty.Dept;
import com.zb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService mm;
    @RequestMapping(value = "/quan",method = RequestMethod.GET)
    public List<Dept>quan(){
        List<Dept> list=mm.quan();
        return list;
    }
}
