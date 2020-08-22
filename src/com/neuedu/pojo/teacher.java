package com.neuedu.pojo;

public class teacher {
    private int id;
    private String tname;
    private String tpsw;
    private int tflag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTpsw() {
        return tpsw;
    }

    public void setTpsw(String tpsw) {
        this.tpsw = tpsw;
    }

    public int getTflag() {
        return tflag;
    }

    public void setTflag(int tflag) {
        this.tflag = tflag;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", tpsw='" + tpsw + '\'' +
                ", tflag=" + tflag +
                '}';
    }
}
