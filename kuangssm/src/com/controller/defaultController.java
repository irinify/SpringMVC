package com.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.common.ResMsg;
import com.entity.Userinfo;
import com.manager.IUserManager;

@Controller
public class defaultController {
	@Resource
	private IUserManager usermanager;
	
	@RequestMapping("/addnewuser")
	public String addnewUser(Userinfo user, Model model){
		usermanager.addnewUser(user);
		model.addAttribute("user", user);
		
		return "index";
	}
	
	@RequestMapping("/check")
	public void checkIdentity(@RequestBody Userinfo user, HttpServletResponse response, HttpSession session){
		ResMsg res = usermanager.checkIdentity(user);
		if (res.res == true) {
            session.setAttribute("username", user.getUsername());
            session.setAttribute("name", res.msg);
            try {
				response.sendRedirect("index.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=utf-8");
            java.io.PrintWriter out;
			try {
				out = response.getWriter();
				out.write("<script language='javascript'>alert('" + res.msg
	                    + "');window.location.href='login.html';</script>");
	            out.flush();
	            out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        }
	}
}
