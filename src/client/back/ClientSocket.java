package client.back;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.file.Path;

public class ClientSocket {
    Socket socket;
    FileInputStream fileInputStream;
    DataOutputStream dataOutputStream;
    File files;

    public File getFiles() {
        return files;
    }

    public void setFiles(File files) {
        this.files = files;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public FileInputStream getFileInputStream() {
        return fileInputStream;
    }

    public void setFileInputStream(FileInputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public DataOutputStream getDataOutputStream() {
        return dataOutputStream;
    }

    public void setDataOutputStream(DataOutputStream dataOutputStream) {
        this.dataOutputStream = dataOutputStream;
    }

    public ClientSocket(File path) throws Exception{
        setFiles(path);
        setSocket(new Socket("localhost",7080));
        setFileInputStream(new FileInputStream(path.getAbsolutePath()));
        setDataOutputStream(new DataOutputStream(getSocket().getOutputStream()));
    }

    public void sendFile() throws IOException {
        String filename = getFiles().getName();
        byte[] fileNameBytes = filename.getBytes();
        byte[] fileContent = new byte[(int) getFiles().length()];
        getFileInputStream().read(fileContent);

        getDataOutputStream().writeInt(fileNameBytes.length);
        getDataOutputStream().write(fileNameBytes);

        getDataOutputStream().writeInt(fileContent.length);
        getDataOutputStream().write(fileContent);
    }
}
