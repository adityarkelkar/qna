/**
 * @Author Aditya Kelkar
 */


package com.qna.repository;

import com.qna.data.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
}
