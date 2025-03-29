package Banco;

import Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public abstract class ModelBanco {
    protected String CNPJ;
    protected String address;
    protected List<ModelContas> listAccount = new ArrayList<ModelContas>();

    protected ModelBanco(String CNPJ, String address){
        this.address = address;
        this.CNPJ = CNPJ;
    }

    public ModelContas creatAccount(String name, String birthday, String CPF, String typeAccount){
        Cliente costumer = new Cliente(name, birthday, CPF);
        ModelContas account = new ContaPoupanca(costumer);

        if (typeAccount.equals("cc")){
            account = new ContaCorrente(costumer);
        } else if (typeAccount.equals("cp")){
            account = new ContaPoupanca(costumer);
        }

        addAccount(account);

        return account;
    }

    public void addAccount(ModelContas account){
        listAccount.add(account);
    }


    public void listAccounts(){
        for (int i = 0; i < listAccount.size(); i++) {
            System.out.println(listAccount.get(i));
            System.out.println("--------------");
        }
    }


    public String getCNPJ() {
        return CNPJ;
    }

    public String getAdrress() {
        return address;
    }

    public void setAdrress(String address) {
        this.address = address;
    }
}
