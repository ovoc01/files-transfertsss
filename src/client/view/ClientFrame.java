package client.view;

import client.back.ClientSocket;
import client.listener.FileChooserListener;
import client.listener.FileSenderListener;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class ClientFrame extends JFrame {
    JButton chooseFile;
    JButton sendFile;
    JFileChooser fileChooser;
    JLabel text;
    ClientSocket clientSocket;

    public ClientSocket getClientSocket() {
        return clientSocket;
    }

    public void setClientSocket(ClientSocket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public JLabel getText() {
        return text;
    }

    public void setText(JLabel text) {
        this.text = text;
    }

    ArrayList<File> fileList;

    public JButton getChooseFile() {
        return chooseFile;
    }

    public void setChooseFile(JButton chooseFile) {
        this.chooseFile = chooseFile;
    }

    public JButton getSendFile() {
        return sendFile;
    }

    public void setSendFile(JButton sendFile) {
        this.sendFile = sendFile;
    }

    public JFileChooser getFileChooser() {
        return fileChooser;
    }

    public void setFileChooser(JFileChooser fileChooser) {
        this.fileChooser = fileChooser;
    }

    public ClientFrame(){
        displayElement();
        configureListener();
    }

    public ArrayList<File> getFileList() {
        return fileList;
    }

    public void setFileList(ArrayList<File> fileList) {
        this.fileList = fileList;
    }

    void displayElement(){
        text = new JLabel("Choose a file to send");
        text.setBounds(125,100,200,50);
        fileList = new ArrayList<>();
        fileChooser = new JFileChooser();
        chooseFile = new JButton("Choose files");
        sendFile = new JButton("Send");
        sendFile.setBounds(50,200,150,50);
        chooseFile.setBounds(225,200,150,50);
        add(sendFile);
        add(text);
        add(chooseFile);
        setLayout(null);
        setTitle("Client");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void configureListener(){
        chooseFile.addMouseListener(new FileChooserListener(this,chooseFile));
        sendFile.addMouseListener(new FileSenderListener(this,sendFile));
    }
}
