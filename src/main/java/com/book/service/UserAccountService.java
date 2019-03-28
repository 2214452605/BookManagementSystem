package com.book.service;

import com.book.dao.UserAccountMapper;
import com.book.pojo.AdminAccount;
import com.book.pojo.UserAccount;
import com.book.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountException;

@Service("service")
public class UserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;
    public Msg checkUerAccount(UserAccount userAccount){
        int count = userAccountMapper.checkoutAccount(userAccount);
        if (count==1){
            return Msg.success();
        }
        return Msg.fail();
    }


    public Msg checkUserName(String userName){
        int i = userAccountMapper.checkoutUserName(userName);
        System.out.println(userName);
        System.out.println(i);
        if (i==0){
            return Msg.success();
        }
        return Msg.fail();
    }
}
