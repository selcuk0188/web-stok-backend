package com.stok.controller;


import com.stok.model.RolResponse;
import com.stok.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @RequestMapping(value = "/listele", method = RequestMethod.POST)  // rolleri listeler
    public RolResponse rolListele() {
        return rolService.getRol();
    }
}
