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

public class Attack {
    private Integer ID;
    private Integer Army;
    private ArrayList<Die> dados;
    
    public Attack(int numerodeDados){
            for(int i = 0; i < numerodeDados; i++){
                dados.add(new Die());
            }
            
            Army = 1;
        }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getArmy() {
        return Army;
    }

    public void setArmy(Integer Army) {
        this.Army = Army;
    }
    
}
