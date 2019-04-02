package com.example.user.tugas6sharedpreference;

public class KontrolModel {
    String namaOrang;
    int picOrang;

    public KontrolModel(String namaOrang, int picOrang){
        this.namaOrang= namaOrang;
        this.picOrang = picOrang;
    }
    public String getNamaKampus() {
        return namaOrang;
    }
    public int getPicKampus() {
        return picOrang;
    }

}
