package test.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import cn.xhfc.rocketmusic.entity.Admin;
import cn.xhfc.rocketmusic.entity.User;
import cn.xhfc.rocketmusic.util.DBHelper;

public class Test {
	private static SqlSession Session;
	private static cn.xhfc.rocketmusic.dao.AdminMapper admin;
	private static cn.xhfc.rocketmusic.dao.UserMapper userdao;
	@org.junit.Before
	public void Before() {
		Session=DBHelper.getSession();
		admin=Session.getMapper(cn.xhfc.rocketmusic.dao.AdminMapper.class);
		userdao=Session.getMapper(cn.xhfc.rocketmusic.dao.UserMapper.class);
	}
	@org.junit.After
	public void After() {
		Session.commit();
		Session.close();
	}
	@org.junit.Test
	public void testselectAdmin() {
		
		Admin record=new Admin();
		record.setAdName("wangdefa");
		admin.insert(record);
		Admin user=admin.selectByPrimaryKey(1);
		System.out.println(user.getAdName());
		
		User u=userdao.selectByPrimaryKey(1);
		System.out.println(u.getuName());
	}
}
