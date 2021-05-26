package com.stok.repository;

import com.stok.entities.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface KullaniciRepository extends JpaRepository<Kullanici, Integer> {

    Kullanici findByKullaniciAdiAndSifre(String kullaniciAdi, String sifre);

    Optional<Kullanici> findByKullaniciAdiOrTcNo(String kullaniciAdi, String tcno);

    List<Kullanici> findByRolId(Integer rolId);

    List<Kullanici> findByTcNo(String tcNo);

}
