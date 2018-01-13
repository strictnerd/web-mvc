package com.entity;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Table;

/**
 * Created by clq on 2017/9/5.
 */
@Table("t_sys_user")
public class SysUser {
    @Column("n_id")
    private int id;
    @Column("c_account")
    private String account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
