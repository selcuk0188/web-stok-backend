package com.stok.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STOKKART")
public class StokKart {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stok_kodu")
    private String stokKodu;

    @Column(name = "stok_adi")
    private Integer stokAdi;

    @Column(name = "barkod")
    private Integer barkod;

    @Column(name = "grup_kodu")
    private Integer grupKodu;

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

    public String getStokKodu() {
        return stokKodu;
    }

    public void setStokKodu(String stokKodu) {
        this.stokKodu = stokKodu;
    }

    public Integer getStokAdi() {
        return stokAdi;
    }

    public void setStokAdi(Integer stokAdi) {
        this.stokAdi = stokAdi;
    }

    public Integer getBarkod() {
        return barkod;
    }

    public void setBarkod(Integer barkod) {
        this.barkod = barkod;
    }

    public Integer getGrupKodu() {
        return grupKodu;
    }

    public void setGrupKodu(Integer grupKodu) {
        this.grupKodu = grupKodu;
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
