package com.corso.java.orangee.PlaysRemo.play200.v3;

public class FormDTO {
    private String nome;
    private String email;
    private String nickName;

    public FormDTO(String nome, String email, String nickName) {
        this.nome = nome;
        this.email = email;
        this.nickName = nickName;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
