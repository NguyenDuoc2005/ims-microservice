package com.evaluationservice.entity;

import com.evaluationservice.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "evaluation")
public class Evaluation extends PrimaryEntity implements Serializable {

    @Column(name = "score")
    private Double score;

    @Column(name = "created_date")
    private Long createdDate;

    @Column(name = "last_modified_date")
    private Long lastModifiedDate;

    @NotNull
    @Column(name = "meeting_id", nullable = false)
    private String meetingId;

    @NotNull
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Size(max = 255)
    @Column(name = "comment")
    private String comment;

}
