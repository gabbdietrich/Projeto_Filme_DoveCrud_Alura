package br.com.alura.dovecrud.domain.filme;

public class Filme {

    private String nome;
    private Integer duracaoMinutos;
    private Integer anoLancamento;
    private String genero;

    public Filme(DadosCadastroFilme dados){
        this.nome= dados.nome();
        this.duracaoMinutos= dados.duracao();
        this.genero= dados.genero();
        this.anoLancamento= dados.ano();

    }
    public String getNome() {
        return nome;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoMinutos=" + duracaoMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
