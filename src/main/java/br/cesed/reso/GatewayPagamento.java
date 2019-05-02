package br.cesed.reso;

public interface GatewayPagamento {
	
	StatusTransacao realizarPagamento(DadosCartao dados, double valor);

}
