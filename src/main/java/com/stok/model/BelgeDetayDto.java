package com.stok.model;

public class BelgeDetayDto {
    private Integer belgeNo;
    private Integer stokKodu;
    private String barkod;
    private Integer adet;
    private Double birimTutar;
    private Double toplamTutar;
    private String olusturanKullanici;

    public Integer getBelgeNo() {
        return belgeNo;
    }

    public void setBelgeNo(Integer belgeNo) {
        this.belgeNo = belgeNo;
    }

    public Integer getStokKodu() {
        return stokKodu;
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
