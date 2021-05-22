package com.stok.model;

import com.stok.entities.Belge;

import java.util.List;

public class BelgeListResponse {

    private List<Belge> belgeList;

    public List<Belge> getBelgeList() {
        return belgeList;
    }

    public void setBelgeList(List<Belge> belgeList) {
        this.belgeList = belgeList;
    }
}
