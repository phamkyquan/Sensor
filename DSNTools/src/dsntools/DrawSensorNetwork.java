/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsntools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JPanel;


/**
 *
 * @author longy
 */
public class DrawSensorNetwork extends JPanel implements ActionListener {

    private int n,group;
    private HashMap<Integer,Sensor> mapSensors = null;
    
    public DrawSensorNetwork(int n, int group, HashMap<Integer,Sensor> sHashMap)
    {
        this.n = n;
        this.group = group;
        this.mapSensors = sHashMap;
    }
    
    private void doDrawing(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        for(int i = 0;i<group;i++)
        {
            Color cloColor = new Color((int)(Math.random() * 0x1000000));
            for(int j = (n/group)*i+1;j<=(n/group)*(i+1);j++)
            {
                Sensor s = mapSensors.get(j);
                g2d.drawOval(s.getX(), s.getY(), 4, 4); 
                g2d.drawLine(s.getX()+2, s.getY()+2, s.getDx(), s.getDy());
                if(i!=0)
                {
                    g2d.setColor(cloColor);
                    g2d.fillOval(s.getX(), s.getY(), 4, 4);
                }
            }
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }  
}
