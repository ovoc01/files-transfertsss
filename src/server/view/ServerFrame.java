package server.view;

import javax.swing.*;
import java.awt.*;

public class ServerFrame extends JFrame {
    JScrollPane scrollPane;
    JButton download;
    JPanel panel;


    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JButton getDownload() {
        return download;
    }

    public void setDownload(JButton download) {
        this.download = download;
    }

    public ServerFrame(){
        displayElement();
    }

    public void displayElement(){

        panel = new JPanel();
        download = new JButton("download");
        download.setBounds(50,100,150,50);
        panel.add(download);
        panel.setLayout(null);
        scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);
        add(panel);
        setSize(400,400);
        setTitle("Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}
