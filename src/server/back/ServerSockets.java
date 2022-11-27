package server.back;

import java.io.DataInputStream;
import java.net.ServerSocket;

public class ServerSockets {
    ServerSocket serverSocket;
    DataInputStream dataInputStream;

    public DataInputStream getDataInputStream() {
        return dataInputStream;
    }

    public void setDataInputStream(DataInputStream dataInputStream) {
        this.dataInputStream = dataInputStream;
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;

    }

    public ServerSockets() throws Exception{
        setServerSocket(new ServerSocket(7080));
    }
}
