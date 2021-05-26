package com.stok.entities;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "firma")
public class Firma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firma_no")
    private Integer firmaNo;

    @Column(name = "firma_adi")
    private String firmaAdi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirmaNo() {
        return firmaNo;
    }

    public void setFirmaNo(Integer firmaNo) {
        this.firmaNo = firmaNo;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }
}
