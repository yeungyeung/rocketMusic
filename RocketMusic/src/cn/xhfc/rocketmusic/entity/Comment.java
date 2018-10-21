package cn.xhfc.rocketmusic.entity;

public class Comment {
    private Integer coId;

    private Integer coUser;

    private Integer coSong;

    private Integer coAlbum;

    private Integer coMv;

    private Integer coList;

    private String coInfo;

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public Integer getCoUser() {
        return coUser;
    }

    public void setCoUser(Integer coUser) {
        this.coUser = coUser;
    }

    public Integer getCoSong() {
        return coSong;
    }

    public void setCoSong(Integer coSong) {
        this.coSong = coSong;
    }

    public Integer getCoAlbum() {
        return coAlbum;
    }

    public void setCoAlbum(Integer coAlbum) {
        this.coAlbum = coAlbum;
    }

    public Integer getCoMv() {
        return coMv;
    }

    public void setCoMv(Integer coMv) {
        this.coMv = coMv;
    }

    public Integer getCoList() {
        return coList;
    }

    public void setCoList(Integer coList) {
        this.coList = coList;
    }

    public String getCoInfo() {
        return coInfo;
    }

    public void setCoInfo(String coInfo) {
        this.coInfo = coInfo == null ? null : coInfo.trim();
    }
}