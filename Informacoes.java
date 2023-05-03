import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Informacoes {

    private String nome;
    private Long cpf;
    private String endereco;
    private Long telefone;
    private String cidade;
    private String estado;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente (" +
                "Nome:'" + nome + '\'' +
                ", CPF: " + cpf +
                ", Endereco: '" + endereco + '\'' +
                ", Telefone: " + telefone +
                ", Cidade: '" + cidade + '\'' +
                ", Estado: '" + estado + '\'' +
                ')';
    }
}

