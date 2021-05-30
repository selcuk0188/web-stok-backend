package com.stok.model;

import java.util.List;

public class DepoStokListResponse {

    private List<DepoStokDto> depoStokDtoList;

    public List<DepoStokDto> getDepoStokDtoList() {
        return depoStokDtoList;
    }

    public void setDepoStokDtoList(List<DepoStokDto> depoStokDtoList) {
        this.depoStokDtoList = depoStokDtoList;
    }
}
