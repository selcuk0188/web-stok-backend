package com.stok.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DEPO")
public class Depo {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "depo_adi")
    private String depoAdi;

    @Column(name = "depo_kodu")
    private Integer depoKodu;

    @Column(name = "durum")
    private Integer durum;

    @Column(name = "olusturma_tarihi")
    private Date olusturmaTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
