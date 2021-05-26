package com.stok.service;

import com.stok.entities.Firma;
import com.stok.model.FirmaResponse;
import com.stok.repository.FirmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmaService {

    @Autowired
    private FirmaRepository firmaRepository;

    public FirmaResponse getFirma() {
        FirmaResponse response = new FirmaResponse();
        List<Firma> firmaList = firmaRepository.findAll();
        response.setFirmaList(firmaList);
        return response;

    }


}
