package com.stok.service;

import com.stok.entities.Kullanici;
import com.stok.model.*;
import com.stok.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    public KullaniciResponse getKullaniciList(Integer rolId) {          // kullanici listesini rol id sine göre listeler
        KullaniciResponse response = new KullaniciResponse();
        List<Kullanici> byRolId = kullaniciRepository.findByRolId(rolId);
        response.setKullaniciList(byRolId);
        return response;
    }


    public KullaniciByIdResponse getKullaniciById(Integer kullaniciId) {        // kullanici id sine görekullanicilar listeler
        KullaniciByIdResponse response = new KullaniciByIdResponse();
        Optional<Kullanici> kullanici = kullaniciRepository.findById(kullaniciId);
        if (kullanici.isPresent())
            response.setKullanici(kullanici.get());
        return response;

    }

    public KullaniciResponse getKullaniciList() {       // kullancıların hepsini listeler
        KullaniciResponse response = new KullaniciResponse();
        List<Kullanici> kullaniciList = kullaniciRepository.findAll();
        response.setKullaniciList(kullaniciList);
        return response;

    }


    public LoginKullaniciResponse getKullanici(String tckn, String sifre) { // login sayfası için tckn ve şifre göre kullanıcı getirir
        LoginKullaniciResponse response = new LoginKullaniciResponse();
        Kullanici kullanici = kullaniciRepository.findByTcNoAndSifre(tckn, sifre);
        if (kullanici == null) {
            response.setBasariliMi(false);
        }
        response.setKullanici(kullanici);
        return response;
    }

    public KullaniciKayitResponse saveKullanici(Kullanici kullanici) { // kullanıcı kayıt eder
        KullaniciKayitResponse kullaniciKayitResponse = new KullaniciKayitResponse();
        kullaniciRepository.save(kullanici);
        return kullaniciKayitResponse;
    }


    public KullaniciGuncelleResponse updateKullanici(Kullanici kullanici) {
        KullaniciGuncelleResponse kullaniciGuncelleResponse = new KullaniciGuncelleResponse();
        if (kullanici != null) {
            Optional<Kullanici> kullanici_ = kullaniciRepository.findById(kullanici.getId());
            kullanici_.get().setKullaniciAdi(kullanici.getKullaniciAdi());
            //kullanici_.get().setRol(kullanici.getRol());
            kullanici_.get().setAdSoyad(kullanici.getAdSoyad());
            kullanici_.get().setDurum(kullanici.getDurum());
            kullanici_.get().setSifre(kullanici.getSifre());
            kullanici_.get().setTcNo(kullanici.getTcNo());
            kullaniciRepository.save(kullanici_.get());
        }
        kullaniciGuncelleResponse.setBasariliMi(true);
        return kullaniciGuncelleResponse;
    }

    public KullaniciSilResponse deleteKullanici(Integer kullaniciId) {
        KullaniciSilResponse kullaniciKayitResponse = new KullaniciSilResponse();
        Optional<Kullanici> kullanici_ = kullaniciRepository.findById(kullaniciId);
        if (kullanici_.isPresent()) {
            kullaniciRepository.deleteById(kullaniciId);
        }
        kullaniciKayitResponse.setBasariliMi(true);
        return kullaniciKayitResponse;
    }

}
