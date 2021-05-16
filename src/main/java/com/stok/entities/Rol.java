package com.stok.entities;


import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "rol_adi")
    private String roladi;

    @Column(name = "rol_yetki")
    private String rolyetki;

    @Column(name = "rol_tanim")
    private String roltanim;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoladi() {
        return roladi;
    }

    public void setRoladi(String roladi) {
        this.roladi = roladi;
    }

    public String getRolyetki() {
        return rolyetki;
    }

    public void setRolyetki(String rolyetki) {
        this.rolyetki = rolyetki;
    }

    public String getRoltanim() {
        return roltanim;
    }

    public void setRoltanim(String roltanim) {
        this.roltanim = roltanim;
    }
}
