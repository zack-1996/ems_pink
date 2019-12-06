package zt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import zt.entity.Dept;
import zt.service.DeptService;
import zt.service.EmpService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("findAll")
    public String findAll(HttpServletRequest request){
        List<Dept> list = deptService.findAll();
        request.setAttribute("list",list);
        return "dept/deptlist";
    }
    @RequestMapping("add")
    public String add(Dept dept){
        deptService.add(dept);
        return "redirect:/dept/findAll";
    }
    @RequestMapping("findOne")
    public String findOne(Integer id,HttpServletRequest request){
        Dept dept = deptService.findById(id);
        request.setAttribute("dept",dept);
        return "dept/updateDept";
    }
    @RequestMapping("update")
    public String update(Dept dept){
        deptService.update(dept);
        return "redirect:/dept/findAll";
    }
    @Autowired
    private EmpService empService;
    @RequestMapping("delete")
    public String delete(Integer dept_id){
        //先删除不问下的所有员工
        empService.deleteDept(dept_id);
        deptService.delete(dept_id);
        return "redirect:/dept/findAll";
    }
}
