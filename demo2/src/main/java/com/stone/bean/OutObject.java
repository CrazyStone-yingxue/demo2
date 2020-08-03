package com.stone.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class OutObject implements Serializable {
    private static final long serialVersionUID = 1475495361132676992L;
    @NotNull(message = "用户名为空！")
    private String username;
    private String password;
    private String email;

    public OutObject(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OutObject() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OutObject [username=").append(this.username)
            .append(", password =").append(this.password)
            .append(", email =").append(this.email)
            .append("]");
        return sb.toString();
    }
}
