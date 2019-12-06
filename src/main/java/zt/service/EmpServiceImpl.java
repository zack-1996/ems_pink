package zt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zt.dao.EmpDao;
import zt.entity.Emp;

import java.util.List;
@Transactional
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Emp> findAll(Integer dept_id) {
        List<Emp> list = empDao.findAll(dept_id);
        return list;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Emp> findPart(Integer num, Integer dept_id) {
        return null;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Emp findById(Integer id) {
        Emp emp = empDao.findById(id);
        return emp;
    }

    @Override
    public void add(Emp emp) {
        empDao.add(emp);

    }

    @Override
    public void update(Emp emp) {
        empDao.update(emp);
    }

    @Override
    public void delete(Integer id) {
        empDao.delete(id);
    }

    @Override
    public void deleteDept(Integer dept_id) {
        empDao.deleteDept(dept_id);
    }
}
