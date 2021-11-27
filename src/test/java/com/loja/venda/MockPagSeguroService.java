package com.loja.venda;

import com.loja.pagamento.PagSeguroService;

import java.math.BigDecimal;

public class MockPagSeguroService extends PagSeguroService {
    public MockPagSeguroService(String token) {
        super(token);
    }

    @Override
    public void efetuarPagamento(String numeroCartao, BigDecimal valor) {
        System.out.println("[Mock] Não faz nada!");
    }
}
