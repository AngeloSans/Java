//package DesignPattern.Creational;
//
//
////Claro! O padrão Singleton é um padrão de design que garante que
////uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância.
////Isso é útil quando você deseja controlar estritamente como uma classe é instanciada, por exemplo,
////quando você quer garantir que exista apenas uma instância de uma classe que gerencia uma conexão com um banco de dados.
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Singleton {
//    public static void main(String[] args) {
//            Conection con = Conection.getConection();
//            con.ConectarDB();
//    }
//}
////vamo criar uma conexao com banco de dados usando o singleton
//class Conection {
//    //primeiro vai guarantir que o objeto não seja instanciado(static)
//    private static Conection con;
//
//    //Ao tornar o construtor privado, você impede a criação de novas instâncias
//    // da classe fora do escopo da própria classe. Isso é fundamental para garantir
//    // que apenas uma instância da classe seja criada e controlada pelo próprio Singleton.
//    private Conection() {
//    }
//
//    //pegar o objeto da classe
//    public static Conection getConection(){
//        if (con == null) {
//            con = new Conection();//se não tiver o metodo vai instanciar e pegar o objeto
//        }
//        return con;
//    }
//    public void ConectarDB(){
//        String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
//        String usuario = "Angelo";
//        String senha = "sua_senha";
//
//        Connection conexao = null;
//
//        try {
//            // Registre o driver JDBC
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Estabeleça a conexão com o banco de dados
//            conexao = DriverManager.getConnection(url, usuario, senha);
//
//            if (conexao != null) {
//                System.out.println("Conexão estabelecida com sucesso!");
//                // Faça aqui suas operações com o banco de dados
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
//        } catch (ClassNotFoundException e) {
//            System.out.println("Driver JDBC não encontrado.");
//        } finally {
//            try {
//                if (conexao != null) {
//                    conexao.close();
//                }
//            } catch (SQLException e) {
//                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
//            }
//        }
//    }
//
//
//}
