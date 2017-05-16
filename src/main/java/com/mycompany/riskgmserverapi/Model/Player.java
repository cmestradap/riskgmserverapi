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

public class Player extends UserUS{
    protected String Color;
    public String Turn;
    protected int Army;
    
    public Player(){}
    
    public Player(UserUS user, String color){
        this.Account = user.Account;
        this.Status = user.Status;
        this.Color = color;
        Turn = "False";
    }
    
    public void passTurn(){
        this.Turn = "False";        
    }
    
    public void acceptTurn(){
        this.Turn = "True";
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    } 
                
    public void obtainArmy(ArrayList<Continent> Continentes){
        int Territoriospropios = 0;
        
        for(int i = 0; i < Continentes.size(); i++){
            for(int j = 0; j < Continentes.get(i).Territories.size(); j++){
                if(Continentes.get(i).Territories.get(j).getOwner() == Color){
                    Territoriospropios++;
                }
            }
            if(Color == Continentes.get(i).getOwner()){
                Territoriospropios += Continentes.get(i).Territories.size();
            }
        }
        
        Army += Territoriospropios;
    }
    
}
