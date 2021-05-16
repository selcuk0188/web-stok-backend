package com.stok.repository;

import com.stok.entities.KullaniciDepoYetki;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KulaniciDepoRepository extends JpaRepository<KullaniciDepoYetki, Integer> {
}
