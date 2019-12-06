package zt.service;

import com.sun.deploy.security.ruleset.DeploymentRuleSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import zt.dao.DeptDao;
import zt.entity.Dept;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.List;
@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Dept> findAll() {
        List<Dept> list = deptDao.findAll();
        return list;
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Dept findById(Integer id) {
        Dept dept = deptDao.findById(id);
        return dept;
    }

    @Override
    public void add(Dept dept) {
        deptDao.add(dept);
    }

    @Override
    public void update(Dept dept) {
        deptDao.update(dept);
    }

    @Override
    public void delete(Integer id) {
        deptDao.delete(id);
    }
}
