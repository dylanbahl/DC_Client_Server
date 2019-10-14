package clientSide;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.InetSocketAddress;

import java.net.Socket;

import javax.swing.JOptionPane;

/**

* client for the date server.

*/

public class Client {

	private static Socket s;
    /**

     * Runs the client application to read date and time from the server side..

     */

    public static void main(String[] args) throws IOException {

        String serverAddress = "";

        /** To Do

         * Create a socket and connects it to the specified

         * port number you created in the server side.

         * Hint: Use the constructor with host name and port as parameters

         */

        s = new Socket("192.168.0.9", 7070);

        BufferedReader input =

            new BufferedReader(new InputStreamReader(s.getInputStream()));

        String serverTime = input.readLine();

        /** To Do

         * Write code to disconnect Here.

         */

        System.out.println("The server time is " + serverTime);
        

        System.exit(0);

    }

}