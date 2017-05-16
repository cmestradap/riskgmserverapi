/*
Authors:
    Group #5:
       - Jaime Alejandro Gallego Ramirez cc: 1036643764
       - Carlos Mario Estrada Puerta cc: 1040750886
       - Andres Felipe Arredondo Hernandez cc: 1152214817
       - Santiago Saldarriaga Sucerquia cc:1152708184
       - Alejandro Gaviria Sepulveda cc:1036947628

    Requirements Engineering
    National University, Computer Science 
    Universidad Nacional de Colombia Sede Medellin
    
package com.mycompany.riskgmserverapi;

/**
 *
 * @author ASUS
 */

package com.mycompany.riskgmserverapi;
import java.sql.*;

public class Conexion {
    private static Connection cnx = null;
    private static final String ip = "localhost";
    
    public static Connection obtener() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if (cnx == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:8889/requisitos", "root", "");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return cnx;
    }

    public static void cerrar() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }
    
}
