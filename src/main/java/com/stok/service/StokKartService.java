package com.stok.service;

import com.stok.entities.StokKart;
import com.stok.model.*;
import com.stok.repository.StokKartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StokKartService {

    @Autowired
    private StokKartRepository stokKartRepository;

    public StokKartListResponse getStokKartList(Integer stokKodu) {
        return null;
    }

    public StokKartListResponse getStokKartList() {
        StokKartListResponse response = new StokKartListResponse();
        List<StokKart> stokKartList = stokKartRepository.findAll();
        response.setStokKartList(stokKartList);
        return response;
    }

    public StokKartGuncelleResponse update(StokKartRequest request) {
        return null;
    }

    public StokKartSilResponse delete(Integer stokKartId) {
        StokKartSilResponse response = new StokKartSilResponse();
        response.setBasariliMi(true);
        stokKartRepository.deleteById(stokKartId);
        return response;
    }

    public StokKartKayitResponse save(StokKartRequest request) {
        StokKartKayitResponse response = new StokKartKayitResponse();
        response.setBasariliMi(true);
        StokKart stokKart = new StokKart();
        stokKart.setStokKodu(request.getStokKodu());
        stokKart.setStokAdi(request.getStokAdi());
        stokKart.setBarkod(request.getBarkod());
        stokKart.setDurum(request.getDurum());
        stokKart.setGrupKodu(request.getGrupKodu());
        stokKart.setOlusturmaTarihi(new Date());
        stokKartRepository.save(stokKart);
        return response;
    }
}
