package cn.xhfc.rocketmusic.entity;

import java.util.Date;

public class User {
    private Integer uId;

    private String uName;

    private String uPwd;

    private Date uBirth;

    private String uNumber;

    private String uIcon;

    private Integer uSex;

    private Float uScore;

    private Float uMoney;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd == null ? null : uPwd.trim();
    }

    public Date getuBirth() {
        return uBirth;
    }

    public void setuBirth(Date uBirth) {
        this.uBirth = uBirth;
    }

    public String getuNumber() {
        return uNumber;
    }

    public void setuNumber(String uNumber) {
        this.uNumber = uNumber == null ? null : uNumber.trim();
    }

    public String getuIcon() {
        return uIcon;
    }

    public void setuIcon(String uIcon) {
        this.uIcon = uIcon == null ? null : uIcon.trim();
    }

    public Integer getuSex() {
        return uSex;
    }

    public void setuSex(Integer uSex) {
        this.uSex = uSex;
    }

    public Float getuScore() {
        return uScore;
    }

    public void setuScore(Float uScore) {
        this.uScore = uScore;
    }

    public Float getuMoney() {
        return uMoney;
    }

    public void setuMoney(Float uMoney) {
        this.uMoney = uMoney;
    }
}