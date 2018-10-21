package cn.xhfc.rocketmusic.entity;

public class Llist {
    private Integer liId;

    private String liName;

    private Integer liSinger;

    private String liPicture;

    private String liInfo;

    public Integer getLiId() {
        return liId;
    }

    public void setLiId(Integer liId) {
        this.liId = liId;
    }

    public String getLiName() {
        return liName;
    }

    public void setLiName(String liName) {
        this.liName = liName == null ? null : liName.trim();
    }

    public Integer getLiSinger() {
        return liSinger;
    }

    public void setLiSinger(Integer liSinger) {
        this.liSinger = liSinger;
    }

    public String getLiPicture() {
        return liPicture;
    }

    public void setLiPicture(String liPicture) {
        this.liPicture = liPicture == null ? null : liPicture.trim();
    }

    public String getLiInfo() {
        return liInfo;
    }

    public void setLiInfo(String liInfo) {
        this.liInfo = liInfo == null ? null : liInfo.trim();
    }
}