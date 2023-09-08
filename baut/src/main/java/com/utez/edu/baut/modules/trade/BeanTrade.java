package com.utez.edu.baut.modules.trade;

import java.time.LocalDate;

public class BeanTrade {
    private Long id_trade;
    private LocalDate date;
    private Long fk_id_user_buyer;
    private Long fk_id_item;

    public BeanTrade() {
    }

    public Long getId_trade() {
        return id_trade;
    }

    public void setId_trade(Long id_trade) {
        this.id_trade = id_trade;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getFk_id_user_buyer() {
        return fk_id_user_buyer;
    }

    public void setFk_id_user_buyer(Long fk_id_user_buyer) {
        this.fk_id_user_buyer = fk_id_user_buyer;
    }

    public Long getFk_id_item() {
        return fk_id_item;
    }

    public void setFk_id_item(Long fk_id_item) {
        this.fk_id_item = fk_id_item;
    }
}
