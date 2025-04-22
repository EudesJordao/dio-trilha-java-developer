package Desafios.banco_fianceiro.banco_financeiro.src;

import Desafios.banco_fianceiro.banco_financeiro.src.Banco.BancoBrasil;
import Desafios.banco_fianceiro.banco_financeiro.src.Banco.ModelContas;
import Desafios.banco_fianceiro.banco_financeiro.src.Cliente.Cliente;

public class Main {
    public static void main(String[] args) {

        BancoBrasil bankBrazil = new BancoBrasil("123123", "Rua Fineias");

        Cliente costumer1 = new Cliente
                ("Eudes Jordão", "04/09/2001", "1234");

        ModelContas accountCp = bankBrazil.creatAccount
                (costumer1.getName(), costumer1.getBirthday(), costumer1.getCPF(), "cp" );

        ModelContas accountCc = bankBrazil.creatAccount
                (costumer1.getName(), costumer1.getBirthday(), costumer1.getCPF(), "cc" );


        accountCp.deposit(100);
        accountCp.withdraw(25);

        bankBrazil.listAccounts();

    }
}