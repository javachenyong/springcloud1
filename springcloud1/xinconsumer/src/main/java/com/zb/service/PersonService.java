package com.zb.service;

import com.zb.enilty.Fenzhuang;
import com.zb.enilty.Person;
import com.zb.util.Page;

public interface PersonService {
    public Page<Person>fen(Fenzhuang person);
    public Integer xiugai(Person xiu);
    public Person weiyicha(Integer id);
    public Integer tianjia(Person jia);
    public Integer shan(Integer id);
}
