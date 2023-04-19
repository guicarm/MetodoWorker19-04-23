package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;

public class Teste {

	public static void main(String[] args) {
	
		Colaborador objColaborador = new Colaborador (JOptionPane.showInputDialog("Nome: "),
				Double.parseDouble(JOptionPane.showInputDialog("Valor hora: ")),
				JOptionPane.showInputDialog("Cargo: "),
				Double.parseDouble(JOptionPane.showInputDialog("Percentual: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Quantidade de horas trabalhadas: ")));
		
		
		
							// INFORMAÇÕES GERAIS DO COLABORADOR
		System.out.println("========= INFORMAÇÕES DO COLABORADOR =========\n" + objColaborador.getExibirTudo() +
		
				
							// CÁLCULO DO SALÁRIO DE ACORDO COM A QNT DE HORAS TRABALHADAS
		"\nSalário de acordo com seu valor hora: " + 
		objColaborador.Salario() +
							
		
							// CÁLCULO DO SALÁRIO COM IMPOSTO DE RENDA
		"\nSalário com imposto de renda descontado: " + objColaborador.Ir());
 }
}
