package com.loja.venda;

import com.loja.pagamento.PagSeguroService;
import com.loja.pagamento.PayPalService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class VendaServiceTest {

    @Test
    public void registrarVenda(){
        Venda venda = new Venda();
        venda.setProduto("Camiseta branca básica");
        venda.setQuantidade(2);
        venda.setPrecoUnitario(new BigDecimal(109.5));

//        VendaService vendaService = new VendaService(new PagSeguroService("857db3dbbce149ab8943430f4d18bdf3"));
        VendaService vendaService = new VendaService(new PayPalService("algaworks", "123"));
        vendaService.registrar(venda, "4024007141518687");
    }
}
