import java.util.ArrayList;

public class RelatorioPorProfissional implements Relatorio{
    Profissional profissional;
    
    public RelatorioPorProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    @Override
    public void formatarSaida(ArrayList<Projeto> projetos) {
        System.out.println("Relatorio por profissional:");
        System.out.println(gerarRelatorio(projetos));
    }

    @Override
    public String gerarRelatorio(ArrayList<Projeto> projetos) {
        String relatorio = "";
        for(Projeto p : projetos){
            if(p.getProfissionais().contains(profissional)){
                relatorio+= "Id: "+p.getId()+" | Descricao: "+p.getDescricao()+ "\n";
            }
        }
        return relatorio;
    }

}
