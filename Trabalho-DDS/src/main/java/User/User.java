package User;

import javafx.scene.control.Button;

public class User {
    String nome, sobrenome, nomeCompleto;
    Button registrar;
    public User (String nome, String sobrenome, String nomeCompleto, Button update) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeCompleto = nomeCompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Button getRegistrar() {
        return registrar;
    }

    public void setRegistrar(Button registrar) {
        this.registrar = registrar;
    }





}




