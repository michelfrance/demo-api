package com.zup.demoApi.models;

import java.util.Date;

public class DemoModel {

    private Long id;
    private String nome;
    private Boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    private Integer codigo;
    private Date data;

    @Override
    public String toString() {
        return "DemoModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                ", codigo=" + codigo +
                ", data=" + data +
                '}';
    }
}
