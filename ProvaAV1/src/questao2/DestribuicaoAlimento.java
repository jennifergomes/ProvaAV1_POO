package questao2;

public class DestribuicaoAlimento extends Projeto {

    private String descAlimento;
    private float qtde;

    public DestribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return this.descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return this.qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto(String nomeProjeto) {
       if(getDataFim().equals("")){
           return true;
       } else return false;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome Projeto: " +this.getNomeProjeto() + "\n" +
                "Descrição: " +this.getDescricao() + "\n" +
                "Data Inicio: " +this.getDataInicio() + "\n" +
                "Data Fim: " +this.getDataFim() + "\n" +
                "Descrição do Alimento: " +this.getDescAlimento() + "\n" +
                "Quantidade: " +this.getQtde();
    }
}
