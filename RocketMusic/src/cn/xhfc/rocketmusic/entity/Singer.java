package cn.xhfc.rocketmusic.entity;

import java.util.Date;

public class Singer {
    private Integer sId;

    private String sName;

    private Integer sSex;

    private Date sBirth;

    private String sNationality;

    private String sIcon;

    private String sIdcard;

    private String sInfo;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsSex() {
        return sSex;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }

    public Date getsBirth() {
        return sBirth;
    }

    public void setsBirth(Date sBirth) {
        this.sBirth = sBirth;
    }

    public String getsNationality() {
        return sNationality;
    }

    public void setsNationality(String sNationality) {
        this.sNationality = sNationality == null ? null : sNationality.trim();
    }

    public String getsIcon() {
        return sIcon;
    }

    public void setsIcon(String sIcon) {
        this.sIcon = sIcon == null ? null : sIcon.trim();
    }

    public String getsIdcard() {
        return sIdcard;
    }

    public void setsIdcard(String sIdcard) {
        this.sIdcard = sIdcard == null ? null : sIdcard.trim();
    }

    public String getsInfo() {
        return sInfo;
    }

    public void setsInfo(String sInfo) {
        this.sInfo = sInfo == null ? null : sInfo.trim();
    }
}