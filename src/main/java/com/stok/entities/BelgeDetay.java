package com.stok.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "belgedetay")
public class BelgeDetay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "stok_kodu")
    private Integer stokKodu;

    @Column(name = "barkod")
    private Integer barkod;

    @Column(name = "adet")
    private Integer adet;

    @Column(name = "birim_fiyat")
    private Double birimFiyat;

    @Column(name = "birim_tutar")
    private Double birimTutar;

    @Column(name = "toplam_tutar")
    private Double toplamTutar;

    @Column(name = "olusturan_kullanici")
    private String olusturanKullanici;

    @Column(name = "olusturma_tarihi")
    private Date olusturmaTarihi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStokKodu() {
        return stokKodu;
    }

    public void setStokKodu(Integer stokKodu) {
        this.stokKodu = stokKodu;
    }

    public Integer getBarkod() {
        return barkod;
    }

    public void setBarkod(Integer barkod) {
        this.barkod = barkod;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public Double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(Double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public Double getBirimTutar() {
        return birimTutar;
    }

    public void setBirimTutar(Double birimTutar) {
        this.birimTutar = birimTutar;
    }

    public Double getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(Double toplamTutar) {
        this.toplamTutar = toplamTutar;
    }

    public String getOlusturanKullanici() {
        return olusturanKullanici;
    }

    public void setOlusturanKullanici(String olusturanKullanici) {
        this.olusturanKullanici = olusturanKullanici;
    }

    public Date getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(Date olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
}
