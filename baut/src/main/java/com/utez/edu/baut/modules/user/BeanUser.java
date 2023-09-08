package com.utez.edu.baut.modules.user;

public class BeanUser {
    private Long id_user;
    private String institutional_mail;
    private String password;
    private Boolean status;
    private Long fk_id_person;

    public BeanUser() {
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getInstitutional_mail() {
        return institutional_mail;
    }

    public void setInstitutional_mail(String institutional_mail) {
        this.institutional_mail = institutional_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getFk_id_person() {
        return fk_id_person;
    }

    public void setFk_id_person(Long fk_id_person) {
        this.fk_id_person = fk_id_person;
    }
}
