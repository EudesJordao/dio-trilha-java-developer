package Banco;

import Cliente.Cliente;

public class ContaPoupanca extends ModelContas {

    protected ContaPoupanca(Cliente customer){
        super(customer);
    }

    @Override
    public String toString() {
        return "ContaPoupança{" +
                "Agency= " + getAGENCY_DEFAULT() +
                ", Number= " + number +
                ", Balance= " + balance +
                ", Customer= " + customer +
                '}';
    }
}
