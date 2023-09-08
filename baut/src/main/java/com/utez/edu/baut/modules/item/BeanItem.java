package com.utez.edu.baut.modules.item;

import java.sql.Blob;
import java.time.LocalDate;

public class BeanItem {
    private Long id_item;
    private Blob image;
    private String pathImage;
    private String name;
    private String description;
    private double price;
    private LocalDate start_availability_date;
    private LocalDate end_availability_date;
    private Boolean status;
    private Long fk_id_user_seller;

    public BeanItem() {
    }

    public Long getId_item() {
        return id_item;
    }

    public void setId_item(Long id_item) {
        this.id_item = id_item;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStart_availability_date() {
        return start_availability_date;
    }

    public void setStart_availability_date(LocalDate start_availability_date) {
        this.start_availability_date = start_availability_date;
    }

    public LocalDate getEnd_availability_date() {
        return end_availability_date;
    }

    public void setEnd_availability_date(LocalDate end_availability_date) {
        this.end_availability_date = end_availability_date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getFk_id_user_seller() {
        return fk_id_user_seller;
    }

    public void setFk_id_user_seller(Long fk_id_user_seller) {
        this.fk_id_user_seller = fk_id_user_seller;
    }
}
