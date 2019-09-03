package com.zb.controller;

import com.zb.enilty.Dept;
import com.zb.enilty.Fenzhuang;
import com.zb.enilty.Person;
import com.zb.service.PersonService;
import com.zb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    private PersonService mm;
    @RequestMapping(value = "/fen")
    public Page<Person>fen(String name, Integer deptdi, @RequestParam(defaultValue = "1") Integer index){
        Fenzhuang kk=new Fenzhuang();
        kk.setIndex(index);
        kk.setName(name);
        kk.setSize(2);
        kk.setDeptdi(deptdi);
        Page<Person> page=mm.fen(kk);
        return page;
    }
    @RequestMapping(value = "/toxiu",method = RequestMethod.GET)
    public Person weiyicha(Integer id){
        return mm.weiyicha(id);
    }
    @RequestMapping(value = "/doxiu",method = RequestMethod.POST)
    public int xiugai(String name,String adds,Integer age,Integer xia,Integer id){
        Person person=new Person();
        Dept dept=new Dept();
        dept.setDeptid(xia);
        person.setId(id);
        person.setName(name);
        person.setAdds(adds);
        person.setAge(age);
        person.setDeptdi(dept);
       int num= mm.xiugai(person);
        return num;
    }
    @RequestMapping(value = "/jia",method = RequestMethod.POST)
    public Integer tianjia(Person jia ,Integer kk){
        Dept dept=new Dept();
        dept.setDeptid(kk);
        jia.setDeptdi(dept);
        return mm.tianjia(jia);
    }
    @RequestMapping(value = "/shan",method = RequestMethod.GET)
    public Integer shan(Integer id){
        return mm.shan(id);
    }
}
