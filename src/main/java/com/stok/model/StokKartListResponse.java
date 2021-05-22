package com.stok.model;

import com.stok.entities.StokKart;

import java.util.List;

public class StokKartListResponse {

    private List<StokKart> stokKartList;

    public List<StokKart> getStokKartList() {
        return stokKartList;
    }

    public void setStokKartList(List<StokKart> stokKartList) {
        this.stokKartList = stokKartList;
    }
}
