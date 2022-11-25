package br.com.ada.bankcode.model;

import lombok.Data;

@Data
public class Titular {
    private String nome;
    private String cpfCnpj;
    private TipoPessoa tipo;
}
