package com.loja.venda;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Venda {

    private String produto;
    private int quantidade;
    private BigDecimal precoUnitario;
}
