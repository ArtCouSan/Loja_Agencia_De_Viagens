package br.senac.tads3.pi03b.gruposete.models;

public class Hotel {

    private int id;
    private String nome_hotel;
    private String data_entrada;
    private String data_saida;
    private int quantidade_quartos;
    private int quantidade_hospedes;
    private float preco;
    private boolean ativo;

    public Hotel() {

    }

    public Hotel(String nome_hotel, String data_entrada, String data_saida, 
            int quantidade_quartos, int quantidade_hospedes, float preco, boolean ativo) {
        this.nome_hotel = nome_hotel;
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
        this.quantidade_quartos = quantidade_quartos;
        this.quantidade_hospedes = quantidade_hospedes;
        this.preco = preco;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome_hotel;
    }

    public void setNome(String nome_hotel) {
        this.nome_hotel = nome_hotel;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getData_saida() {
        return data_saida;
    }

    public void setData_saida(String data_saida) {
        this.data_saida = data_saida;
    }

    public int getQuantidade_quartos() {
        return quantidade_quartos;
    }

    public void setQuantidade_quartos(int quantidade_quartos) {
        this.quantidade_quartos = quantidade_quartos;
    }

    public int getQuantidade_hospedes() {
        return quantidade_hospedes;
    }

    public void setQuantidade_hospedes(int quantidade_hospedes) {
        this.quantidade_hospedes = quantidade_hospedes;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
