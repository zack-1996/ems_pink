package zt.service;

import zt.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();
    Dept findById(Integer id);
    void add(Dept dept);
    void update(Dept dept);
    void delete(Integer id);
}
