package com.darkness.sparkwomen;

public class person {
    int img;
    String No;
    String des;

    public person(int img, String no, String des) {
        this.img = img;
        No = no;
        this.des = des;
    }

    public person(int first, int i, String des) {
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
