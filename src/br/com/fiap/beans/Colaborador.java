package br.com.fiap.beans;

public class Colaborador {

	private String nome;
	private double valorHora;
	private String cargo;
	private double percentual;
	private double quantidadeHora;
	
// ============== CONSTRUTORES ==============
	public Colaborador() {
		super();
	}


	public Colaborador(String nome, double valorHora, String cargo, double percentual, double quantidadeHora) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
		this.percentual = percentual;
		this.quantidadeHora = quantidadeHora;
	}

	
public Colaborador(String nome, double valorHora, String cargo) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
	}

// ============== SETTERS & GETTERS ==============

	public String getNome() {
		return nome;
	}


	public double getPercentual() {
		return percentual;
	}


	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}


	public double getQuantidadeHora() {
		return quantidadeHora;
	}


	public void setQuantidadeHora(double quantidadeHora) {
		this.quantidadeHora = quantidadeHora;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValorHora() {
		return valorHora;
	}


	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
// ============== GET PARA EXIBIR TODOS OS DADOS ==============

	public String getExibirTudo() {
		return "Nome: " + nome + "\nValor Hora: " + valorHora + "\nCargo: " + cargo;
	}

// ============== MÉTODO WORKER (CALCULAR VALOR HORA) ==============

  public double Salario() {
	  return valorHora * quantidadeHora;
  }

  public double Ir() {
	  return (valorHora * quantidadeHora) * (percentual / 100);
  }














}
