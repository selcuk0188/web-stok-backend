package com.stok.controller;


import com.stok.model.*;
import com.stok.service.StokKartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/stok-kart")
public class StokKartController {

    @Autowired
    private StokKartService stokKartService;

    @RequestMapping(value = "/listele/stok-kodu", method = RequestMethod.POST)
    public StokKartListResponse getStokKartList(@RequestParam("stokKodu") Integer stokKodu) {
        return stokKartService.getStokKartList(stokKodu);
    }

    @RequestMapping(value = "/listele", method = RequestMethod.POST)
    public StokKartListResponse getStokKartListByDurum(@RequestParam("durum") Integer durum) {
        return stokKartService.getStokKartListByDurum(durum);
    }

    @RequestMapping(value = "/kayit", method = RequestMethod.POST)
    public StokKartKayitResponse save(@RequestBody StokKartRequest request) {
        return stokKartService.save(request);
    }

    @RequestMapping(value = "/guncelle", method = RequestMethod.POST)
    public StokKartGuncelleResponse update(@RequestBody StokKartRequest request) {
        return stokKartService.update(request);
    }

    @RequestMapping(value = "/sil", method = RequestMethod.POST)
    public StokKartSilResponse delete(@RequestParam("stokKartId") Integer stokKartId) {
        return stokKartService.delete(stokKartId);
    }

    @RequestMapping(value = "/grup/listele", method = RequestMethod.POST)
    public StokGrupListResponse getStokGrupList() {
        return stokKartService.getStokGrupList();
    }

}
