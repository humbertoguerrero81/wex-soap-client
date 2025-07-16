package com.cpsmart.wexclient;

public class WexClientTest {
    public static void main(String[] args) {
        try {
            // Cliente y puerto
            CardManagementWS client = new CardManagementWS();
            CardManagementEP port = client.getCardManagementEPPort();

            // Login WEX (solo usuario y clave)
            String usuario = args.length > 0 ? args[0] : "demoUser";
            String clave = args.length > 1 ? args[1] : "demoPass";

            String token = port.login(usuario, clave);
            System.out.println("Token recibido: " + token);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
