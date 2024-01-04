package com.Answer.QustionAnswer.AnswerServices;


import com.Answer.QustionAnswer.Entity.Answer;
import com.Answer.QustionAnswer.Repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    @Autowired
    private AnswerRepository answerRepository;


    public Answer save(Answer a) {
        return answerRepository.save(a);
    }



    public List<Answer> findByAnswerId(Long questionId) {
       return answerRepository.findByquestionId(questionId);
    }

    public List<Answer> all() {
        return answerRepository.findAll();
    }
}
