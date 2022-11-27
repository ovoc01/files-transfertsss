package client.listener;

import client.view.ClientFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FileSenderListener implements MouseListener {
    ClientFrame clientFrame;
    JButton button;
    public FileSenderListener(ClientFrame c,JButton b){
        clientFrame = c;
        button = b;
    }
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        if(clientFrame.getFileList().size()<1){
            clientFrame.getText().setText("No files choose");
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
