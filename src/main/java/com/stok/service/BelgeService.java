package com.stok.service;

import com.stok.entities.Belge;
import com.stok.entities.Kullanici;
import com.stok.entities.KullaniciDepoYetki;
import com.stok.model.*;
import com.stok.repository.BelgeRepository;
import com.stok.repository.KullaniciDepoRepository;
import com.stok.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BelgeService {

    @Autowired
    private BelgeRepository belgeRepository;

    @Autowired
    private KullaniciDepoRepository kullaniciDepoRepository;

    @Autowired
    private KullaniciRepository kullaniciRepository;


    public BelgeListResponse getBelgeListByUserId(Integer kullaniciId) {
        BelgeListResponse response = new BelgeListResponse();
        List<Belge> belgeList = new ArrayList<>();
        Optional<Kullanici> kullanici = kullaniciRepository.findById(kullaniciId);
        if (kullanici.get().getRolId() == 2) {
            List<KullaniciDepoYetki> kullaniciDepoYetkiList = kullaniciDepoRepository.findByKullaniciId(kullaniciId);
            for (KullaniciDepoYetki k : kullaniciDepoYetkiList) {
                List<Belge> belgeList1 = belgeRepository.findByDepoKodu(k.getDepoKodu());
                belgeList.addAll(belgeList1);
            }
        } else {
            belgeList = belgeRepository.findAll();
        }
        response.setBelgeList(belgeList);
        return response;
    }

    public BelgeKayitResponse save(BelgeRequest request) {
        BelgeKayitResponse response = new BelgeKayitResponse();
        response.setBasariliMi(true);
        Optional<Belge> o_belge = belgeRepository.findByBelgeNo(request.getBelgeNo());
        if (o_belge.isPresent()) {
            response.setBasariliMi(false);
            return response;
        }
        Belge belge = new Belge();
        belge.setBelgeNo(request.getBelgeNo());
        belge.setDepoKodu(request.getDepoKodu());
        belge.setFirmaNo(request.getFirmaNo());
        belge.setTur(request.getTur());
        belge.setBelgeTarihi(request.getBelgeTarihi());
        belge.setOlusturmaTarihi(new Date(System.currentTimeMillis()));
        belgeRepository.save(belge);
        return response;
    }

    public BelgeGuncelleResponse update(BelgeRequest request) {
        return null;
    }

    public BelgeSilResponse delete(Integer belgeId) {
        BelgeSilResponse response = new BelgeSilResponse();
        response.setBasariliMi(true);
        belgeRepository.deleteById(belgeId);
        return response;
    }
}
