package com.userservice.entity;

import com.userservice.entity.base.PrimaryEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "meeting")
public class Meeting extends PrimaryEntity implements Serializable {

    @Column(name = "end_time")
    private Long endTime;

    @Column(name = "start_time")
    private Long startTime;

    @Size(max = 2000)
    @Column(name = "content", length = 2000)
    private String content;

    @Size(max = 255)
    @Column(name = "code")
    private String code;

    @Size(max = 255)
    @Column(name = "location")
    private String location;

    @Size(max = 255)
    @Column(name = "title")
    private String title;

    @Size(max = 2000)
    @Column(name = "link", length = 2000)
    private String link;

}