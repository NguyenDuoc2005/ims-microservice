package com.userservice.config.listener;

import com.userservice.config.constant.EntityStatus;
import com.userservice.entity.base.PrimaryEntity;
import jakarta.persistence.PrePersist;

import java.util.UUID;

public class CreatePrimaryEntityListener {

    @PrePersist
    private void onCreate(PrimaryEntity entity) {
        entity.setId(UUID.randomUUID().toString());
        entity.setStatus(EntityStatus.ACTIVE);
    }

}
