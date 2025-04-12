package Cliente;

public class Cliente {
    private String name;
    private String birthday;
    private String CPF;

    public Cliente(String name, String birthday, String CPF){
        this.birthday = birthday;
        this.CPF = CPF;
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getCPF() {
        return CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}
