package com.ly.action;

import com.ly.model.Person;
import com.ly.model.User;
import com.ly.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;


@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/updatePassword.action")
    @ResponseBody
    public String updatePassword(Person person, HttpServletRequest request) throws SQLException {
        User user = (User) request.getSession().getAttribute("user");
        int id = user.getId();
        person.setId(id);
        int i = userService.updatePassword(person);
        if (i == 1) {
            System.out.println(" 密码更改成功");
            return "success";
        } else {
            System.out.println("密码修改失败");
            return "error";
        }
    }


    @RequestMapping("/updateSelfData.action")
    @ResponseBody
    public int updateSelfData(User user) throws SQLException {
        int i = userService.updateSelfData(user);
        return i;
    }

    @RequestMapping("/getSelfData.action")
    @ResponseBody
    public User getSelfData(HttpServletRequest request) throws SQLException {
        User user = (User) request.getSession().getAttribute("user");
        int id = user.getId();
        User user1 = userService.getSelfData(id);
        return user1;
    }
}
