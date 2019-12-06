package zt.dao;

import zt.entity.Dept;

import java.util.List;

public interface DeptDao extends BaseDao<Dept> {
    List<Dept> findAll();
    void add(Dept dept);
    void update(Dept dept);
    void delete(Integer id);
}
