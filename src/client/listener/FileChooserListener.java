package client.listener;

import client.back.ClientSocket;
import client.view.ClientFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class FileChooserListener implements MouseListener {
    ClientFrame clientFrame;
    JButton button;
    public FileChooserListener(ClientFrame frame,JButton b){
        clientFrame = frame;
        button = b;
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
       int response =  clientFrame.getFileChooser().showOpenDialog(null);
       if(response==JFileChooser.APPROVE_OPTION){
           try{
               clientFrame.setClientSocket(new ClientSocket( clientFrame.getFileChooser().getSelectedFile()));
               clientFrame.getFileList().add(clientFrame.getFileChooser().getSelectedFile().getAbsoluteFile());
               clientFrame.getText().setText("The file you choose is:"+
                       clientFrame.getFileList().get(clientFrame.getFileList().size()-1).getName());

               clientFrame.getClientSocket().sendFile();
           }catch(Exception e){
               e.printStackTrace();
           }

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
