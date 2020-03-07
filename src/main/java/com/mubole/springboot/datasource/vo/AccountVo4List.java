package com.mubole.springboot.datasource.vo;

import com.mubole.springboot.datasource.entities.Account;

public class AccountVo4List extends Account{

    private String thismonthamount;

    public String getThismonthamount() {
        return thismonthamount;
    }

    public void setThismonthamount(String thismonthamount) {
        this.thismonthamount = thismonthamount;
    }
}