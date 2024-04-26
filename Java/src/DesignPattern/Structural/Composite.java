//package DesignPattern.Structural;
//import java.util.List;
//import java.util.ArrayList;
////O padrão Composite é um padrão de projeto estrutural que permite tratar objetos
////individuais e composições de objetos de maneira uniforme. Ele é usado para criar hierarquias de
////objetos onde os clientes podem tratar objetos individuais e composições de objetos de forma transparente,
////        ou seja, sem precisar saber se estão lidando com um objeto simples ou com uma estrutura complexa de objetos.
////
////A principal razão para usar o padrão Composite é quando você tem uma estrutura hierárquica de objetos que
////pode ser representada como uma árvore. Aqui estão alguns motivos pelos quais o padrão Composite é útil:
//
//
//public class Composite {
//    public static void main(String[] args) {
//            Arquivo arquivo1 = new Arquivo("Documento.word");
//            Arquivo arquivo2 = new Arquivo("Documento Excel");
//
//            Diretorio diretorioMain = new Diretorio("DiretorioMain");
//            diretorioMain.Adcionar(arquivo1);
//            diretorioMain.Adcionar(arquivo2);
//
//            Diretorio root = new Diretorio("Root");
//            root.Adcionar(arquivo1);
//            root.Adcionar(arquivo2);
//            root.Adcionar(new Arquivo("Foto.png"));
//            root.imprimirNome();
//    }
//}
//
//interface ComponenteArquivo{
//    void imprimirNome();
//}
//
//class Arquivo implements ComponenteArquivo{
//    private String nome;
//
//    public Arquivo(String nome){
//        this.nome = nome;
//    }
//
//    @Override
//    public void imprimirNome() {
//        System.out.println("O arquivo é :" + nome);
//    }
//}
//class Diretorio implements ComponenteArquivo{
//    private String nome;
//    private List<ComponenteArquivo> elementos = new ArrayList();
//    public Diretorio(String nome){
//        this.nome = nome;
//    }
//
//    public void Adcionar(ComponenteArquivo elemento){
//        elementos.add(elemento);
//    }
//
//    @Override
//    public void imprimirNome() {
//        System.out.println("Diretorio:  " + nome);
//
//        for(ComponenteArquivo elemento : elementos){
//            elemento.imprimirNome();
//        }
//    }
//}