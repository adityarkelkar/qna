/**
 * @Author Aditya Kelkar
 */


package com.qna.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answerID", unique = true, nullable = false)
    private long answerID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questionID", nullable = false)
    private Question question;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userID", nullable = false)
    private User user;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "answeredOn")
    private Date answerDateTime = new Date();

    @Column(name = "answerContent", columnDefinition = "TEXT")
    private String answerContent;

    public Answer() {
    }

    public long getAnswerID() {
        return answerID;
    }

    public void setAnswerID(long answerID) {
        this.answerID = answerID;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getAnswerDateTime() {
        return answerDateTime;
    }

    public void setAnswerDateTime(Date answerDateTime) {
        this.answerDateTime = answerDateTime;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }
}
