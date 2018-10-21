package test.service;

import cn.xhfc.rocketmusic.entity.Admin;
import cn.xhfc.rocketmusic.entity.User;
import cn.xhfc.rocketmusic.service.AdminService;
import cn.xhfc.rocketmusic.service.impl.AdminServiceImpl;

public class AdminTest {

	private static AdminService adminService;
	
	static {
		
		
		
		adminService = new AdminServiceImpl();
	}
	
	@org.junit.Test
	public void testselectAdmin() {
		
		Admin record=new Admin();
		record.setAdName("wangdefa");
		adminService.insert(record);
		Admin user=adminService.selectByPrimaryKey(1);
		System.out.println(user.getAdName());
		System.out.println(user.getAdName());
		System.out.println(user.getAdName());
		System.out.println(user.getAdName());
		
	}
}
