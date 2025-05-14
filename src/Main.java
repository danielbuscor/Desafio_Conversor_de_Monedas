public class Main {
    public static void main(String[] args) {
        ConsultaConversion consulta = new ConsultaConversion();
        double resultado = consulta.realizaConversion("USD", "BOB", 2000);
        System.out.println(resultado);
    }
}