import java.util.ArrayList;

public class Sistema {
    private ArrayList<Profissional> profissionais = new ArrayList<>();
    private ArrayList<Projeto> projetos = new ArrayList<>();

    public ArrayList<Profissional> getProfissionais() {
        return profissionais;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void associarProfissionalProjeto(Profissional profissional, Projeto projeto) {
        if (profissionais.contains(profissional)) {
            projeto.addProfissional(profissional);
            System.out.println("Profissional associado");
        } else {
            System.out.println("Profissional não existe no sistema");
        }

    }

    public void addProfissional(Profissional profissional){
        for (Profissional p : profissionais) {
        if (p.getCpf().equals(profissional.getCpf())) {
            System.out.println("Erro, ja existe um profissional com esse cpf: " + profissional.getCpf());
            return;
        }
    }
    profissionais.add(profissional);
    System.out.println("Profissional adicionado com sucesso!");
    }

    public void addProjeto(Projeto projeto) {
        System.out.println("Projeto adicionado");
        projetos.add(projeto);
    }

    public void removeProfissional(Profissional profissional) {
        profissionais.remove(profissional);
    }

    public void removeProjeto(Projeto projeto) {
        projetos.remove(projeto);
    }

}
