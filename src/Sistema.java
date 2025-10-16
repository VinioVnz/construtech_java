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
    
    public void addProfissional(Profissional profissional){
        profissionais.add(profissional);
    }

    public void addProjeto(Projeto projeto){
        projetos.add(projeto);
    }

    public void removeProfissional(Profissional profissional){
        profissionais.remove(profissional);
    }
    
    public void removeProjeto(Projeto projeto){
        projetos.remove(projeto);
    }
    
}
