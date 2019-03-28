package com.book.controller;

import com.book.pojo.UserAccount;
import com.book.service.UserAccountService;
import com.book.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user/")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @ResponseBody
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public Msg login(UserAccount userAccount){
        System.out.println(userAccount);
        Msg msg = userAccountService.checkUerAccount(userAccount);
        System.out.println(msg);
        return msg;

    }

    //检查注册的用户名
    @ResponseBody
    @RequestMapping(value = "checkedRegisterUserName",method = RequestMethod.PUT)
    public Msg register(@RequestBody String userName){
        System.out.println(userName);
        Msg msg = userAccountService.checkUserName(userName);
        return msg;
    }
}
