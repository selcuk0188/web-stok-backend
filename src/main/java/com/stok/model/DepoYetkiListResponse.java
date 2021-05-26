package com.stok.model;

import java.util.List;

public class DepoYetkiListResponse {
    private List<KullaniciDepoYetkiDto> kullaniciDepoYetkiList;

    public List<KullaniciDepoYetkiDto> getKullaniciDepoYetkiList() {
        return kullaniciDepoYetkiList;
    }

    public void setKullaniciDepoYetkiList(List<KullaniciDepoYetkiDto> kullaniciDepoYetkiList) {
        this.kullaniciDepoYetkiList = kullaniciDepoYetkiList;
    }
}
