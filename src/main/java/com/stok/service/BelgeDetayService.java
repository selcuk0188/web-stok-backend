package com.stok.service;

import com.stok.entities.BelgeDetay;
import com.stok.model.*;
import com.stok.repository.BelgeDetayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
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

    public BelgeDetayKayitResponse save(BelgeDetayListRequest request) {
        BelgeDetayKayitResponse response = new BelgeDetayKayitResponse();
        response.setBasariliMi(true);
        List<BelgeDetayDto> belgeDetayList = request.getBelgeDetayList();
        for (BelgeDetayDto dto : belgeDetayList) {
            BelgeDetay belgeDetay = new BelgeDetay();
            belgeDetay.setAdet(dto.getAdet());
            belgeDetay.setBarkod(dto.getBarkod());
            belgeDetay.setBirimTutar(dto.getBirimTutar());
            belgeDetay.setOlusturanKullanici(dto.getOlusturanKullanici());
            belgeDetay.setStokKodu(dto.getStokKodu());
            belgeDetay.setToplamTutar(dto.getBirimTutar() * dto.getAdet());
            belgeDetay.setOlusturmaTarihi(new Date(System.currentTimeMillis()));
            belgeDetayRepository.save(belgeDetay);
        }
        return response;
    }

    public BelgeDetayGuncelleResponse update(BelgeDetayDto request) {
        return null;
    }

    public BelgeDetaySilResponse delete(Integer belgeDetayId) {
        BelgeDetaySilResponse response = new BelgeDetaySilResponse();
        response.setBasariliMi(true);
        belgeDetayRepository.deleteById(belgeDetayId);
        return response;
    }
}
