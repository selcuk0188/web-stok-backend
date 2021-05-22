package com.stok.model;

import com.stok.entities.Depo;

import java.util.List;

public class DepoListResponse {

    private List<Depo> depoList;

    public List<Depo> getDepoList() {
        return depoList;
    }

    public void setDepoList(List<Depo> depoList) {
        this.depoList = depoList;
    }
}
