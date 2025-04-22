package Desafios.banco_fianceiro.banco_financeiro.src.Banco;

import Desafios.banco_fianceiro.banco_financeiro.src.Cliente.Cliente;

public class ContaCorrente extends ModelContas {

    protected ContaCorrente(Cliente customer) {
        super(customer);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "Agency= " + getAGENCY_DEFAULT() +
                ", Number= " + number +
                ", Balance= " + balance +
                ", Customer= " + customer +
                '}';
    }
}
