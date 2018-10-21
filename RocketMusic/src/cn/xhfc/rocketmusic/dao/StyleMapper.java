package cn.xhfc.rocketmusic.dao;

import cn.xhfc.rocketmusic.entity.Style;
import cn.xhfc.rocketmusic.entity.StyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StyleMapper {
    int countByExample(StyleExample example);

    int deleteByExample(StyleExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(Style record);

    int insertSelective(Style record);

    List<Style> selectByExample(StyleExample example);

    Style selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") Style record, @Param("example") StyleExample example);

    int updateByExample(@Param("record") Style record, @Param("example") StyleExample example);

    int updateByPrimaryKeySelective(Style record);

    int updateByPrimaryKey(Style record);
}