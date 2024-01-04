package com.Answer.QustionAnswer.Controllor;

import com.Answer.QustionAnswer.AnswerServices.Services;
import com.Answer.QustionAnswer.Entity.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "answer")
public class AnswerContollor {
     @Autowired
    private Services services;

     @PostMapping
     public Answer adddata(@RequestBody Answer a){
         return services.save(a);
     }

     @GetMapping(value = "alldata")
     public  List<Answer> all(){
         return services.all();
     }
     @GetMapping(value = "question/{questionId}")
     public List<Answer> findByAnswerId(@PathVariable Long questionId){
         return services.findByAnswerId(questionId);
     }

}
