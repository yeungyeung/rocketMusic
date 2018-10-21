package cn.xhfc.rocketmusic.entity;

public class Mv {
    private Integer mvId;

    private String mvName;

    private String mvUrl;

    private String mvPicture;

    private Integer mvSinger;

    private String mvInfo;

    public Integer getMvId() {
        return mvId;
    }

    public void setMvId(Integer mvId) {
        this.mvId = mvId;
    }

    public String getMvName() {
        return mvName;
    }

    public void setMvName(String mvName) {
        this.mvName = mvName == null ? null : mvName.trim();
    }

    public String getMvUrl() {
        return mvUrl;
    }

    public void setMvUrl(String mvUrl) {
        this.mvUrl = mvUrl == null ? null : mvUrl.trim();
    }

    public String getMvPicture() {
        return mvPicture;
    }

    public void setMvPicture(String mvPicture) {
        this.mvPicture = mvPicture == null ? null : mvPicture.trim();
    }

    public Integer getMvSinger() {
        return mvSinger;
    }

    public void setMvSinger(Integer mvSinger) {
        this.mvSinger = mvSinger;
    }

    public String getMvInfo() {
        return mvInfo;
    }

    public void setMvInfo(String mvInfo) {
        this.mvInfo = mvInfo == null ? null : mvInfo.trim();
    }
}