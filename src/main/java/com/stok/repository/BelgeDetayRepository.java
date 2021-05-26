package com.stok.repository;

import com.stok.entities.BelgeDetay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BelgeDetayRepository extends JpaRepository<BelgeDetay, Integer> {

    List<BelgeDetay> findByBelgeNo(Integer belgeNo);
}
