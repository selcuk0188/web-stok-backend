package com.stok.controller;


import com.stok.model.*;
import com.stok.service.BelgeDetayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/belge-detay")
public class BelgeDetayController {

    @Autowired
    private BelgeDetayService belgeDetayService;

    @RequestMapping(value = "/listele/stok-kodu", method = RequestMethod.POST)
    public BelgeDetayListResponse getBelgeDetayList(@RequestParam("stokKodu") Integer stokKodu) {
        return belgeDetayService.getBelgeDetayList(stokKodu);
    }

    @RequestMapping(value = "/listele", method = RequestMethod.POST)
    public BelgeDetayListResponse getBelgeDetayList() {
        return belgeDetayService.getBelgeDetayList();
    }

    @RequestMapping(value = "/kayit", method = RequestMethod.POST)
    public BelgeDetayKayitResponse save(@RequestBody BelgeDetayListRequest request) {
        return belgeDetayService.save(request);
    }

    @RequestMapping(value = "/guncelle", method = RequestMethod.POST)
    public BelgeDetayGuncelleResponse update(@RequestBody BelgeDetayDto request) {
        return belgeDetayService.update(request);
    }

    @RequestMapping(value = "/sil", method = RequestMethod.POST)
    public BelgeDetaySilResponse delete(@RequestParam("belgeDetayId") Integer belgeDetayId) {
        return belgeDetayService.delete(belgeDetayId);
    }

}
