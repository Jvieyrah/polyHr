package com.trybe.polimorfismo;


/**
 * Represents a "FuncionarioPessoaJuridica" object, which is a specific type of "Funcionario"
 * (Employee) in a company. This class extends the "Funcionario" class and provides functionality to
 * calculate the net salary for a person.
 * 
 */
public class FuncionarioPessoaJuridica extends Funcionario {

  @Override
  public double calcularSalarioLiquido() {
    double salarioBruto = getSalarioBruto();
    return salarioBruto * 0.9;
  }

}
