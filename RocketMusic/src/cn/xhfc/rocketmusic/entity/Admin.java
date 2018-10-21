package cn.xhfc.rocketmusic.entity;

public class Admin {
    private Integer adId;

    private String adName;

    private String adPwd;

    private String adPicture;

    private String adLimit;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdPwd() {
        return adPwd;
    }

    public void setAdPwd(String adPwd) {
        this.adPwd = adPwd == null ? null : adPwd.trim();
    }

    public String getAdPicture() {
        return adPicture;
    }

    public void setAdPicture(String adPicture) {
        this.adPicture = adPicture == null ? null : adPicture.trim();
    }

    public String getAdLimit() {
        return adLimit;
    }

    public void setAdLimit(String adLimit) {
        this.adLimit = adLimit == null ? null : adLimit.trim();
    }
}