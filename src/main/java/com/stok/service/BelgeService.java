package com.stok.service;

import com.stok.entities.Belge;
import com.stok.model.*;
import com.stok.repository.BelgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BelgeService {

    @Autowired
    private BelgeRepository belgeRepository;

    public BelgeListResponse getBelgeList(Integer belgeNo) {
        return null;
    }

    public BelgeListResponse getBelgeList() {
        BelgeListResponse response = new BelgeListResponse();
        List<Belge> belgeList = belgeRepository.findAll();
        response.setBelgeList(belgeList);
        return response;
    }

    public BelgeKayitResponse save(BelgeRequest request) {
        BelgeKayitResponse response = new BelgeKayitResponse();
        response.setBasariliMi(true);
        Belge belge = new Belge();
        belge.setBelgeNo(request.getBelgeNo());
        belge.setDepoKodu(request.getDepoKodu());
        belge.setFirmaNo(request.getFirmaNo());
        belge.setTur(request.getTur());
        belge.setBelgeTarihi(request.getBelgeTarihi());
        belge.setOlusturmaTarihi(new Date());
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
