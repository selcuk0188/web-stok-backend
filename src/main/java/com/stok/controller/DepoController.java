package com.stok.controller;


import com.stok.model.*;
import com.stok.service.DepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController("/depo")
public class DepoController {

    @Autowired
    private DepoService depoService;

    @RequestMapping(value = "/listele", method = RequestMethod.POST)
    public DepoListResponse getDepoList(@RequestParam("kullaniciId") Integer kullaniciId) {
        return depoService.getDepoList(kullaniciId);
    }

    @RequestMapping(value = "/kayit", method = RequestMethod.POST)
    public DepoKayitResponse save(@RequestBody DepoRequest request) {
        return depoService.save(request);
    }

    @RequestMapping(value = "/guncelle", method = RequestMethod.POST)
    public DepoGuncelleResponse update(@RequestBody DepoRequest request) {
        return depoService.update(request);
    }

    @RequestMapping(value = "/sil", method = RequestMethod.POST)
    public DepoSilResponse delete(@RequestParam("depoId") Integer kullaniciId) {
        return depoService.delete(kullaniciId);
    }

}
