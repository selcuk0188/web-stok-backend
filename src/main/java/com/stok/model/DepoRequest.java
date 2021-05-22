package com.stok.model;

import java.util.Date;

public class DepoRequest {

    private String depoAdi;
    private Integer depoKodu;
    private Integer durum;
    private Date olusturmaTarihi;

    public String getDepoAdi() {
        return depoAdi;
    }

    public void setDepoAdi(String depoAdi) {
        this.depoAdi = depoAdi;
    }

    public Integer getDepoKodu() {
        return depoKodu;
    }

    public void setDepoKodu(Integer depoKodu) {
        this.depoKodu = depoKodu;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }

    public Date getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(Date olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
}
