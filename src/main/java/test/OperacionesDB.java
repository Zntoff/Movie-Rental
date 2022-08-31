
package test;

import beans.Peliculas;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OperacionesDB {
    
    public static void main(String[] args) {
        listarPeliculas();
        
    }
    
    public static void actualizarPeliculas(int id, String genero) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE peliculas SET genero = '" + genero + "' WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }  
         finally { con.desconectar();
        }  
    }
        
    public static void listarPeliculas() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM  peliculas";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                int copias = rs.getInt("copias");
                boolean novedad = rs.getBoolean("novedad");

                Peliculas pelicula = new Peliculas(id, titulo, genero, autor, copias, novedad);

                System.out.println(pelicula.toString());
            
            }
            st.execute(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
         finally { con.desconectar();
        }  
    }
}
