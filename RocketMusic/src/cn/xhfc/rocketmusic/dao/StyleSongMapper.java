package cn.xhfc.rocketmusic.dao;

import cn.xhfc.rocketmusic.entity.StyleSong;
import cn.xhfc.rocketmusic.entity.StyleSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StyleSongMapper {
    int countByExample(StyleSongExample example);

    int deleteByExample(StyleSongExample example);

    int deleteByPrimaryKey(Integer ssId);

    int insert(StyleSong record);

    int insertSelective(StyleSong record);

    List<StyleSong> selectByExample(StyleSongExample example);

    StyleSong selectByPrimaryKey(Integer ssId);

    int updateByExampleSelective(@Param("record") StyleSong record, @Param("example") StyleSongExample example);

    int updateByExample(@Param("record") StyleSong record, @Param("example") StyleSongExample example);

    int updateByPrimaryKeySelective(StyleSong record);

    int updateByPrimaryKey(StyleSong record);
}