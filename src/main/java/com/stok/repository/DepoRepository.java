package com.stok.repository;

import com.stok.entities.Depo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepoRepository extends JpaRepository<Depo, Integer> {

    Optional<Depo> findByDepoKodu(Integer depoKodu);

}
