//package DesignPattern.Behavior;
////O padrão Command é útil quando você quer tratar uma ação específica como um objeto.
////Isso significa que você pode empacotar uma solicitação (como uma ação a ser realizada)
////dentro de um objeto. Essa solicitação é então tratada por um objeto separado,
////o qual você pode enviar, armazenar e manipular como qualquer outro objeto em sua aplicação.
//
//
//public class Command {
//    public static void main(String[] args) {
//        RemoteControll remoteControll = new RemoteControll();
//        action ligar = new Ligar(remoteControll);
//        action desligar = new Desligar(remoteControll);
//
//        Acionar acionar = new Acionar();
//        acionar.setAction(ligar);
//        acionar.ExcutarAction();
//        acionar.setAction(desligar);
//        acionar.ExcutarAction();
//    }
//}
//interface action{
//    void executar();
//}
//
//class Ligar implements action{
//    private RemoteControll remoteControll;
//
//    public Ligar(RemoteControll remoteControll){
//        this.remoteControll = remoteControll;
//    }
//
//
//    @Override
//    public void executar() {
//        remoteControll.Ligar();
//    }
//}
//class Desligar implements action{
//    private RemoteControll remoteControll;
//
//    public Desligar(RemoteControll remoteControll){
//        this.remoteControll = remoteControll;
//    }
//
//
//    @Override
//    public void executar() {
//        remoteControll.Desligar();
//    }
//}
//
//class RemoteControll{
//    public void Ligar(){
//        System.out.println("Esta ligado!");
//    }
//    public void Desligar(){
//        System.out.println("Esta desligador");
//    }
//
//}
//
//class Acionar{
//    private action action;
//
//    public void setAction(action action){
//        this.action = action;
//    }
//    public void ExcutarAction(){
//        action.executar();
//    }
//
//
//}
