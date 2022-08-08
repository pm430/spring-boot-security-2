package com.pm430.springbootsecurity;

import com.pm430.springbootsecurity.account.Account;
import com.pm430.springbootsecurity.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account pm430 = accountService.createAccount("pm430", "pass");
        System.out.println(pm430.getUsername() + " password: " + pm430.getPassword());
    }
}
