package cn.xhfc.rocketmusic.entity;

public class Album {
    private Integer alId;

    private String alName;

    private Integer alSinger;

    private Float alPrice;

    private String alPicture;

    private String alInfo;

    public Integer getAlId() {
        return alId;
    }

    public void setAlId(Integer alId) {
        this.alId = alId;
    }

    public String getAlName() {
        return alName;
    }

    public void setAlName(String alName) {
        this.alName = alName == null ? null : alName.trim();
    }

    public Integer getAlSinger() {
        return alSinger;
    }

    public void setAlSinger(Integer alSinger) {
        this.alSinger = alSinger;
    }

    public Float getAlPrice() {
        return alPrice;
    }

    public void setAlPrice(Float alPrice) {
        this.alPrice = alPrice;
    }

    public String getAlPicture() {
        return alPicture;
    }

    public void setAlPicture(String alPicture) {
        this.alPicture = alPicture == null ? null : alPicture.trim();
    }

    public String getAlInfo() {
        return alInfo;
    }

    public void setAlInfo(String alInfo) {
        this.alInfo = alInfo == null ? null : alInfo.trim();
    }
}