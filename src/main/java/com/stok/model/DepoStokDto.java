package com.stok.model;

public class DepoStokDto {

    private Integer depoKodu;
    private String depoAdi;
    private Integer stokKodu;
    private String stokAdi;
    private String stokGrupAdi;
    private String barkod;
    private Integer adet;

    public Integer getDepoKodu() {
        return depoKodu;
    }

    public void setDepoKodu(Integer depoKodu) {
        this.depoKodu = depoKodu;
    }

    public Integer getStokKodu() {
        return stokKodu;
    }

    public String getStokAdi() {
        return stokAdi;
    }

    public void setStokAdi(String stokAdi) {
        this.stokAdi = stokAdi;
    }

    public String getStokGrupAdi() {
        return stokGrupAdi;
    }

    public void setStokGrupAdi(String stokGrupAdi) {
        this.stokGrupAdi = stokGrupAdi;
    }

    public void setStokKodu(Integer stokKodu) {
        this.stokKodu = stokKodu;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public String getDepoAdi() {
        return depoAdi;
    }

    public void setDepoAdi(String depoAdi) {
        this.depoAdi = depoAdi;
    }
}
