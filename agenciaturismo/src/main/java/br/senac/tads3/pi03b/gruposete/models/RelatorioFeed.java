package br.senac.tads3.pi03b.gruposete.models;

public class RelatorioFeed {

    private String filial;
    private int id_feed;
    private String mensagem;
    private String funcionario;
    private String cargo;
    private String data;
    private int id_func;

    public int getId_feed() {
        return id_feed;
    }

    public void setId_feed(int id_feed) {
        this.id_feed = id_feed;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    public RelatorioFeed() {
    }

}
