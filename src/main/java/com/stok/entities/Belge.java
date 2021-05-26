package com.stok.entities;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "belge")
public class Belge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "depo_kodu")
    private Integer depoKodu;

    @Column(name = "belge_no")
    private Integer belgeNo;

    @Column(name = "firma_no")
    private Integer firmaNo;

    @Column(name = "belge_tarihi")
    private String belgeTarihi;

    @Column(name = "tur")
    private Integer tur;

    @Column(name = "olusturma_tarihi")
    private Date olusturmaTarihi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getBelgeTarihi() {
        return belgeTarihi;
    }

    public void setBelgeTarihi(String belgeTarihi) {
        this.belgeTarihi = belgeTarihi;
    }

    public Integer getTur() {
        return tur;
    }

    public void setTur(Integer tur) {
        this.tur = tur;
    }

    public Date getOlusturmaTarihi() {
        return olusturmaTarihi;
    }

    public void setOlusturmaTarihi(Date olusturmaTarihi) {
        this.olusturmaTarihi = olusturmaTarihi;
    }
}
