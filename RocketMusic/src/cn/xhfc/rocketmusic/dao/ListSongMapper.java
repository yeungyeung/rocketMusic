package cn.xhfc.rocketmusic.dao;

import cn.xhfc.rocketmusic.entity.ListSong;
import cn.xhfc.rocketmusic.entity.ListSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListSongMapper {
    int countByExample(ListSongExample example);

    int deleteByExample(ListSongExample example);

    int deleteByPrimaryKey(Integer lSId);

    int insert(ListSong record);

    int insertSelective(ListSong record);

    List<ListSong> selectByExample(ListSongExample example);

    ListSong selectByPrimaryKey(Integer lSId);

    int updateByExampleSelective(@Param("record") ListSong record, @Param("example") ListSongExample example);

    int updateByExample(@Param("record") ListSong record, @Param("example") ListSongExample example);

    int updateByPrimaryKeySelective(ListSong record);

    int updateByPrimaryKey(ListSong record);
}