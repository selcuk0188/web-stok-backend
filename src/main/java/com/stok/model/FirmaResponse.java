package com.stok.model;

import com.stok.entities.Firma;

import java.util.List;

public class FirmaResponse {

    private List<Firma> firmaList;

    public List<Firma> getFirmaList() {
        return firmaList;
    }

    public void setFirmaList(List<Firma> firmaList) {
        this.firmaList = firmaList;
    }
}
