/**
 * @Author Aditya Kelkar
 */


package com.qna.controller;

import com.qna.data.Question;
import com.qna.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/question/{id}")
    public Question getQuestion(@PathVariable String id) {
        return questionService.getQuestion(Long.valueOf(id));
    }

    @PostMapping(value = "/question/add")
    public void addQuestion(@RequestBody Question question) {
        questionService.addQuestion(question);
    }
}
