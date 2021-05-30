package com.stok.service;

import com.stok.entities.*;
import com.stok.model.*;
import com.stok.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.*;

@Service
public class DepoService {

    @Autowired
    private DepoRepository depoRepository;


    @Autowired
    private KullaniciDepoRepository kullaniciDepoRepository;

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @Autowired
    private BelgeRepository belgeRepository;

    @Autowired
    private BelgeDetayRepository belgeDetayRepository;

    @Autowired
    private StokKartRepository stokKartRepository;

    @Autowired
    private StokGrupRepository stokGrupRepository;

    public DepoStokListResponse getDepoStokList(Integer kullaniciId) {
        DepoStokListResponse response = new DepoStokListResponse();

        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        Optional<Kullanici> kullanici = kullaniciRepository.findById(kullaniciId);
        if (kullanici.get().getRolId() == 2) {
            List<KullaniciDepoYetki> kullaniciDepoYetkiList = kullaniciDepoRepository.findByKullaniciId(kullaniciId);
            for (KullaniciDepoYetki k : kullaniciDepoYetkiList) {
                addMap(k.getDepoKodu(), 1, 0, 0, map);
                List<Belge> belgeList = belgeRepository.findByDepoKodu(k.getDepoKodu());
                for (Belge b : belgeList) {
                    List<BelgeDetay> belgeDetayList = belgeDetayRepository.findByBelgeNo(b.getBelgeNo());
                    for (BelgeDetay bd : belgeDetayList) {
                        addMap(k.getDepoKodu(), b.getTur(), bd.getStokKodu(), bd.getAdet(), map);
                    }
                }
            }
        } else {
            List<Depo> depoList = depoRepository.findAll();
            for (Depo k : depoList) {
                addMap(k.getDepoKodu(), 1, 0, 0, map);
                List<Belge> belgeList = belgeRepository.findByDepoKodu(k.getDepoKodu());
                for (Belge b : belgeList) {
                    List<BelgeDetay> belgeDetayList = belgeDetayRepository.findByBelgeNo(b.getBelgeNo());
                    for (BelgeDetay bd : belgeDetayList) {
                        addMap(k.getDepoKodu(), b.getTur(), bd.getStokKodu(), bd.getAdet(), map);
                    }
                }
            }
        }
        List<DepoStokDto> dtos = new ArrayList<>();
        map.forEach((k, v) -> {
            v.forEach((x, y) -> {
                DepoStokDto dto = new DepoStokDto();
                dto.setDepoKodu(k);
                dto.setStokKodu(x);
                dto.setAdet(y);
                Optional<Depo> depoKodu = depoRepository.findByDepoKodu(k);
                dto.setDepoAdi(depoKodu.get().getDepoAdi());
                if (x != 0) {
                    Optional<StokKart> stokKart = stokKartRepository.findByStokKodu(x);
                    dto.setStokAdi(stokKart.get().getStokAdi());
                    StokGrup grupKodu = stokGrupRepository.findByGrupKodu(stokKart.get().getGrupKodu());
                    dto.setStokGrupAdi(grupKodu.getGrupAdi());
                }
                dtos.add(dto);
            });
        });
        response.setDepoStokDtoList(dtos);
        return response;
    }

    private Map<Integer, Map<Integer, Integer>> addMap(Integer depoKodu, Integer girisCikis, Integer stokKodu, Integer adet, Map<Integer, Map<Integer, Integer>> map) {
        if (map.containsKey(depoKodu)) {
            if (map.get(depoKodu).containsKey(stokKodu)) {
                Integer a = map.get(depoKodu).get(stokKodu);
                if (girisCikis == 1)
                    map.get(depoKodu).put(stokKodu, a + adet);
                else if (girisCikis == 2)
                    map.get(depoKodu).put(stokKodu, a - adet);
            } else {
                map.get(depoKodu).put(stokKodu, adet);
            }
        } else {
            Map<Integer, Integer> stokmap = new HashMap<>();
            stokmap.put(stokKodu, adet);
            map.put(depoKodu, stokmap);
        }
        return map;
    }

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
        Optional<Depo> depoKodu = depoRepository.findByDepoKodu(request.getDepoKodu());
        if (depoKodu.isPresent()) {
            response.setBasariliMi(false);
            return response;
        }
        Depo depo = new Depo();
        depo.setDepoAdi(request.getDepoAdi());
        depo.setDepoKodu(request.getDepoKodu());
        depo.setDurum(request.getDepoDurum());
        depo.setOlusturmaTarihi(new Date(System.currentTimeMillis()));
        depoRepository.save(depo);
        return response;
    }
}
