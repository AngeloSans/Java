//package DesignPattern.Creational;
////Vamos simplificar um pouco. O padrão Factory Method é útil quando você tem um código que precisa criar objetos,
////mas você quer que o tipo desses objetos seja determinado em tempo de execução.
//
//public class FactoryMethod {
//    public static void main(String[] args) {
//        FactoryPedidos factoryComidas = new FactoryPedidosComida();
//        Pedido pedidoComida = factoryComidas.criarPedido();
//        pedidoComida.processsar();
//
//    }
//}
//
//interface Pedido{
//    void processsar();
//}
//
//class PedidoComida implements Pedido{
//
//    @Override
//    public void processsar() {
//    System.out.println("Processando pedido de Comida");
//    }
//}
//class PedidoBebida implements Pedido{
//
//    @Override
//    public void processsar() {
//        System.out.println("Processando pedido de Bebida");
//    }
//}
//interface FactoryPedidos{
//    Pedido criarPedido();
//}
//
//class FactoryPedidosComida implements FactoryPedidos{
//
//    @Override
//    public Pedido criarPedido() {
//        return new PedidoComida();
//    }
//}
//
//class FactoryPedidosBebida implements FactoryPedidos{
//
//    @Override
//    public Pedido criarPedido() {
//        return new PedidoBebida();
//    }
//}