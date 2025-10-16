import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Profissional profissional1 = new Profissional("01010011", "Reginaldo");
        Profissional profissional2 = new Profissional("22222222", "Felipe");
        Profissional profissional3 = new Profissional("21321312", "Alisson");
        Profissional profissional4 = new Profissional("55555555", "Pedro");
        Profissional profissional5 = new Profissional("66666666", "Joao");

        sistema.addProfissional(profissional1);
        sistema.addProfissional(profissional2);
        sistema.addProfissional(profissional3);
        sistema.addProfissional(profissional4);
        sistema.addProfissional(profissional5);

        ProjetoPublico projetoPublico1 = new ProjetoPublico(LocalDate.now(), "Um projeto publico q n sei oq faz",
                profissional1, LocalDate.of(2025, 10, 1), LocalDate.of(2026, 12, 15));

        sistema.associarProfissionalProjeto(profissional2, projetoPublico1);

        AtendimentoPrivado atendimentoPrivado = new AtendimentoPrivado(LocalDate.now(),
                "Projeto privado de um cliente noss", profissional3, "Urbano", 2000);
        sistema.associarProfissionalProjeto(profissional4, atendimentoPrivado);
        sistema.addProjeto(projetoPublico1);
        sistema.addProjeto(atendimentoPrivado);

        GeradorRelatorio geradorRelatorio = new GeradorRelatorio(sistema.getProjetos());
        
        RelatorioCompleto relatorioCompleto = new RelatorioCompleto();
        RelatorioPorProfissional relatorioPorProfissional = new RelatorioPorProfissional(profissional3);
        RelatorioPorTipo relatorioPorTipo = new RelatorioPorTipo(2);
        RelatorioResumido relatorioResumido = new RelatorioResumido();

        geradorRelatorio.emitirRelatorio(relatorioCompleto);
        geradorRelatorio.emitirRelatorio(relatorioPorProfissional);
        geradorRelatorio.emitirRelatorio(relatorioPorTipo);
        geradorRelatorio.emitirRelatorio(relatorioResumido);
    }
}
