package com.stok.repository;

import com.stok.entities.Belge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BelgeRepository extends JpaRepository<Belge, Integer> {

    Optional<Belge> findByBelgeNo(Integer belgeNo);

    List<Belge> findByDepoKodu(Integer depoKodu);
}
