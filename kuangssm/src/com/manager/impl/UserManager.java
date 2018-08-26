package com.manager.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.common.ResMsg;
import com.dao.UserinfoMapper;
import com.entity.Userinfo;
import com.manager.IUserManager;

@Service("usermanager")
public class UserManager implements IUserManager {

	@Resource
	private UserinfoMapper userMapper;
	
	@Override
	public void addnewUser(Userinfo u) {
		System.out.println("hello");
		System.out.println(u.getName() + u.getUsername());

	}

	@Override
	public ResMsg checkIdentity(Userinfo user) {
        ResMsg res = new ResMsg();

        Userinfo dbuser = userMapper.selectByUsername(user.getUsername());
        if (dbuser.getUsername() == null) {
            res.msg = "没有：" + user.getUsername() + "这个用户";
        }
        if (dbuser.getUserpwd().equals(user.getUserpwd()) == true) {
            res.res = true;
            res.msg = dbuser.getName();
        } else {
            res.res = false;
            res.msg = user.getUsername() + "的密码不正确！";
        }
        return res;
	}

}
