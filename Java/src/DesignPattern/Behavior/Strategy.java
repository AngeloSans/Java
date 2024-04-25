//package DesignPattern.Behavior;
//
////o padrão Strategy permite que você tenha várias maneiras de realizar uma tarefa,
////encapsulando cada maneira em sua própria classe e permitindo que você escolha
////qual maneira usar em tempo de execução. Isso torna o código mais
////flexível e fácil de modificar, pois você pode alternar entre diferentes estratégias
////sem alterar o código que as utiliza.
//
//public class Strategy {
//    public static void main(String[] args) {
//        TipoPagamento tipoPagamento = new TipoPagamento();
//
//        //cartao
//        tipoPagamento.EscolherPagamento(new Cartao());
//        tipoPagamento.Processar(8000.00);
//        //pix
//        tipoPagamento.EscolherPagamento(new Pix());
//        tipoPagamento.Processar(50.00);
//        //money
//        tipoPagamento.EscolherPagamento(new Dinheiro());
//        tipoPagamento.Processar(200.00);
//
//
//    }
//}
//
//interface MetodoPagamento{
//    void ProcessarPagamento(double valor);
//}
//class Dinheiro implements MetodoPagamento{
//
//    @Override
//    public void ProcessarPagamento(double valor) {
//        System.out.println("Efetuando pagamento no dinheiro de : " + valor);
//    }
//}
//
//class Cartao implements MetodoPagamento{
//
//    @Override
//    public void ProcessarPagamento(double valor) {
//        System.out.println("Efetuando pagamento no Cartao de : " + valor);
//    }
//}
//class Pix implements MetodoPagamento{
//
//    @Override
//    public void ProcessarPagamento(double valor) {
//        System.out.println("Efetuando pagamento no Pix de : " + valor);
//    }
//}
////classe que vai usar o strategy
//
//class TipoPagamento{
//    private MetodoPagamento metodoPagamento;
//
//    public void EscolherPagamento(MetodoPagamento metodoPagamento){
//        this.metodoPagamento = metodoPagamento;
//    }
//    public void Processar(double valor){
//        metodoPagamento.ProcessarPagamento(valor);
//    }
//
//}
