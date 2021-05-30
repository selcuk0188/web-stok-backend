package com.stok.service;

import com.stok.entities.Belge;
import com.stok.entities.BelgeDetay;
import com.stok.entities.Kullanici;
import com.stok.entities.KullaniciDepoYetki;
import com.stok.model.*;
import com.stok.repository.BelgeDetayRepository;
import com.stok.repository.BelgeRepository;
import com.stok.repository.KullaniciDepoRepository;
import com.stok.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BelgeDetayService {

    @Autowired
    private BelgeDetayRepository belgeDetayRepository;


    @Autowired
    private BelgeRepository belgeRepository;

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @Autowired
    private KullaniciDepoRepository kullaniciDepoRepository;

    @Autowired
    private DepoService depoService;

    public BelgeDetayListResponse getBelgeDetayList(Integer stokKodu) {
        return null;
    }

    public BelgeDetayListResponse getBelgeDetayListByUserId(Integer kullaniciId) {
        BelgeDetayListResponse response = new BelgeDetayListResponse();
        Optional<Kullanici> kullanici = kullaniciRepository.findById(kullaniciId);
        List<BelgeDetay> belgeDetayList = new ArrayList<>();
        if (kullanici.get().getRolId() == 2) {
            List<KullaniciDepoYetki> kullaniciDepoYetkiList = kullaniciDepoRepository.findByKullaniciId(kullaniciId);
            for (KullaniciDepoYetki k : kullaniciDepoYetkiList) {
                List<Belge> belgeList = belgeRepository.findByDepoKodu(k.getDepoKodu());
                for (Belge b : belgeList) {
                    List<BelgeDetay> belgeDetayList1 = belgeDetayRepository.findByBelgeNo(b.getBelgeNo());
                    belgeDetayList.addAll(belgeDetayList1);
                }
            }
        } else {
            belgeDetayList = belgeDetayRepository.findAll();
        }
        response.setBelgeDetayList(belgeDetayList);
        return response;
    }

    public BelgeDetayKayitResponse save(BelgeDetayListRequest request) {
        BelgeDetayKayitResponse response = new BelgeDetayKayitResponse();
        response.setBasariliMi(true);
        List<BelgeDetayDto> belgeDetayList = request.getBelgeDetayList();
        for (BelgeDetayDto dto : belgeDetayList) {
            BelgeDetay belgeDetay = new BelgeDetay();
            belgeDetay.setAdet(dto.getAdet());
            belgeDetay.setBarkod(dto.getBarkod());
            belgeDetay.setBirimTutar(dto.getBirimTutar());
            belgeDetay.setOlusturanKullanici(dto.getOlusturanKullanici());
            belgeDetay.setStokKodu(dto.getStokKodu());
            belgeDetay.setBelgeNo(dto.getBelgeNo());
            belgeDetay.setToplamTutar(dto.getBirimTutar() * dto.getAdet());
            belgeDetay.setOlusturmaTarihi(new Date(System.currentTimeMillis()));
            belgeDetayRepository.save(belgeDetay);
        }
        return response;
    }

    public GirisKontrolResponse validate(GirisKontrolRequest request) {
        Optional<Belge> belge = belgeRepository.findByBelgeNo(request.getBelgeNo());
        DepoStokListResponse depoStokList = depoService.getDepoStokList(request.getKullaniciId());
        List<DepoStokDto> depoStokDtoList = depoStokList.getDepoStokDtoList();
        for (DepoStokDto dto : depoStokDtoList) {

        }
        return null;
    }

    public BelgeDetayGuncelleResponse update(BelgeDetayDto request) {
        return null;
    }

    public BelgeDetaySilResponse delete(Integer belgeDetayId) {
        BelgeDetaySilResponse response = new BelgeDetaySilResponse();
        response.setBasariliMi(true);
        belgeDetayRepository.deleteById(belgeDetayId);
        return response;
    }
}
