package com.zb.mapper;

import com.zb.enilty.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PersonMapper {
    public List<Person> fen(@Param("name") String name,
                            @Param("deptdi") Integer deptdi,
                            @Param("index") Integer index,
                            @Param("size") Integer size);
    public Integer count(@Param("name") String name,
                         @Param("deptdi") Integer deptdi);
    public Integer xiugai(Person xiu);
    public Person weiyicha(Integer id);
    public Integer tianjia(Person jia);
    public Integer shan(Integer id);

}
