package com.stok.service;

import com.stok.entities.KullaniciDepoYetki;
import com.stok.model.*;
import com.stok.repository.KullaniciDepoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DepoYetkiService {

    @Autowired
    private KullaniciDepoRepository kullaniciDepoRepository;

    public DepoYetkiListResponse getDepoYetkiList(Long depoKodu) {
        return null;
    }

    public DepoYetkiListResponse getDepoYetkiList() {
        DepoYetkiListResponse response = new DepoYetkiListResponse();
        List<KullaniciDepoYetki> kullaniciDepoYetkiList = kullaniciDepoRepository.findAll();
        response.setKullaniciDepoYetkiList(kullaniciDepoYetkiList);
        return response;
    }

    public DepoYetkiKayitResponse save(DepoYetkiRequest request) {
        DepoYetkiKayitResponse response = new DepoYetkiKayitResponse();
        response.setBasariliMi(true);
        KullaniciDepoYetki kullaniciDepoYetki = new KullaniciDepoYetki();
        kullaniciDepoYetki.setDepoKodu(request.getDepoKodu());
        kullaniciDepoYetki.setKullaniciId(request.getKullaniciId());
        kullaniciDepoYetki.setOlusturmaTarihi(new Date());
        kullaniciDepoRepository.save(kullaniciDepoYetki);
        return response;
    }

    public DepoYetkiGuncelleResponse update(DepoYetkiRequest request) {
        return null;
    }

    public DepoYetkiSilResponse delete(Integer depoYetkiId) {
        DepoYetkiSilResponse response = new DepoYetkiSilResponse();
        response.setBasariliMi(true);
        kullaniciDepoRepository.deleteById(depoYetkiId);
        return response;
    }
}
