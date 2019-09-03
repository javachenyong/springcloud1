package com.zb.service.impl;

import com.zb.enilty.Dept;
import com.zb.feign.FeignClientDept;
import com.zb.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
@Autowired(required = false)
private FeignClientDept mm;
    @Override
    public List<Dept> quan() {
        List<Dept>list=mm.quan();
        return list;
    }
}
