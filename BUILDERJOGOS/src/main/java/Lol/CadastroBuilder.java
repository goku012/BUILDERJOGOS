package Lol;

import java.util.Date;

public class CadastroBuilder {
    private Cadastro cadastro;
    public CadastroBuilder() {
        cadastro = new Cadastro();
    }

    public Cadastro build() {
        if (cadastro.getCadastro() == "") {
            throw new IllegalArgumentException("Cadastro inválido");
        }
        if (cadastro.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (cadastro.getEmail().equals("")) {
            throw new IllegalArgumentException("Email inválido");
        }
        return cadastro;
    }

    public CadastroBuilder setCadastro(String CadastroJogo) {
        cadastro.setCadastro(CadastroJogo);
        return this;
    }

    public CadastroBuilder setNome(String nome) {
        cadastro.setNome(nome);
        return this;
    }

    public CadastroBuilder setData(Date data) {
        cadastro.setDataNascimento(data);
        return this;
    }

    public CadastroBuilder setCPF(String cpf) {
        cadastro.setCpf(cpf);
        return this;
    }


    public CadastroBuilder setCampeao(String campeao) {
        cadastro.setTipoCampeao(campeao);
        return this;
    }

    public CadastroBuilder setIdade(int idade) {
        cadastro.setIdade(idade);
        return this;
    }

    public CadastroBuilder setEmail(String email) {
        cadastro.setEmail(email);
        return this;
    }

    public CadastroBuilder setCelular(String celular) {
        cadastro.setCelular(celular);
        return this;
    }

    public CadastroBuilder setRota(String rota) {
        cadastro.setRota(rota);
        return this;
    }

    public CadastroBuilder setNivel(int nivel) {
        cadastro.setNivel(nivel);
        return this;
    }
}
