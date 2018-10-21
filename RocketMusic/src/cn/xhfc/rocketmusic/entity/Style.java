package cn.xhfc.rocketmusic.entity;

public class Style {
    private Integer stId;

    private String stCaregory;

    private String stCaregory2;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStCaregory() {
        return stCaregory;
    }

    public void setStCaregory(String stCaregory) {
        this.stCaregory = stCaregory == null ? null : stCaregory.trim();
    }

    public String getStCaregory2() {
        return stCaregory2;
    }

    public void setStCaregory2(String stCaregory2) {
        this.stCaregory2 = stCaregory2 == null ? null : stCaregory2.trim();
    }
}