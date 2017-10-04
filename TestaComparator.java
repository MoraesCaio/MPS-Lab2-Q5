import java.util.Set;
import java.util.TreeSet;

/**
 * Created by caiomoraes on 04/10/17.
 */
public class TestaComparator
{
    public static void main(String[] args)
    {
        Set<Pessoa> porNomeECpf = new TreeSet<Pessoa>(new ComparadorNome());
        Set<Pessoa> porData = new TreeSet<Pessoa>(new ComparadorData());

        Pessoa pessoa1 = new Pessoa("111.111.111-11", "C", new Data(1, 1, 1));
        Pessoa pessoa2 = new Pessoa("444.444.444-44", "D", new Data(4, 5, 5));
        Pessoa pessoa3 = new Pessoa("333.333.333-33", "A", new Data(3, 4, 5));
        Pessoa pessoa4 = new Pessoa("555.555.555-55", "E", new Data(5, 5, 5));
        Pessoa pessoa5 = new Pessoa("222.222.222-22", "C", new Data(2, 2, 2));

        porNomeECpf.add(pessoa1);
        porNomeECpf.add(pessoa2);
        porNomeECpf.add(pessoa3);
        porNomeECpf.add(pessoa4);
        porNomeECpf.add(pessoa5);

        porData.add(pessoa1);
        porData.add(pessoa2);
        porData.add(pessoa3);
        porData.add(pessoa4);
        porData.add(pessoa5);

        System.out.println("Ordenando por Nome e CPF");
        for (Pessoa pessoa : porNomeECpf)
        {
            System.out.println(pessoa);
        }

        System.out.println("\nOrdenando por Data");
        for (Pessoa pessoa : porData)
        {
            System.out.println(pessoa);
        }

    }
}
