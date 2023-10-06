package questao2;

public class ProjetoSocial {

    public static void main(String[] args) {

        String menu = """
             
            1- Destribuição de Alimentos.
            2- Trabalho Voluntário.
            3- Sair.
        
            """;
        int opcao;

        DestribuicaoAlimento D1 = new DestribuicaoAlimento("Minha Alimentação", "Alimento Barato", "Rua A", "24/11/2023", "12/12/2023", "Cesta Básica", 100);

        TrabalhoVoluntario TV1 = new TrabalhoVoluntario("Pintar Muros", "Pintar muros de edíficios públicos", "Rua B", "15/11/2023", "18/12/2023", "Voluntário", 12);

    }
}
