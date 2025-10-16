import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Projeto {
    private int id;
    private LocalDate dataRegistro;
    private String descricao;
    private ArrayList<Profissional> profissionais = new ArrayList<>();

    public Projeto(int id, LocalDate dataRegistro, String descricao, Profissional profissional){
        this.id = id;

    }
    
    public abstract void setId(int id);
}
