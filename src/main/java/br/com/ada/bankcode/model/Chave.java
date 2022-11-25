package br.com.ada.bankcode.model;

import lombok.Data;

@Data
public class Chave {
    private Conta conta;
    private String chave;
    private TipoChave tipo;
}
