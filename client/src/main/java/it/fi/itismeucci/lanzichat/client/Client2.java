package it.fi.itismeucci.lanzichat.client;

import java.io.*;
import java.net.*;

public class Client2 {
    String nomeServer = "localhost"; // indirizzo del server
    int portaServer = 12121; // porta per servizio
    DataInputStream in; // stream di input
    DataOutputStream out; // stream di output

    protected Socket connetti() throws IOException {
        Socket socket = new Socket(nomeServer, portaServer);
        out = new DataOutputStream(socket.getOutputStream());
        in = new DataInputStream(socket.getInputStream());
    
        return socket;
    }
}

