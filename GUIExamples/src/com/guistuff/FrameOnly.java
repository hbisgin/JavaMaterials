package com.guistuff;

import javax.swing.*;
import java.awt.*;

public class FrameOnly {
    public static void main(String[] args) {
        // Create FrameOnly object
        FrameOnly fObject = new FrameOnly();
        
        // Create the frame and panels
        JFrame frame = new JFrame("First Frame");
        JPanel panelEast = new JPanel();
        JPanel panelWest = new JPanel();
        JPanel midPanel = new JPanel(); // Add a middle panel to hold the label

        // Ensure the image paths are correct
        System.out.println(fObject.getClass().getResource("UM.png"));
        ImageIcon um = new ImageIcon(fObject.getClass().getResource("UM.png"));
        
        // Create buttons with images
        JButton buttonUM = new JButton(um);
        JButton buttonOSU = new JButton(new ImageIcon("OSU.png")); // Ensure the path to OSU.png is correct

        // Create JLabel and add to midPanel
        JLabel midLabel = new JLabel("Score Board", um, JLabel.CENTER); // Set the label text
        midPanel.add(midLabel); // Add label to the panel
        
        // Add buttons to their respective panels
        panelWest.add(buttonUM);
        panelEast.add(buttonOSU);
        
        // Add panels to the frame with BorderLayout
        frame.add(panelWest, BorderLayout.WEST);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(midPanel, BorderLayout.SOUTH); // Add midPanel to center
        
        // Set up frame properties
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
