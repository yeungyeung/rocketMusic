package cn.xhfc.rocketmusic.service.impl;

import org.apache.ibatis.session.SqlSession;

import cn.xhfc.rocketmusic.dao.AdminMapper;
import cn.xhfc.rocketmusic.entity.Admin;
import cn.xhfc.rocketmusic.service.AdminService;
import cn.xhfc.rocketmusic.util.DBHelper;

public class AdminServiceImpl implements AdminService {

	private static SqlSession Session;
	private static AdminMapper adminDao;
	static {
		Session=DBHelper.getSession();
		adminDao=Session.getMapper(cn.xhfc.rocketmusic.dao.AdminMapper.class);
	}
	@Override
	public int deleteByPrimaryKey(Integer adId) {
		return adminDao.deleteByPrimaryKey(adId);
	}

	@Override
	public int insert(Admin record) {
		return adminDao.insert(record);
	}

	@Override
	public Admin selectByPrimaryKey(Integer adId) {
		return adminDao.selectByPrimaryKey(adId);
	}

	@Override
	public int updateByPrimaryKeySelective(Admin record) {
		return adminDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Admin record) {
		return adminDao.updateByPrimaryKey(record);
	}

}
