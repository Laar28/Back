package com.grupo73.grupo73.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.grupo73.grupo73.data.RoleData;
import com.grupo73.grupo73.converters.RoleConverter;
import com.grupo73.grupo73.repositories.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    private RoleConverter roleConverter = new RoleConverter();

    //Metodo para consultar todos los roles
    public List<RoleData> findAll() {
        return roleConverter.toData(roleRepository.findAll());
    }

    //Metodo para agregar roles a la bd
    public RoleData insert(RoleData role){
        if(roleRepository.existsById(role.getId()))
            throw new ResponseStatusException(HttpStatus.CONFLICT, "El rol ya esta registrado");
        return roleConverter.toData(roleRepository.save(roleConverter.toEntity(role)));
    }
    
}
