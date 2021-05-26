package com.stok.service;

import com.stok.entities.StokGrup;
import com.stok.entities.StokKart;
import com.stok.model.*;
import com.stok.repository.StokGrupRepository;
import com.stok.repository.StokKartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class StokKartService {

    @Autowired
    private StokKartRepository stokKartRepository;

    @Autowired
    private StokGrupRepository stokGrupRepository;

    public StokKartListResponse getStokKartList(Integer stokKodu) {
        return null;
    }

    public StokKartListResponse getStokKartListByDurum(Integer durum) {
        StokKartListResponse response = new StokKartListResponse();
        List<StokKart> stokKartList = stokKartRepository.findAll();
        if (durum == 1) {
            List<StokKart> stokKarts = new ArrayList<>();
            for (StokKart sk : stokKartList) {
                if (sk.getDurum() == 1) {
                    stokKarts.add(sk);
                }
            }
            response.setStokKartList(stokKarts);
        } else {
            response.setStokKartList(stokKartList);
        }
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
        stokKart.setOlusturmaTarihi(new Date(System.currentTimeMillis()));
        stokKartRepository.save(stokKart);
        return response;
    }

    public StokGrupListResponse getStokGrupList() {
        StokGrupListResponse response = new StokGrupListResponse();
        List<StokGrup> stokGrupList = stokGrupRepository.findAll();
        response.setStokGrupList(stokGrupList);
        return response;
    }
}
