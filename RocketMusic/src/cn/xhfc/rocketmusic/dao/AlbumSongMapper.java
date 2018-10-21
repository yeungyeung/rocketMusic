package cn.xhfc.rocketmusic.dao;

import cn.xhfc.rocketmusic.entity.AlbumSong;
import cn.xhfc.rocketmusic.entity.AlbumSongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumSongMapper {
    int countByExample(AlbumSongExample example);

    int deleteByExample(AlbumSongExample example);

    int deleteByPrimaryKey(Integer aSId);

    int insert(AlbumSong record);

    int insertSelective(AlbumSong record);

    List<AlbumSong> selectByExample(AlbumSongExample example);

    AlbumSong selectByPrimaryKey(Integer aSId);

    int updateByExampleSelective(@Param("record") AlbumSong record, @Param("example") AlbumSongExample example);

    int updateByExample(@Param("record") AlbumSong record, @Param("example") AlbumSongExample example);

    int updateByPrimaryKeySelective(AlbumSong record);

    int updateByPrimaryKey(AlbumSong record);
}