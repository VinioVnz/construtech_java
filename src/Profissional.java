public class Profissional {
    private int id;
    private String cpf;
    private String nome;
    private static int contador = 1;
    public Profissional(String cpf, String nome){
        setId();
        setCpf(cpf);
        setNome(nome);
    }

    public void setId(){
        id = contador++;
    }

    public int getId(){
        return id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }
}
