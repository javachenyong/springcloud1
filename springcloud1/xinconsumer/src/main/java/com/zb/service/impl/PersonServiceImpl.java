package com.zb.service.impl;

import com.zb.enilty.Fenzhuang;
import com.zb.enilty.Person;
import com.zb.feign.FeignCliontPerson;
import com.zb.service.PersonService;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired(required = false)
    private FeignCliontPerson mm;
    @Override
    public Page<Person> fen(Fenzhuang person) {
        Page<Person> kk= mm.fen(person);
        return  kk;
    }

    @Override
    public Integer xiugai(Person xiu) {
        return mm.xiugai(xiu);
    }

    @Override
    public Person weiyicha(Integer id) {
        return mm.weiyicha(id);
    }

    @Override
    public Integer tianjia(Person jia) {
        return mm.tianjia(jia);
    }

    @Override
    public Integer shan(Integer id) {
        return mm.shan(id);
    }

}
