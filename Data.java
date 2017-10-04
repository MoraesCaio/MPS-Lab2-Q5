/**
 * Created by caiomoraes on 04/10/17.
 */
public class Data
{
    public int dia;
    public int mes;
    public int ano;
    public String data;

    public Data()
    {
        this(1, 1, 2001);
    }

    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.data = dia + "/" + mes + "/" + ano;
    }

    @Override
    public String toString()
    {
        return data;
    }
}
