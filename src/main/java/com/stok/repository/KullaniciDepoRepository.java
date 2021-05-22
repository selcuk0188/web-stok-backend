package com.stok.repository;

import com.stok.entities.KullaniciDepoYetki;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciDepoRepository extends JpaRepository<KullaniciDepoYetki, Integer> {
}
