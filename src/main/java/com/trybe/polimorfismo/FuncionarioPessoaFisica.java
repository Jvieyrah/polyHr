package com.trybe.polimorfismo;


/**
 * Represents a "FuncionarioPessoaFisica" object, which is a specific type of "Funcionario"
 * (Employee) in a company. This class extends the "Funcionario" class and provides functionality to
 * calculate the net salary for a person.
 * 
 */
public class FuncionarioPessoaFisica extends Funcionario {

  @Override
  public double calcularSalarioLiquido() {
    double salarioBruto = getSalarioBruto();
    return salarioBruto * 0.8;
  }

}
