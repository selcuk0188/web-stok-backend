package com.stok.controller;


import com.stok.entities.Kullanici;
import com.stok.model.*;
import com.stok.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/kullanici")
public class KullaniciController {

    @Autowired
    private KullaniciService kullaniciService;

    @RequestMapping(value = "/id", method = RequestMethod.POST)           // Kullanici Id'sine göre kullanicilari listeler
    public KullaniciByIdResponse getKullaniciById(@RequestParam("kullaniciId") Integer kullaniciId) {
        return kullaniciService.getKullaniciById(kullaniciId);
    }

    @RequestMapping(value = "/listele", method = RequestMethod.POST)  // Kullanicilarin hepsini listeler
    public KullaniciResponse kullaniciListele() {
        return kullaniciService.getKullaniciList();
    }

    @RequestMapping(value = "/listele/rol", method = RequestMethod.POST)   // Kullanicilari rol id'sine göre listeler
    public KullaniciResponse kullaniciListeleByRol(@RequestParam("rolId") Integer rolId) {
        return kullaniciService.getKullaniciList(rolId);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST) // Kullanicilarin login kontrolünü yapıp kullanici bilgilerini döner
    public LoginKullaniciResponse kullaniciLogin(@RequestParam("kullaniciAdi") String kullaniciAdi, @RequestParam("sifre") String sifre) {
        return kullaniciService.getKullanici(kullaniciAdi, sifre);
    }

    @RequestMapping(value = "/kayit", method = RequestMethod.POST)     // kullanicinin kayit edilmesini sağlar
    public KullaniciKayitResponse kullaniciKayit(@RequestBody Kullanici kullanici) {
        return kullaniciService.saveKullanici(kullanici);
    }

    @RequestMapping(value = "/guncelle", method = RequestMethod.POST) // kullanici bilgilerine göre kullaniciyi günceller
    public KullaniciGuncelleResponse kullaniciGuncelle(@RequestBody Kullanici kullanici) {
        return kullaniciService.updateKullanici(kullanici);
    }

    @RequestMapping(value = "/sil", method = RequestMethod.POST)  // kullanici id'sine göre kullaniciyi siler
    public KullaniciSilResponse kullaniciSil(@RequestParam("kullaniciId") Integer kullaniciId) {
        return kullaniciService.deleteKullanici(kullaniciId);
    }

}
