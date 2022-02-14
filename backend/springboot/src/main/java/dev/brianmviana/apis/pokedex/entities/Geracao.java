package dev.brianmviana.apis.pokedex.entities;

public class Geracao {

    private Integer id;

    private String nome;

    private String regiao;

    public Integer getId() {
        return id;
    }

    public Geracao setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Geracao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getRegiao() {
        return regiao;
    }

    public Geracao setRegiao(String regiao) {
        this.regiao = regiao;
        return this;
    }

}
