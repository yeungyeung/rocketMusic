package cn.xhfc.rocketmusic.dao;

import cn.xhfc.rocketmusic.entity.Llist;
import cn.xhfc.rocketmusic.entity.LlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LlistMapper {
    int countByExample(LlistExample example);

    int deleteByExample(LlistExample example);

    int deleteByPrimaryKey(Integer liId);

    int insert(Llist record);

    int insertSelective(Llist record);

    List<Llist> selectByExample(LlistExample example);

    Llist selectByPrimaryKey(Integer liId);

    int updateByExampleSelective(@Param("record") Llist record, @Param("example") LlistExample example);

    int updateByExample(@Param("record") Llist record, @Param("example") LlistExample example);

    int updateByPrimaryKeySelective(Llist record);

    int updateByPrimaryKey(Llist record);
}