/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.riskgmserverapi;

/**
 *
 * @author ASUS
 */

import static spark.Spark.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class Main {
    
     public static void main(String[] args) {

        port(8008);

        post("/createUser", (req, res)
                -> {
            /*hola*/
            JSONParser parser = new JSONParser();
            String s = "[" + req.body() + "]";

            Object obj = parser.parse(s);
            JSONArray array = (JSONArray) obj;

            JSONObject obj2 = (JSONObject) array.get(0);

            String username = (String) obj2.get("username");
            String password = (String) obj2.get("password");
            String email = (String) obj2.get("email");

            User usuario = new User(username, password, email);

            boolean respuesta = UserCRUD.create(Conexion.obtener(), usuario);

            if (respuesta == true) {
                return "Se creo con exito el usuario";
            } else {
                return "Ocurrio un error";
            }
        });
       
    }
}
    

