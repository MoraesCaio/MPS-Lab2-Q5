/**
 * Created by caiomoraes on 04/10/17.
 */
public class Pessoa
{
    public String cpf;
    public String nome;
    public Data dataNascimento;

    public Pessoa()
    {
        this("111.111.111-11", "Nome e Sobrenome", new Data());
    }

    public Pessoa(String cpf, String nome, Data dataNascimento)
    {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString()
    {
        return "Cpf: " + cpf + "\nNome: " + nome + "\nData de Nascimento: " + dataNascimento;
    }
}
