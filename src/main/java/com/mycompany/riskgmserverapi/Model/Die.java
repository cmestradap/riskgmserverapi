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

public class Die {
    private String Type;
    private Integer ID;
    private Integer Value;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer Value) {
        this.Value = Value;
    }
    
    public int Rolls(){
        Value = (int) (Math.random() * 6) + 1;
        return Value;
    }    
}
