package br.com.crud.dal;

import java.sql.*;

/**
 *
 * @author JohNelson
 */
public class ModuloConexao {

    //Método responsavel por estabelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;

        //Criando 3 variaveis 
        //2: Armazenando informações referente ao banco (Qual e o caminho e o nome do banco)
        String url = "jdbc:mysql://localhost:3306/projetocrud?useTimezone=true&serverTimezone=UTC";
        
        //3 e 4: O usuario que pode acessar o banco e a senha
        String user = "root";
        String passaword = "vivolgvivo";
        
        // Estabelecendo a conexão com o banco
        try {
            // conexao foi criado mas acima para  obter a conexão utilizando esses parâmetros (url, user, passaword)
            conexao = DriverManager.getConnection(url, user, passaword);
            
            return conexao;
        } catch (SQLException e) {
            //esclarece onde e qual eo erro  
            System.out.println(e.getMessage());
            
            return null;
        }
    }

}
