package com.stok.service;

import com.stok.entities.Rol;
import com.stok.model.RolResponse;
import com.stok.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public RolResponse getRol() {
        RolResponse response = new RolResponse();
        List<Rol> rolList = rolRepository.findAll();
        response.setRolList(rolList);
        return response;

    }


}
