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
    
*/
package com.mycompany.riskgmserverapi.Model;

import java.util.ArrayList;

/**
 *
 * @author Jimmy
 */
public class Map {
    public String Name;    
    public ArrayList<Continent> Continents;
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}
