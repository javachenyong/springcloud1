package com.zb.service;

import com.zb.enilty.Fenzhuang;
import com.zb.enilty.Person;
import com.zb.mapper.PersonMapper;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PersonService {
    @Autowired(required = false)
    private PersonMapper mm;
    @RequestMapping(value = "/fen",method = RequestMethod.POST)
    public Page<Person> fen(@RequestBody Fenzhuang fenzhuang) {
        Page<Person> page=new Page<>();
        List<Person>data=mm.fen(fenzhuang.getName(),fenzhuang.getDeptdi(),(fenzhuang.getIndex()-1)*fenzhuang.getSize(),fenzhuang.getSize());
        Integer count=mm.count(fenzhuang.getName(),fenzhuang.getDeptdi());
        page.setCount(count);
        page.setData(data);
        page.setIndex(fenzhuang.getIndex());
        page.setSize(fenzhuang.getSize());
        return page;
    }
    @RequestMapping(value = "/xiu",method = RequestMethod.POST)
    public Integer xiugai(@RequestBody Person xiu){
        return mm.xiugai(xiu);
    }
    @RequestMapping(value = "/weiyicha/{id}",method = RequestMethod.GET)
public Person weiyicha(@PathVariable("id") Integer id){
        Person kk=mm.weiyicha(id);
        return kk;
}
@RequestMapping(value = "/jia",method = RequestMethod.POST)
public Integer tianjia(@RequestBody Person person){
        return mm.tianjia(person);
}
@RequestMapping(value = "/shan/{id}",method = RequestMethod.GET)
public Integer shan(@PathVariable("id") Integer id){
        return  mm.shan(id);
}
}
