public class Aplicacao {
    public static void main(String[] args) {
        Automovel a = new Automovel("Fusca", "verde", (byte)2);

        System.out.println(a.toString());
        System.out.println(a.quantoCusta());
        System.out.println(a.quantasPrestacoes());

        AutomovelBasico ab = new AutomovelBasico("Corsa", "cinza", (byte)1, true, true, false);

        System.out.println(ab.toString());
        System.out.println(ab.quantoCusta());
        System.out.println(ab.quantasPrestacoes());

        AutomovelLuxo al = new AutomovelLuxo("Ferrari Testarossa", "vermelha", (byte)3, true, true);

        System.out.println(al.toString());
        System.out.println(al.quantoCusta());
        System.out.println(al.quantasPrestacoes());
    }
}