package com.stok.model;

import com.stok.entities.Kullanici;

public class LoginKullaniciResponse {

    private Kullanici kullanici;
    private boolean basariliMi = true;

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public boolean isBasariliMi() {
        return basariliMi;
    }

    public void setBasariliMi(boolean basariliMi) {
        this.basariliMi = basariliMi;
    }
}

