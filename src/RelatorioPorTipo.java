import java.util.ArrayList;

public class RelatorioPorTipo implements Relatorio{
    private int tipo;//1 para publico, 2 para privado
    
    public RelatorioPorTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void formatarSaida(ArrayList<Projeto> projetos) {
        System.out.println("Relatorio por tipo");
        System.out.println(gerarRelatorio(projetos));
    }

    @Override
    public String gerarRelatorio(ArrayList<Projeto> projetos) {
        String relatorio = "";
        for(Projeto p : projetos){
            if(tipo == 1){
                if(p instanceof ProjetoPublico){
                    relatorio+= "Id: "+p.getId()+" | Descricao: "+p.getDescricao()+ "\n";
                }
            } else {
                if(p instanceof AtendimentoPrivado){
                    relatorio+= "Id: "+ p.getId() +"| Resumo: "+((AtendimentoPrivado)p).getResumo()+ "\n";
                }
            }
        }
        return relatorio;
    }
    
}
