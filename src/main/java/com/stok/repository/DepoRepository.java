package com.stok.repository;

import com.stok.entities.Depo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepoRepository extends JpaRepository<Depo, Integer> {

    Depo findByDepoKodu(Integer depoKodu);

}
