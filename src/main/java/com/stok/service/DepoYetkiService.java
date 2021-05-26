package com.stok.service;

import com.stok.entities.Depo;
import com.stok.entities.Kullanici;
import com.stok.entities.KullaniciDepoYetki;
import com.stok.model.*;
import com.stok.repository.DepoRepository;
import com.stok.repository.KullaniciDepoRepository;
import com.stok.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepoYetkiService {

    @Autowired
    private KullaniciDepoRepository kullaniciDepoRepository;

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @Autowired
    private DepoRepository depoRepository;

    public DepoYetkiListResponse getDepoYetkiList(Integer kullaniciId) {
        DepoYetkiListResponse response = new DepoYetkiListResponse();
        List<KullaniciDepoYetki> kullaniciDepoYetkiList = kullaniciDepoRepository.findByKullaniciId(kullaniciId);
        List<KullaniciDepoYetkiDto> kullaniciDepoYetkiDtoList = kullaniciDepoYetkiList.stream().map(e -> convert(e, true)).collect(Collectors.toList());
        response.setKullaniciDepoYetkiList(kullaniciDepoYetkiDtoList);
        return response;
    }

    public DepoYetkiListResponse getDepoYetkiList() {
        DepoYetkiListResponse response = new DepoYetkiListResponse();
        List<KullaniciDepoYetki> kullaniciDepoYetkiList = kullaniciDepoRepository.findAll();
        List<KullaniciDepoYetkiDto> kullaniciDepoYetkiDtoList = kullaniciDepoYetkiList.stream().map(e -> convert(e, false)).collect(Collectors.toList());
        response.setKullaniciDepoYetkiList(kullaniciDepoYetkiDtoList);
        return response;
    }

    private KullaniciDepoYetkiDto convert(KullaniciDepoYetki request, boolean isByKullaici) {
        KullaniciDepoYetkiDto response = new KullaniciDepoYetkiDto();
        response.setDepoKodu(request.getDepoKodu());
        response.setKullaniciId(request.getKullaniciId());
        response.setOlusturmaTarihi(request.getOlusturmaTarihi());
        response.setKullaniciId(request.getKullaniciId());
        if (!isByKullaici) {
            Optional<Kullanici> kullanici = kullaniciRepository.findById(request.getKullaniciId());
            response.setKullaniciAdiSoyad(kullanici.get().getAdSoyad());
        }
        Optional<Depo> byDepoKodu = depoRepository.findByDepoKodu(request.getDepoKodu());
        response.setDepoAdi(byDepoKodu.get().getDepoAdi());
        return response;
    }

    public DepoYetkiKayitResponse save(DepoYetkiRequest request) {
        DepoYetkiKayitResponse response = new DepoYetkiKayitResponse();
        response.setBasariliMi(true);
        Optional<KullaniciDepoYetki> o_kullaniciDepoYetki = kullaniciDepoRepository.findByKullaniciIdAndDepoKodu(request.getKullaniciId(), request.getDepoKodu());
        if (o_kullaniciDepoYetki.isPresent()) {
            response.setBasariliMi(false);
            return response;
        }
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
