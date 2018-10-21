package cn.xhfc.rocketmusic.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.xhfc.rocketmusic.entity.Admin;


@Controller
public class TUserControll {

//	@Resource
//	private TUserService service;
//	public void setService(TUserService service) {
//		this.service = service;
//	}
//	
//	@Resource
//	private PrivilegeAspect  privilegeAspect;
//	public void setPrivilegeAspect(PrivilegeAspect privilegeAspect) {
//		this.privilegeAspect = privilegeAspect;
//	}



	@RequestMapping(value="/user_lsdfsdfogin.action",method=RequestMethod.POST)
	public String userLogin(Admin admin,HttpServletRequest request,HttpServletResponse response){
		
//		Admin user1 = service.getTUserByNamePasword(user.getUserAccount(), user.getUserPassword());
//		if(user1!=null){//登录成功
//			
//			//给切面注入一个当前用户User 对象
//			privilegeAspect.setUser(user1);
//			privilegeAspect.setRequest(request);
//			privilegeAspect.setResponse(response);
//			
//			
//			return "/index.jsp";
//		}else{
//			return "/login.jsp";
//		}
		System.out.println(admin.getAdName()+"    "+admin.getAdPwd());
		return "/index.jsp";
		
	}
	
}
