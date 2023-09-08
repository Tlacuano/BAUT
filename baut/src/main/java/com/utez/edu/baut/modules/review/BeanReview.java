package com.utez.edu.baut.modules.review;

import java.time.LocalDate;

public class BeanReview {
    private Long id_review;
    private LocalDate date;
    private int rate;
    private String comment;
    private Long fk_id_trade;

    public BeanReview() {
    }

    public Long getId_review() {
        return id_review;
    }

    public void setId_review(Long id_review) {
        this.id_review = id_review;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getFk_id_trade() {
        return fk_id_trade;
    }

    public void setFk_id_trade(Long fk_id_trade) {
        this.fk_id_trade = fk_id_trade;
    }
}
