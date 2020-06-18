package zyh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import zyh.pojo.User;
import zyh.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * @program: blue-cloud
 * @description:
 * @author: Mr.Z
 * @create: 2020-06-17 21:13
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello.do")
    public String hello(){
        return "login";
    }

    @RequestMapping("/UserLogin.do")
    public ModelAndView userLogin(String userName, String password, ModelAndView modelAndView, HttpSession session) throws Exception {
        User user = new User(0,userName, password);
        User user1 = userService.userLogin(user);
        if (user1 != null){
            session.setAttribute("user", user1);
            session.setAttribute("IsLogin", 1);
            modelAndView.setViewName("index");
        }else {
            throw new Exception("用户不存在");
        }
        return modelAndView;
    }

    @RequestMapping("/change.do")
    public String change(){
        return "register";
    }

    @RequestMapping("/register.do")
    public String insertUser(User user){
        userService.insertUser(user);
        return "forward:/UserLogin.do";
    }
}
