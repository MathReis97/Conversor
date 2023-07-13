public class Moeda {

    private static final double REAIS = 1;
    private static final double DOLAR = 4.82;
    private static final double EURO = 5.37;
    private static final double LIBRA = 6.26;
    private static final double PESO_ARGENTINO = 54.78;
    private static final double PESO_CHILENO = 168.4;

    public static double reaisDolar(double reais) {
        return reais / DOLAR;
    }

    public static double reaisEuro(double reais) {
        return reais / EURO;
    }

    public static double reaisLibra(double reais) {
        return reais / LIBRA;
    }

    public static double reaisPesoArgentino(double reais) {
        return reais * PESO_ARGENTINO;
    }

    public static double reaisPesoChileno(double reais) {
        return reais * PESO_CHILENO;
    }

    public static double dolarReais(double dolar) {
        return dolar / DOLAR;
    }

    public static double euroReais(double euro) {
        return euro / EURO;
    }

    public static double libraReais(double libra) {
        return libra / LIBRA;
    }

    public static double pesoArgentinoReais(double peso_argentino) {
        return peso_argentino / PESO_ARGENTINO;
    }

    public static double pesoChilenoReais(double peso_chileno) {
        return peso_chileno / PESO_CHILENO;
    }

}