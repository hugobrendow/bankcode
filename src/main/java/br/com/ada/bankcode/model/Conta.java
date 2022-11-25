package br.com.ada.bankcode.model;

import lombok.Data;

@Data
public class Conta {
    private String agencia;
    private String numero;
    private TipoConta tipo;
    private Banco banco;
    private Titular titular;
}
