package zt.dao;

import org.apache.ibatis.annotations.Param;
import zt.entity.Emp;

import java.util.List;

public interface EmpDao{
    List<Emp> findAll(Integer dept_id);
    List<Emp> findPart(@Param("num") Integer num,@Param("dept_id")Integer dept_id);
    Emp findById(Integer id);
    void add(Emp emp);
    void update(Emp em);
    void delete(Integer id);
    void deleteDept(Integer dept_id);
}
