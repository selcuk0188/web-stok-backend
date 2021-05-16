package com.stok.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DEPO")
public class KullaniciDepoYetki {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "depo_kodu")
    private Long depoKodu;

    @Column(name = "kullanici_id")
    private Long kullaniciId;

    @Column(name = "olusturma_tarihi")
    private Date olusturmaTarihi;


}
