package zt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zt.entity.Dept;
import zt.entity.Emp;
import zt.service.DeptService;
import zt.service.EmpService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("findAll")
    public String findAll(Integer dept_id, HttpServletRequest request){
        List<Emp> list = empService.findAll(dept_id);
        request.setAttribute("list",list);
        return "emp/emplist";
    }
    @RequestMapping("delete")
    public String delete(Integer id,Integer dept_id){
        empService.delete(id);
        return "redirect:/emp/findAll?dept_id="+dept_id;
    }
    @Autowired
    private DeptService deptService;
    @RequestMapping("findOne")
    public String findOne(Integer id,HttpServletRequest request){
        Emp emp = empService.findById(id);
        List<Dept> deptlist = deptService.findAll();
        request.setAttribute("emp",emp);
        request.setAttribute("deptlist",deptlist);
        return "emp/updateEmp";
    }
    @RequestMapping("update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll?dept_id="+emp.getDept_id();
    }
    @RequestMapping("findDept")
    public String findDept(HttpServletRequest request){
        List<Dept> list = deptService.findAll();
        request.setAttribute("list",list);
        return "emp/addEmp";
    }
    @RequestMapping("add")
    public String add(Emp emp){
        empService.add(emp);
        return "redirect:/emp/findAll?dept_id="+emp.getDept_id();
    }
}
