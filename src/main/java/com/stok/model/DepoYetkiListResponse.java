package com.stok.model;

import com.stok.entities.KullaniciDepoYetki;

import java.util.List;

public class DepoYetkiListResponse {
    private List<KullaniciDepoYetki> kullaniciDepoYetkiList;

    public List<KullaniciDepoYetki> getKullaniciDepoYetkiList() {
        return kullaniciDepoYetkiList;
    }

    public void setKullaniciDepoYetkiList(List<KullaniciDepoYetki> kullaniciDepoYetkiList) {
        this.kullaniciDepoYetkiList = kullaniciDepoYetkiList;
    }
}
