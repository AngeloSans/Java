//package DesignPattern.Behavior;
////Claro, o padrão de projeto Observer é um dos padrões comportamentais mais comuns em Java
////e é usado para criar uma relação de dependência entre um objeto (sujeito)
////e um ou mais objetos (observadores). Isso significa que quando o
////objeto sujeito muda de estado, todos os objetos observadores são notificados e atualizados automaticamente.
////Vou te mostrar um exemplo simples de como implementar o padrão Observer em Java:
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Observer {
//    public static void main(String[] args) {
//        Xtwitter twitter = new Xtwitter();
//
//        User user1 = new User("Angelo");
//
//        twitter.addUsuario(user1);
//        twitter.mostrarMensagem("ola a todes");
//    }
//}
////chamado o metodo quando ativar uma alteração
//interface Notification{
//    void atualizar(String mensage);
//}
//
//
////sujeito que mantem uma lista de observadores, notificando quando algo é postado
//class Xtwitter{
//    private List<Notification> notifications = new ArrayList<>();
//
//    public void addUsuario(Notification notification){
//        notifications.add(notification);
//    }
//    public void removerUsuario(Notification notification){
//        notifications.remove(notification);
//    }
//    public void notificarUsuario(String mensage){
//            for(Notification notification : notifications){
//                notification.atualizar(mensage);
//            }
//    }
//    public void mostrarMensagem(String mensage){
//        System.out.println("Nova mensagem " + mensage);
//        notificarUsuario(mensage);
//    }
//}
//class User implements Notification{
//    private String userName;
//
//    public User(String userName){
//        this.userName =userName;
//    }
//
//    @Override
//    public void atualizar(String mensage) {
//        System.out.println("Usuario " + userName + " recebeu uma mensagem!");
//    }
//}