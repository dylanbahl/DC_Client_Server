package serverSide;

import java.io.IOException;

import java.io.PrintWriter;

import java.net.ServerSocket;

import java.net.Socket;

import java.util.Date;

/**

* A TCP server that runs on port 7070. When a client connects, it

* sends the client the current date and time, then closes the

* connection with that client.

*/

public class Server {

    private static ServerSocket serverSocket;
    private static Socket socket;
    private static PrintWriter out;
    
	/**

     * Runs the server.

     */

    public static void main(String[] args) throws IOException {

        /* Create the socket listener

        * using ServerSocket Java class

        * for Listening on a socket.

        * Use port 7070*/

    	serverSocket = new ServerSocket(7070);

        System.out.println("ServerSocket running on port 7070");

        try {

            while (true) {

                /** To Do

                * Accept client connection here

                */

            	socket = serverSocket.accept();

               try {

                System.out.println("Now listening on port 9090");

                    out =

                        new PrintWriter(socket.getOutputStream(), true);

                    out.println(new Date().toString());

                } finally {

                System.out.println("terminated running on port 9090");

                /* close the communication channel here

                */
                out.close();
                    

                }

            }

        }

        finally {

        /* close the communication channel here

        */
        	serverSocket.close();
        	socket.close(); 

        }

    }

}