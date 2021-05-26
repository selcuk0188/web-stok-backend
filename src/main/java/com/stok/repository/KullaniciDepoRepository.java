package com.stok.repository;

import com.stok.entities.KullaniciDepoYetki;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KullaniciDepoRepository extends JpaRepository<KullaniciDepoYetki, Integer> {

    List<KullaniciDepoYetki> findByKullaniciId(Integer kullaniciId);
}
