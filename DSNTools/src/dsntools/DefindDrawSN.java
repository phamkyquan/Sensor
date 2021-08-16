/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsntools;

import java.util.HashMap;
import javax.swing.JFrame;

/**
 *
 * @author longy
 */
public final class DefindDrawSN  extends JFrame{
    public DefindDrawSN(int n, int group, int w, int h, HashMap<Integer,Sensor> sHashMap)
    {
        initUI(n,group,w,h,sHashMap);
    }
    public void initUI(int n, int group, int w, int h,HashMap<Integer,Sensor> sHashMap){
        DrawSensorNetwork drawSensorNetwork1 =  new DrawSensorNetwork(n, group, sHashMap);
        add(drawSensorNetwork1);
        setTitle("Draw Sensor Network");
        setSize(w,h);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
    }
}
