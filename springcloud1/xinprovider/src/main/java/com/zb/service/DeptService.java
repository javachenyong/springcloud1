package com.zb.service;

import com.zb.enilty.Dept;
import com.zb.mapper.DeptMapper;
import com.zb.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DeptService {
    @Autowired(required = false)
    private DeptMapper mm;
    @RequestMapping(value = "quan",method = RequestMethod.GET)
    public List<Dept>quan(){
List<Dept> list=mm.quan();
return list;
    }
}
