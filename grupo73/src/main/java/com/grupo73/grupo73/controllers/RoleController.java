package com.grupo73.grupo73.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.grupo73.grupo73.data.RoleData;
import com.grupo73.grupo73.services.RoleService;

@RestController
@RequestMapping(path = "/api/roles")
@CrossOrigin(origins="*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<?>findAll(){
        return new ResponseEntity<>(roleService.findAll(), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<?>insert(@RequestBody RoleData role){
        return new ResponseEntity<>(roleService.insert(role), HttpStatus.CREATED);
    }

}
