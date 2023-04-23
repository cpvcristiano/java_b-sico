public class MinhaCasse {
    public static void main(String[] args) {
        String primeiroNome = "José";
        String segundoNome = "Figueiredo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "NOME DO USUÁRIO : " + primeiroNome.concat("  ").concat(segundoNome);
    }
}
