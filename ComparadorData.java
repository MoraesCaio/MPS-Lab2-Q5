import java.util.Comparator;

/**
 * Created by caiomoraes on 04/10/17.
 */
public class ComparadorData implements Comparator<Pessoa>
{
    @Override
    public int compare(Pessoa o1, Pessoa o2)
    {
        if (o1.dataNascimento.ano == o2.dataNascimento.ano)
        {
            if (o1.dataNascimento.mes == o2.dataNascimento.mes)
            {
                return Integer.compare(o1.dataNascimento.dia, o2.dataNascimento.dia);
            }
            return Integer.compare(o1.dataNascimento.mes, o2.dataNascimento.mes);
        }
        return Integer.compare(o1.dataNascimento.ano, o2.dataNascimento.ano);
    }
}
