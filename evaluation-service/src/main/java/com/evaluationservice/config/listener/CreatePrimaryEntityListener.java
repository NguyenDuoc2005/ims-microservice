package com.evaluationservice.config.listener;

import com.evaluationservice.config.constant.EntityStatus;
import com.evaluationservice.entity.base.PrimaryEntity;
import jakarta.persistence.PrePersist;

import java.util.UUID;

public class CreatePrimaryEntityListener {

    @PrePersist
    private void onCreate(PrimaryEntity entity) {
        entity.setId(UUID.randomUUID().toString());
        entity.setStatus(EntityStatus.ACTIVE);
    }

}
