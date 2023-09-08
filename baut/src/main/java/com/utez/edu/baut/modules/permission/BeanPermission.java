package com.utez.edu.baut.modules.permission;

public class BeanPermission {
    private Long id_permission;
    private String permission;

    public BeanPermission() {
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Long getId_permission() {
        return id_permission;
    }

    public void setId_permission(Long id_permission) {
        this.id_permission = id_permission;
    }
}
