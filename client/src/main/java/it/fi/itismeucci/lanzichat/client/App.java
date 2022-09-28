package it.fi.itismeucci.lanzichat.client;

public class App 
{
    public static void main( String[] args )
    {
        ClientStr cliente = new ClientStr();
        cliente.connetti();
        cliente.comunica();
    }
}
