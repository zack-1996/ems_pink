package zt.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseDao<T> {
    List<T> findAll();
    List<T> findPart(Integer num);
    T findById(Integer id);
    T findByUsername(String username);
    T login(@Param("username") String username,
            @Param("password") String password);
    void add(T t);
    void update(T t);
    void delete(Integer id);
    void deleteDept(Integer id);
}
