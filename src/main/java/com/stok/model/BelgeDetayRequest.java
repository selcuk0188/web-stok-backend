package com.stok.model;

public class BelgeDetayRequest {
    private Integer stokKodu;
    private Integer barkod;
    private Integer adet;
    private Double birimTutar;
    private Double toplamTutar;
    private String olusturanKullanici;

    public Integer getStokKodu() {
        return stokKodu;
    }

    public void setStokKodu(Integer stokKodu) {
        this.stokKodu = stokKodu;
    }

    public Integer getBarkod() {
        return barkod;
    }

    public void setBarkod(Integer barkod) {
        this.barkod = barkod;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }


    public Double getBirimTutar() {
        return birimTutar;
    }

    public void setBirimTutar(Double birimTutar) {
        this.birimTutar = birimTutar;
    }

    public Double getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(Double toplamTutar) {
        this.toplamTutar = toplamTutar;
    }

    public String getOlusturanKullanici() {
        return olusturanKullanici;
    }

    public void setOlusturanKullanici(String olusturanKullanici) {
        this.olusturanKullanici = olusturanKullanici;
    }
}
