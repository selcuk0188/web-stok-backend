package com.stok.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STOKGRUP")
public class StokGrup {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "grup_adi")
    private String grupAdi;

    @Column(name = "grup_kodu")
    private Integer grupKodu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrupAdi() {
        return grupAdi;
    }

    public void setGrupAdi(String grupAdi) {
        this.grupAdi = grupAdi;
    }

    public Integer getGrupKodu() {
        return grupKodu;
    }

    public void setGrupKodu(Integer grupKodu) {
        this.grupKodu = grupKodu;
    }
}
