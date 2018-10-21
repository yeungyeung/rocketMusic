package cn.xhfc.rocketmusic.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.xhfc.rocketmusic.entity.Admin;
import cn.xhfc.rocketmusic.entity.AdminExample;

public interface AdminService {

    int deleteByPrimaryKey(Integer adId);

    int insert(Admin record);

    Admin selectByPrimaryKey(Integer adId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}
