package br.cesed.processos;

import org.springframework.beans.factory.annotation.Autowired;

import br.cesed.reso.DadosCartao;
import br.cesed.reso.GatewayPagamento;

public class ProcessaCompra {

	/**
	 * 	A anotação @Autowired fornece controle sobre onde e como a ligação 
	 * entre os beans deve ser realizada. 
	 * Pode ser usado para em métodos setter, no construtor, 
	 * em uma propriedade ou métodos com nomes arbitrários e / ou vários argumentos.
	 * Fonte: DevMedia.
	 **/
	
	@Autowired
	private GatewayPagamento gateway;

	public void realizaCompra(DadosCartao dados, double valor) {
		gateway.realizarPagamento(dados, valor);
	}
	
	/**
	 * Bean determina que o Spring irá gerenciar as instâncias,
	 * Criar métodos para retornar o tipo das classes, dentro das classes
	 * de Configurations, esses métodos precisam ser anotados com @Bean,
	 * para que o Spring gerencie de acordo com a configuração desejada.
	 **/
}
