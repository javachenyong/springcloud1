package com.zb.feign.impl;

import com.zb.enilty.Fenzhuang;
import com.zb.enilty.Person;
import com.zb.feign.FeignCliontPerson;
import com.zb.util.Page;
import org.springframework.stereotype.Component;

@Component
public class FeignClientPersonImpl implements FeignCliontPerson {
    @Override
    public Page<Person> fen(Fenzhuang fenzhuang) {
        Page<Person>page=new Page<>();
        return page;
    }

    @Override
    public Integer xiugai(Person xiu) {
        return 0;
    }

    @Override
    public Person weiyicha(Integer id) {
        return null;
    }

    @Override
    public Integer tianjia(Person person) {
        return 0;
    }

    @Override
    public Integer shan(Integer id) {
        return 0;
    }
}
