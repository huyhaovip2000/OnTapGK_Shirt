package com.example.listernershirt;

public class Ao {
    private String tvName;
    private String tvGia;
    private int imagebutton;

    public Ao(){

    }
    public Ao(String tvName, String tvGia, int imagebutton) {
        this.tvName = tvName;
        this.tvGia = tvGia;
        this.imagebutton = imagebutton;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvGia() {
        return tvGia;
    }

    public void setTvGia(String tvGia) {
        this.tvGia = tvGia;
    }

    public int getImagebutton() {
        return imagebutton;
    }

    public void setImagebutton(int imagebutton) {
        this.imagebutton = imagebutton;
    }
}
