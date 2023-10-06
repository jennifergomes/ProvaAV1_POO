package questao2;

public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
        if (duracaoTrabalho > 2){
            return true;
        }  else return false;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome Projeto: " +getNomeProjeto() + "\n" +
                "Descrição: " +getDescricao() + "\n" +
                "Data Inicio: " +getDataInicio() + "\n" +
                "Data Fim: " +getDataFim() + "\n" +
                "Tipo de Trabalho: " +getTipoTrabalho() + "\n" +
                "Duração do Trabalho: " +getDuracaoTrabalho();
    }
}
