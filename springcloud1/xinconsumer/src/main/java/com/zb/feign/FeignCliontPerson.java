package com.zb.feign;

import com.zb.enilty.Fenzhuang;
import com.zb.enilty.Person;
import com.zb.feign.impl.FeignClientPersonImpl;
import com.zb.util.Page;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "xinprovider",fallback = FeignClientPersonImpl.class)
public interface FeignCliontPerson {
    @RequestMapping(value = "/fen",method = RequestMethod.POST)
    public Page<Person> fen(@RequestBody Fenzhuang fenzhuang);
    @RequestMapping(value = "/xiu",method = RequestMethod.POST)
    public Integer xiugai(@RequestBody Person xiu);

    @RequestMapping(value = "/weiyicha/{id}",method = RequestMethod.GET)
    public Person weiyicha(@PathVariable("id") Integer id);
    @RequestMapping(value = "/jia",method = RequestMethod.POST)
    public Integer tianjia(@RequestBody Person person);
    @RequestMapping(value = "/shan/{id}",method = RequestMethod.GET)
    public Integer shan(@PathVariable("id") Integer id);
}
