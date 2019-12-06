package zt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.annotation.RequestMapping;
import zt.entity.User;
import zt.service.UserService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public String login(HttpServletRequest request,String username,String password){
      /*  String securityCode = (String) request.getSession().getAttribute("securityCode");
        if (securityCode.equals(code)){*/
            User user = userService.login(username, password);
            if(user!=null){
                request.getSession().setAttribute("user",user);
                return "redirect:/dept/findAll";
            }else{
                return "redirect:/user/login.jsp?password=code is wrong";
            }
       /* }else{
            return "redirect:/user/login.jsp?error=code is wrong";
        }*/

    }
    @RequestMapping("add")
    public String add(HttpServletRequest request,User user,String code){
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println(user);
        String securityCode = (String) request.getSession().getAttribute("securityCode");
        if (securityCode.equals(code)){
            User user0 = userService.findByUsername(user.getUsername());
            if(user0==null){
                userService.add(user);
                return "redirect:/user/login.jsp";
            }else{
                return "redirect:/user/regist.jsp?error=username is cf";
            }

        }else{
            return "redirect:/user/regist.jsp?error=code is wrong";
        }
    }
}
