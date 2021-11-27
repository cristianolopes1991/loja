package com.loja.venda;

import com.loja.pagamento.GatewayPagamento;

import java.math.BigDecimal;

public class MockGatewayService implements GatewayPagamento {

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor) {
    }
}
