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

public class Territory {
    protected String Owner;
    protected Integer Army;
    protected String Name;
    protected ArrayList<Territory> Neighbour;
    protected Attack ataque;
    
    public Territory (String Name, ArrayList<Territory> Neighbour){
        this.Owner = "FFFFFF";
        this.Army = 0;
        this.Name = Name;
        this.Neighbour = Neighbour;
        ataque = null;
    }
    
    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public Integer getArmy() {
        return Army;
    }

    public void setArmy(Integer Army) {
        this.Army = Army;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
                
    public void movesArmy(Territory toMove, String Color){
        int cantidad;
         if(Army > 1 && Color == Owner){
             for(int i = 0; i < Neighbour.size(); i++){
                 if(isNeighbour(toMove)){
                    if(toMove.getOwner() == Owner){
                        cantidad = toMove.getArmy();
                        Army = Army + 1;
                        cantidad = cantidad - 1;
                        toMove.setArmy(cantidad);
                    } 
                 }
                 else{}
             }
         }
    }
    
    public boolean isNeighbour(Territory Verificar){
        for(int i = 0; i < Neighbour.size(); i++){
            if(Neighbour.get(i) == Verificar){
                return true;
            }
        }        
          return false;
    }
    
    public boolean chooseTerritory(String newOwner){
        if(Owner == "FFFFFF"){
            Owner = newOwner;
            Army += 1;
            return true;
        }
        else{ return false;}
    }
    
    public boolean conquersTerritory(String newOwner){
        if(Owner != newOwner){
            Owner = newOwner;
            Army = 1;
            return true;}
        else return false;
    }
    
    public void addArmy(){
        Army += 1;
    }
    
    public void declaresAttack(Territory Defend){
        if(Owner == getOwner()){
            if(getArmy() > 1){
                if(isNeighbour(Defend)){
                    if(Owner != Defend.getOwner()){
                        if(Army > 3){
                            ataque = new Attack(3);
                        }
                        else{
                            ataque = new Attack(Army - 1);
                        }
                    }
                }
            }
        }
        
    }
}
