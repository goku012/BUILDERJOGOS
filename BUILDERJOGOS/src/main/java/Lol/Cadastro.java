package Lol;

import java.util.Date;

public class Cadastro {
    private String cadastrojogo;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String tipoCampeao;
    private int idade;
    private String email;
    private String celular;
    private String rota;
    private int nivel;

    public Cadastro() {
        this.cadastrojogo = "";
        this.nome = "";
        this.email = "";
    }



    public String getCadastro() {
        return cadastrojogo;
    }

    public void setCadastro(String cadastrojogo) {
        this.cadastrojogo = cadastrojogo;
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }





    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }






    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }







    public String getTipoCampeao() {
        return tipoCampeao;
    }

    public void setTipoCampeao(String tipoCampeao) {
        this.tipoCampeao = tipoCampeao;
    }





    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }








    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }







    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }




    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }




    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }



}
