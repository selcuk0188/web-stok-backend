package com.stok.service;

import com.stok.entities.Depo;
import com.stok.model.*;
import com.stok.repository.DepoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepoService {

    @Autowired
    private DepoRepository depoRepository;

    public DepoListResponse getDepoList(Integer kullaniciId) {
        return null;
    }

    public DepoListResponse getDepoListByDurum(Integer durum) {
        DepoListResponse response = new DepoListResponse();
        List<Depo> depoList = depoRepository.findAll();
        List<Depo> depos = new ArrayList<>();
        if (durum == 1) {
            for (Depo depo : depoList) {
                if (depo.getDurum() == 1)
                    depos.add(depo);
            }
            response.setDepoList(depos);
        } else {
            response.setDepoList(depoList);
        }

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
        depo.setDurum(request.getDepoDurum());
        depo.setOlusturmaTarihi(new Date(System.currentTimeMillis()));
        depoRepository.save(depo);
        return response;
    }
}
