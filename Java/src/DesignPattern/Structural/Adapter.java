//package DesignPattern.Structural;
////O padrão de projeto Adapter é um dos padrões estruturais,
////que visa permitir que objetos com interfaces incompatíveis trabalhem juntos.
////Ele atua como uma ponte entre duas interfaces incompatíveis,
////permitindo que objetos com interfaces diferentes cooperem.
//
//
//public class Adapter {
//    public static void main(String[] args) {
//        AdapterPaypal adaptador = new AdapterPaypal(new PayPalApi());
//        adaptador.procassarPagamentp(13.00);
//    }
//}
//
//interface Pagamento{
//    //crie sempre uma interface
//    void procassarPagamentp(double valor);
//}
////classe principal
//class PayPalApi{
//    void realizarPagamentoPayPal(double valor){
//        System.out.println("Pagamento realizado: " + valor);
//    }
//
//}
////class para integrar a API com a interface
//class AdapterPaypal implements Pagamento{
//    private PayPalApi api;
//
//    public AdapterPaypal(PayPalApi api){
//        this.api = api;
//    }
//
//    @Override
//    public void procassarPagamentp(double valor) {
//        api.realizarPagamentoPayPal(valor);
//    }
//}
