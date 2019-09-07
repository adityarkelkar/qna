/**
 * @Author Aditya Kelkar
 */


package com.qna.service;

import com.qna.data.Question;
import com.qna.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<>();
        questionRepository.findAll().forEach(questions::add);
        return questions;
    }

    public Question getQuestion(long id) {
        return questionRepository.findById(id).get();
    }

    public void addQuestion(Question question) {
        questionRepository.save(question);
    }
}
