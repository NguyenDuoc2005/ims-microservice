package com.evaluationservice.repository;

import com.evaluationservice.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation, String> {

}
