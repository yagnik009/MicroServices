package com.question.QuestionService.services.impl;

import com.question.QuestionService.entities.Answer;
import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repositories.QuestionRepository;
import com.question.QuestionService.services.AnswerClient;
import com.question.QuestionService.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;
    private AnswerClient answerClient;

    public QuestionServiceImpl(QuestionRepository questionRepository, AnswerClient answerClient) {
        this.questionRepository = questionRepository;
        this.answerClient = answerClient;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        List<Question> quizzes = questionRepository.findAll();

        List<Question> newQuizList = quizzes.stream().map(Question -> {
            Question.setAnswers(answerClient.findByquestionId(Question.getQuestionId()));
            return Question;
        }).collect(Collectors.toList());

        return newQuizList;
    }

    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found !!"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }



    @Override
    public List<Answer> findByquestionId(Long questionId) {
        return questionRepository.findByquestionId(questionId);
    }
}
