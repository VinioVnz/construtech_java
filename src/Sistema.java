import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Profissional> profissionais = new ArrayList<>();
    private ArrayList<Projeto> projetos = new ArrayList<>();

    public ArrayList<Profissional> getProfissionais(){
        return profissionais;
    }

    public ArrayList<Projeto> getProjetos(){
        return projetos;
    }
}
