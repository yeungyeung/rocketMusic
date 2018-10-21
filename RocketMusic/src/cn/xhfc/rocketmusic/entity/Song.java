package cn.xhfc.rocketmusic.entity;

public class Song {
    private Integer soId;

    private String soName;

    private String soUrl;

    private Integer soSinger;

    private String soLyric;

    private Float soPrice;

    private String soInfo;

    public Integer getSoId() {
        return soId;
    }

    public void setSoId(Integer soId) {
        this.soId = soId;
    }

    public String getSoName() {
        return soName;
    }

    public void setSoName(String soName) {
        this.soName = soName == null ? null : soName.trim();
    }

    public String getSoUrl() {
        return soUrl;
    }

    public void setSoUrl(String soUrl) {
        this.soUrl = soUrl == null ? null : soUrl.trim();
    }

    public Integer getSoSinger() {
        return soSinger;
    }

    public void setSoSinger(Integer soSinger) {
        this.soSinger = soSinger;
    }

    public String getSoLyric() {
        return soLyric;
    }

    public void setSoLyric(String soLyric) {
        this.soLyric = soLyric == null ? null : soLyric.trim();
    }

    public Float getSoPrice() {
        return soPrice;
    }

    public void setSoPrice(Float soPrice) {
        this.soPrice = soPrice;
    }

    public String getSoInfo() {
        return soInfo;
    }

    public void setSoInfo(String soInfo) {
        this.soInfo = soInfo == null ? null : soInfo.trim();
    }
}