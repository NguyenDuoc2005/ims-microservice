package com.userservice.entity;

import com.userservice.config.constant.EntityAccountStatus;
import com.userservice.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends PrimaryEntity implements Serializable {

    @Size(max = 2000)
    @Column(name = "picture", length = 2000)
    private String picture;

    @Size(max = 255)
    @Column(name = "address")
    private String address;

    @Size(max = 255)
    @Column(name = "code")
    private String code;

    @Size(max = 255)
    @Column(name = "email")
    private String email;

    @Size(max = 255)
    @Column(name = "major")
    private String major;

    @Size(max = 255)
    @Column(name = "password")
    private String password;

    @Size(max = 255)
    @Column(name = "phone_number")
    private String phoneNumber;

    @Size(max = 255)
    @Column(name = "\"position\"")
    private String position;

    @Size(max = 255)
    @Column(name = "username")
    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserRole> userRoles;

    @Column(name = "confirmation_status")
    @Enumerated(EnumType.ORDINAL)
    private EntityAccountStatus confirmationStatus;


}