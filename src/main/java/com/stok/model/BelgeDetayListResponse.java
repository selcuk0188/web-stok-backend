package com.stok.model;

import com.stok.entities.BelgeDetay;

import java.util.List;

public class BelgeDetayListResponse {

    private List<BelgeDetay> belgeDetayList;

    public List<BelgeDetay> getBelgeDetayList() {
        return belgeDetayList;
    }

    public void setBelgeDetayList(List<BelgeDetay> belgeDetayList) {
        this.belgeDetayList = belgeDetayList;
    }
}
