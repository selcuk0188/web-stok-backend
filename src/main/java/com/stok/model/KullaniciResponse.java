package com.stok.model;

import com.stok.entities.Kullanici;

import java.util.List;

public class KullaniciResponse {

    private List<Kullanici> kullaniciList;

    public List<Kullanici> getKullaniciList() {
        return kullaniciList;
    }

    public void setKullaniciList(List<Kullanici> kullaniciList) {
        this.kullaniciList = kullaniciList;
    }
}
