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

public class Session {
    public Integer Id;
    public String State;
    public Integer NumberOfPlayers;
    public String Type;
    public Map Map;
    public Player Host;
    public ArrayList<Player> players;
    ArrayList<String> Colors;
    
    public Session(Player host){
        Id = 0;
        State = "None";
        NumberOfPlayers = 0;
        Type = "None";
        Map = null;
        Host = host;
        players = null;
        Colors.add("#00FF00");
        Colors.add("#A020F0");
        Colors.add("#FFA500");
        Colors.add("#0000FF");
        Colors.add("#FFFF00");
        Colors.add("#FF0000");
        
    }
    
    public void CreateSession(String Username, Host Player){
            Id = Id + 1;
            State = "Choosing options";
            Host = Player;
            Host.setColor(Colors.get(0));
            Colors.remove(0);
    }
    
    public void ChooseInitialSetup(String mapName, int NumberofPlayers , String type, ArrayList<Map> Maps){
            ChooseMap(mapName, Maps);
            ChooseNPlayers(NumberofPlayers);
            ChooseType(type);
    }
    
    
    public int ChooseNPlayers(Integer Numberofplayers){
        if(Numberofplayers > 6 && Numberofplayers < 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public void ChooseMap(String MapName, ArrayList<Map> Maps){
        int i;
        for(i = 0; i < Maps.size(); i++){
            if(Maps.get(i).getName().equals(MapName)){
                Map = Maps.get(i);
                break;
            }
        }
    }
    
    public void ChooseType(String Type){}
    
    public void StarSession(){
        if(Map != null && NumberOfPlayers != 0 && Type != "None"){    
        State = "Playing";}
            
    }
    
    public void addPlayer(Player player){
        player.setColor(Colors.get(0));
        Colors.remove(0);
        players.add(player);
    }
    
    public String getState(){
        return this.State;
    }
    
    public void setState(String state){
        this.State = state;
    }
    
}
