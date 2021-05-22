package com.stok.model;

public class StokKartRequest {

    private String stokKodu;
    private String stokAdi;
    private String barkod;
    private Integer grupKodu;
    private Integer durum;

    public String getStokKodu() {
        return stokKodu;
    }

    public void setStokKodu(String stokKodu) {
        this.stokKodu = stokKodu;
    }

    public String getStokAdi() {
        return stokAdi;
    }

    public void setStokAdi(String stokAdi) {
        this.stokAdi = stokAdi;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public Integer getGrupKodu() {
        return grupKodu;
    }

    public void setGrupKodu(Integer grupKodu) {
        this.grupKodu = grupKodu;
    }

    public Integer getDurum() {
        return durum;
    }

    public void setDurum(Integer durum) {
        this.durum = durum;
    }
}
