//package DesignPattern.Creational;
//
////Uma das principais vantagens do padrão Abstract Factory é que ele permite
////essa adaptação de classes e interfaces de acordo com as necessidades específicas do sistema
////ou do contexto em que você está trabalhando.
//
//
//public class AbstractFactory {
//    public static void main(String[] args) {
//        Device Iphone = new Iphonedevice();
//        foneOuvido foneIphone = Iphone.getFone();
//        Carregador carregadorIphone = Iphone.getCarregador();
//        foneIphone.escutar();
//        carregadorIphone.carregar();
//    }
//}
//
//interface foneOuvido{
//    void escutar();
//}
//interface Carregador{
//    void carregar();
//}
//
//class foneOuvidoIphone implements foneOuvido{
//
//    @Override
//    public void escutar() {
//        System.out.println("Fone de ouvido do Iphone ativado");
//    }
//}
//class carregadorIphone implements Carregador{
//
//    @Override
//    public void carregar() {
//        System.out.println("O carregador do Iphone está na tomada");
//    }
//}
//
//class foneOuvidoSansung implements foneOuvido{
//
//    @Override
//    public void escutar() {
//        System.out.println("Fone de ouvido do Sansung ativado");
//    }
//}
//
//class CarregadorSansung implements Carregador{
//
//    @Override
//    public void carregar() {
//        System.out.println("O carregador Sansung está na tomada");
//    }
//}
//interface Device{
//    foneOuvido getFone();
//    Carregador getCarregador();
//}
//
//class Iphonedevice implements Device{
//
//    @Override
//    public foneOuvido getFone() {
//        return new foneOuvidoIphone();
//    }
//
//    @Override
//    public Carregador getCarregador() {
//        return new carregadorIphone();
//    }
//}
//
//class Sansungdevice implements Device{
//
//    @Override
//    public foneOuvido getFone() {
//        return new foneOuvidoSansung();
//    }
//
//    @Override
//    public Carregador getCarregador() {
//        return new CarregadorSansung();
//    }
//}