package com.stok.service;

import com.stok.entities.BelgeDetay;
import com.stok.model.*;
import com.stok.repository.BelgeDetayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BelgeDetayService {

    @Autowired
    private BelgeDetayRepository belgeDetayRepository;

    public BelgeDetayListResponse getBelgeDetayList(Integer stokKodu) {
        return null;
    }

    public BelgeDetayListResponse getBelgeDetayList() {
        BelgeDetayListResponse response = new BelgeDetayListResponse();
        List<BelgeDetay> belgeDetayList = belgeDetayRepository.findAll();
        response.setBelgeDetayList(belgeDetayList);
        return response;
    }

    public BelgeDetayKayitResponse save(BelgeDetayRequest request) {
        BelgeDetayKayitResponse response = new BelgeDetayKayitResponse();
        response.setBasariliMi(true);
        BelgeDetay belgeDetay = new BelgeDetay();
        belgeDetay.setAdet(request.getAdet());
        belgeDetay.setBarkod(request.getBarkod());
        belgeDetay.setBirimTutar(request.getBirimTutar());
        belgeDetay.setOlusturanKullanici(request.getOlusturanKullanici());
        belgeDetay.setStokKodu(request.getStokKodu());
        belgeDetay.setToplamTutar(request.getBirimTutar() * request.getAdet());
        belgeDetay.setOlusturmaTarihi(new Date());
        belgeDetayRepository.save(belgeDetay);
        return response;
    }

    public BelgeDetayGuncelleResponse update(BelgeDetayRequest request) {
        return null;
    }

    public BelgeDetaySilResponse delete(Integer belgeDetayId) {
        BelgeDetaySilResponse response = new BelgeDetaySilResponse();
        response.setBasariliMi(true);
        belgeDetayRepository.deleteById(belgeDetayId);
        return response;
    }
}
