package com.stok.model;

import java.sql.Date;

public class KullaniciDepoYetkiDto {
    private Integer depoKodu;
    private Integer kullaniciId;
    private String kullaniciAdiSoyad;
    private String depoAdi;
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

    public String getKullaniciAdiSoyad() {
        return kullaniciAdiSoyad;
    }

    public void setKullaniciAdiSoyad(String kullaniciAdiSoyad) {
        this.kullaniciAdiSoyad = kullaniciAdiSoyad;
    }

    public String getDepoAdi() {
        return depoAdi;
    }

    public void setDepoAdi(String depoAdi) {
        this.depoAdi = depoAdi;
    }

    public Date getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(Date olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
}
