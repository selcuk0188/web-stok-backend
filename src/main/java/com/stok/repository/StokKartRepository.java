package com.stok.repository;

import com.stok.entities.StokKart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StokKartRepository extends JpaRepository<StokKart, Integer> {

    Optional<StokKart> findByStokKodu(Integer stokKodu);
}
