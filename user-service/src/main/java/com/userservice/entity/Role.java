package com.userservice.entity;

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
@Table(name = "roles")
public class Role extends PrimaryEntity implements Serializable {

    @Size(max = 255)
    @Column(name = "code")
    private String code;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<UserRole> userRoles;

}