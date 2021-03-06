package com.stok.controller;


import com.stok.model.*;
import com.stok.service.DepoYetkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/depo-yetki")
public class DepoYetkiController {

    @Autowired
    private DepoYetkiService depoYetkiService;

    @RequestMapping(value = "/listele/kullanici", method = RequestMethod.POST)
    public DepoYetkiListResponse getDepoYetkiList(@RequestParam("kullaniciId") Integer kullaniciId) {
        return depoYetkiService.getDepoYetkiList(kullaniciId);
    }

    @RequestMapping(value = "/listele", method = RequestMethod.POST)
    public DepoYetkiListResponse getDepoYetkiAllList() {
        return depoYetkiService.getDepoYetkiAllList();
    }

    @RequestMapping(value = "/kayit", method = RequestMethod.POST)
    public DepoYetkiKayitResponse save(@RequestBody DepoYetkiRequest request) {
        return depoYetkiService.save(request);
    }

    @RequestMapping(value = "/guncelle", method = RequestMethod.POST)
    public DepoYetkiGuncelleResponse update(@RequestBody DepoYetkiRequest request) {
        return depoYetkiService.update(request);
    }

    @RequestMapping(value = "/sil", method = RequestMethod.POST)
    public DepoYetkiSilResponse delete(@RequestParam("depoYetkiId") Integer depoYetkiId) {
        return depoYetkiService.delete(depoYetkiId);
    }

}
