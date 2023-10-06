package questao1;

public class Encontrar {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Jennifer", "jennifer@gmail.com", "123456789" );
        AchadoPerdido achadoPerdido1 = new AchadoPerdido("Achado 1", "Caderno", "Caderno de aluno", "Guardado");

        achadoPerdido1.buscarTitulo("Achado1");
        System.out.println(achadoPerdido1.buscarTitulo("Achado1"));


    }
}