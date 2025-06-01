package com.evaluationservice.config.constant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum EntityAccountStatus {
    ACTIVE,
    INACTIVE;
    public static List<String> getAllStatus() {
        return Arrays.stream(EntityStatus.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    public static String getAllStatusString() {
        return Arrays.stream(EntityStatus.values())
                .map(Enum::name)
                .collect(Collectors.joining(", "));
    }
}
