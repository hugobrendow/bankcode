package br.com.ada.bankcode.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Banco {
    private UUID id;
    private String codigoBacen;
    private String nome;
}
