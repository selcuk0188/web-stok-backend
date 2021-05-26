package com.stok.model;

import java.util.Date;

public class DepoRequest {

    private String depoAdi;
    private Integer depoKodu;
    private Integer depoDurum;
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

    public Integer getDepoDurum() {
        return depoDurum;
    }

    public void setDepoDurum(Integer depoDurum) {
        this.depoDurum = depoDurum;
    }

    public Date getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(Date olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
}
