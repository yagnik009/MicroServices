package com.quiz.services;


import com.quiz.entities.Answer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "QUSTION-ANSWER")
public interface AnswerClient {

    @GetMapping(value = "answer/question/{questionId}")
    public List<Answer> findByquestionId(@PathVariable Long questionId);
}
