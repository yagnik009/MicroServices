package com.Answer.QustionAnswer.Repository;

import com.Answer.QustionAnswer.Entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer,Long> {

    List<Answer> findByquestionId(Long questionId);
}
