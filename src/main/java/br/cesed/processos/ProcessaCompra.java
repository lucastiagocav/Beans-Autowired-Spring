package br.cesed.processos;

import org.springframework.beans.factory.annotation.Autowired;

import br.cesed.reso.DadosCartao;
import br.cesed.reso.GatewayPagamento;

public class ProcessaCompra {

	/**
	 * 	A anota��o @Autowired fornece controle sobre onde e como a liga��o 
	 * entre os beans deve ser realizada. 
	 * Pode ser usado para em m�todos setter, no construtor, 
	 * em uma propriedade ou m�todos com nomes arbitr�rios e / ou v�rios argumentos.
	 * Fonte: DevMedia.
	 **/
	
	@Autowired
	private GatewayPagamento gateway;

	public void realizaCompra(DadosCartao dados, double valor) {
		gateway.realizarPagamento(dados, valor);
	}
	
	/**
	 * Bean determina que o Spring ir� gerenciar as inst�ncias,
	 * Criar m�todos para retornar o tipo das classes, dentro das classes
	 * de Configurations, esses m�todos precisam ser anotados com @Bean,
	 * para que o Spring gerencie de acordo com a configura��o desejada.
	 **/
}
