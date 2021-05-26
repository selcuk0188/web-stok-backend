package com.stok.controller;


import com.stok.model.FirmaResponse;
import com.stok.service.FirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firma")
public class FirmaController {

    @Autowired
    private FirmaService firmaService;

    @RequestMapping(value = "/listele", method = RequestMethod.POST)
    public FirmaResponse firmaListele() {
        return firmaService.getFirma();
    }
}
