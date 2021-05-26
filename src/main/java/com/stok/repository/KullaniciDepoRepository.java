package com.stok.repository;

import com.stok.entities.KullaniciDepoYetki;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface KullaniciDepoRepository extends JpaRepository<KullaniciDepoYetki, Integer> {

    List<KullaniciDepoYetki> findByKullaniciId(Integer kullaniciId);

    Optional<KullaniciDepoYetki> findByKullaniciIdAndDepoKodu(Integer kullaniciId, Integer depoKodu);
}
