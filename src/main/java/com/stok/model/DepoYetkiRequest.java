package com.stok.model;

import javax.persistence.Column;
import java.util.Date;

public class DepoYetkiRequest {

    private Integer depoKodu;
    private Integer kullaniciId;
    private Date olusturmaTarihi;

    public Integer getDepoKodu() {
        return depoKodu;
    }

    public void setDepoKodu(Integer depoKodu) {
        this.depoKodu = depoKodu;
    }

    public Integer getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public Date getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(Date olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
}
