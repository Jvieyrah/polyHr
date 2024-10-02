package com.trybe.polimorfismo;

/**
 * The abstract class "Funcionario" represents an employee in a company. It provides common
 * attributes and methods for all types of employees. Subclasses must implement the
 * "calcularSalarioLiquido()" method to calculate the net salary.
 * 
 */
public abstract class Funcionario {
  private String nome;
  private String cpf;
  private double salarioBruto;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public double getSalarioBruto() {
    return salarioBruto;
  }

  public void setSalarioBruto(double salarioBruto) {
    this.salarioBruto = salarioBruto;
  }

  abstract double calcularSalarioLiquido();

}


