package com.stok.controller;


import com.stok.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController("/belge")
public class BelgeController {

    @Autowired
    private BelgeService belgeService;

    @RequestMapping(value = "/listele", method = RequestMethod.POST)
    public BelgeListResponse getBelgeList(@RequestParam("belgeNo") Integer belgeNo) {
        return belgeService.getBelgeList(belgeNo);
    }

    @RequestMapping(value = "/kayit", method = RequestMethod.POST)
    public BelgeKayitResponse save(@RequestBody BelgeRequest request) {
        return belgeService.save(request);
    }

    @RequestMapping(value = "/guncelle", method = RequestMethod.POST)
    public BelgeGuncelleResponse update(@RequestBody BelgeRequest request) {
        return belgeService.update(request);
    }

    @RequestMapping(value = "/sil", method = RequestMethod.POST)
    public BelgeSilResponse delete(@RequestParam("belgeId") Integer belgeId) {
        return belgeService.delete(belgeId);
    }

}
