package cn.xhfc.rocketmusic.dao;

import cn.xhfc.rocketmusic.entity.Mv;
import cn.xhfc.rocketmusic.entity.MvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MvMapper {
    int countByExample(MvExample example);

    int deleteByExample(MvExample example);

    int deleteByPrimaryKey(Integer mvId);

    int insert(Mv record);

    int insertSelective(Mv record);

    List<Mv> selectByExample(MvExample example);

    Mv selectByPrimaryKey(Integer mvId);

    int updateByExampleSelective(@Param("record") Mv record, @Param("example") MvExample example);

    int updateByExample(@Param("record") Mv record, @Param("example") MvExample example);

    int updateByPrimaryKeySelective(Mv record);

    int updateByPrimaryKey(Mv record);
}