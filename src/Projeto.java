import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Projeto {
    private int id;
    private LocalDate dataRegistro;
    private String descricao;
    private ArrayList<Profissional> profissionais = new ArrayList<>();
    private static int contador = 1;
    public Projeto(LocalDate dataRegistro, String descricao, Profissional profissional) {
        setId();
        this.dataRegistro = dataRegistro;
        this.descricao = descricao;
        this.profissionais.add(profissional);
    }

    public void setId() {
        id = contador++;
    }

    public void addProfissional(Profissional profissional) {
        profissionais.add(profissional);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Profissional> getProfissionais() {
        return profissionais;
    }

}
