package com.example.kt2;

public class ca {
    private String tenkhoahoc;
    private String tenthuonggoi;
    private String dactinh;
    private String mausac;

    public ca() {
    }

    public ca(String tenkhoahoc, String tenthuonggoi, String dactinh, String mausac) {
        this.tenkhoahoc = tenkhoahoc;
        this.tenthuonggoi = tenthuonggoi;
        this.dactinh = dactinh;
        this.mausac = mausac;
    }

    public String getTenkhoahoc() {
        return tenkhoahoc;
    }

    public void setTenkhoahoc(String tenkhoahoc) {
        this.tenkhoahoc = tenkhoahoc;
    }

    public String getTenthuonggoi() {
        return tenthuonggoi;
    }

    public void setTenthuonggoi(String tenthuonggoi) {
        this.tenthuonggoi = tenthuonggoi;
    }

    public String getDactinh() {
        return dactinh;
    }

    public void setDactinh(String dactinh) {
        this.dactinh = dactinh;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    @Override
    public String toString() {
        return "ca{" +
                "tenkhoahoc='" + tenkhoahoc + '\'' +
                ", tenthuonggoi='" + tenthuonggoi + '\'' +
                ", dactinh='" + dactinh + '\'' +
                ", mausac='" + mausac + '\'' +
                '}';
    }
}
