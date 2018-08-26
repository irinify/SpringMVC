package com.manager;

import javax.servlet.http.HttpSession;

import com.common.ResMsg;
import com.entity.Userinfo;

public interface IUserManager {
	public void addnewUser(Userinfo u);
	
	public ResMsg checkIdentity(Userinfo user);
}
