package com.neuedu.pojo;

public class student {
    private int id;
    private int sno;
    private String sname;
    private int sage;
    private String ssex;
    private int sheight;
    private int sweidht;
    private String sbirthday;
    private String spsw;
    private int sflag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSheight() {
        return sheight;
    }

    public void setSheight(int sheight) {
        this.sheight = sheight;
    }

    public int getSweidht() {
        return sweidht;
    }

    public void setSweidht(int sweidht) {
        this.sweidht = sweidht;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSpsw() {
        return spsw;
    }

    public void setSpsw(String spsw) {
        this.spsw = spsw;
    }

    public int getSflag() {
        return sflag;
    }

    public void setSflag(int sflag) {
        this.sflag = sflag;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", sno=" + sno +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", ssex='" + ssex + '\'' +
                ", sheight=" + sheight +
                ", sweidht=" + sweidht +
                ", sbirthday='" + sbirthday + '\'' +
                ", spsw='" + spsw + '\'' +
                ", sflag=" + sflag +
                '}';
    }
}
