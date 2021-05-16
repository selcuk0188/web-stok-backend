package com.stok.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STOKGRUP")
public class StokGrup {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "depo_adi")
    private String depoAdi;

    @Column(name = "grup_kodu")
    private Integer depoKodu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
