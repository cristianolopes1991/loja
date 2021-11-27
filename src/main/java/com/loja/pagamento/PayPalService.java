package com.loja.pagamento;

import java.math.BigDecimal;

public class PayPalService implements GatewayPagamento{

    private String usuario;
    private String senha;

    public PayPalService(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor) {

    }
}
