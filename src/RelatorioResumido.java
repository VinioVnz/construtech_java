import java.util.ArrayList;

public class RelatorioResumido implements Relatorio{

    @Override
    public void formatarSaida(ArrayList<Projeto> projetos) {
        System.out.println("Relatorio resumido");
        System.out.println(gerarRelatorio(projetos));
    }

    @Override
    public String gerarRelatorio(ArrayList<Projeto> projetos) {
        String relatorio = "";
        for(Projeto p : projetos){
            if(p instanceof ProjetoPublico){
                relatorio+= "Id: "+p.getId()+ "| Info: "+p.getDescricao()+ "\n";
            }
            else{
                relatorio+= "Id: "+p.getId()+ "| Info: "+((AtendimentoPrivado)p).getResumo()+ "\n";
            }
        }
        return relatorio;
    }
    
}   
