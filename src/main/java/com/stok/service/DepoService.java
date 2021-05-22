package com.stok.service;

import com.stok.entities.Depo;
import com.stok.model.*;
import com.stok.repository.DepoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DepoService {

    @Autowired
    private DepoRepository depoRepository;

    public DepoListResponse getDepoList(Integer kullaniciId) {
        return null;
    }

    public DepoListResponse getDepoList() {
        DepoListResponse response = new DepoListResponse();
        List<Depo> depoList = depoRepository.findAll();
        response.setDepoList(depoList);
        return response;
    }

    public DepoGuncelleResponse update(DepoRequest request) {
        return null;
    }

    public DepoSilResponse delete(Integer depoId) {
        DepoSilResponse response = new DepoSilResponse();
        response.setBasariliMi(true);
        depoRepository.deleteById(depoId);
        return response;
    }

    public DepoKayitResponse save(DepoRequest request) {
        DepoKayitResponse response = new DepoKayitResponse();
        response.setBasariliMi(true);
        Depo depo = new Depo();
        depo.setDepoAdi(request.getDepoAdi());
        depo.setDepoKodu(request.getDepoKodu());
        depo.setDurum(request.getDurum());
        depo.setOlusturmaTarihi(new Date());
        depoRepository.save(depo);
        return response;
    }
}
