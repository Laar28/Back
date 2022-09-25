package com.grupo73.grupo73.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import java.util.Date;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @Column(nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable=false, unique=true)
    private String fullname;

    @Column(nullable=false, unique=true)
    private String nickname;

    @Column(nullable=false, unique=true)
    private String email;

    @Getter(value = AccessLevel.NONE) //No se puede pedir la contraseña a traves del getter
    @Column(nullable=false)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY) // Cuando necesite guardar este role solo va a esta el rol
    @JoinColumn(nullable=false) //Es obligatorio que llegue el ide de este campo
    private List<Role> roles;

    @Column(nullable=false)
    private Date registration;

    @Column(nullable=false)
    private boolean enabled; // Para poder desabilitar usuarios cuando se quiera

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
    

    
}
