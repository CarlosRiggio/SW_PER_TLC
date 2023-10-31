package T15;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Cambia esto a la dirección del servidor si es necesario
        int serverPort = 12345; // El mismo puerto al que el servidor está escuchando

        try {
            Socket clientSocket = new Socket(serverAddress, serverPort);
            System.out.println("Conectado al servidor en " + serverAddress + ":" + serverPort);

            // Crea flujos de entrada y salida para la comunicación con el servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Envía un mensaje al servidor
            String message = "Hola, servidor!";
            out.println(message);
            System.out.println("Enviado: " + message);

            // Recibe la respuesta del servidor
            String response = in.readLine();
            System.out.println("Respuesta del servidor: " + response);

            // Cierra la conexión
            clientSocket.close();
            System.out.println("Conexión cerrada.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

