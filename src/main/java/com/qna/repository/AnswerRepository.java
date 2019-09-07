/**
 * @Author Aditya Kelkar
 */


package com.qna.repository;

import com.qna.data.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
}
