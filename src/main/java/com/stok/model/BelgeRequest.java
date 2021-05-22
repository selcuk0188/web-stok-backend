package com.stok.model;

import java.util.Date;

public class BelgeRequest {

    private Integer depoKodu;
    private Integer belgeNo;
    private Integer firmaNo;
    private Date belgeTarihi;
    private Integer tur;

    public Integer getDepoKodu() {
        return depoKodu;
    }

    public void setDepoKodu(Integer depoKodu) {
        this.depoKodu = depoKodu;
    }

    public Integer getBelgeNo() {
        return belgeNo;
    }

    public void setBelgeNo(Integer belgeNo) {
        this.belgeNo = belgeNo;
    }

    public Integer getFirmaNo() {
        return firmaNo;
    }

    public void setFirmaNo(Integer firmaNo) {
        this.firmaNo = firmaNo;
    }

    public Date getBelgeTarihi() {
        return belgeTarihi;
    }

    public void setBelgeTarihi(Date belgeTarihi) {
        this.belgeTarihi = belgeTarihi;
    }

    public Integer getTur() {
        return tur;
    }

    public void setTur(Integer tur) {
        this.tur = tur;
    }

}
