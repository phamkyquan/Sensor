/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsntools;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author longy
 */
public class Sensor {
    private int x,y,dx,dy;
    private double radius;
    private float angle, timeLife;
    private ArrayList<Integer> listAdjactent;
    public Sensor() {
    }

    public Sensor(int x, int y, double radius, float angle, float timeLife) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.angle = angle;
        this.timeLife = timeLife;
    }

    public Sensor(int x, int y, int dx, int dy, double radius, float angle, float timeLife) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = radius;
        this.angle = angle;
        this.timeLife = timeLife;
    }

    public ArrayList<Integer> getListAdjactent() {
        return listAdjactent;
    }

    public void setListAdjactent(ArrayList<Integer> listAdjactent) {
        this.listAdjactent = listAdjactent;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getTimeLife() {
        return timeLife;
    }

    public void setTimeLife(float timeLife) {
        this.timeLife = timeLife;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
//    public boolean checkconnect(Sensor s1, Sensor s2){
//       double lengthS1S2 = Math.sqrt(Math.pow( (s2.getX()-s1.getX()) ,2 )+ Math.pow( (s2.getY()-s1.getY()) ,2));
//       double xS1S2=(s2.getX()-s1.getX());
//       double yS1S2=(s2.getY()-s1.getY());
//       double xDS1=(s1.getDx()-s1.getX());
//       double yDS1=(s1.getDy()-s1.getY());
//       if(lengthS1S2 <= s1.getRadius() && (xS1S2*xDS1+yS1S2*yDS1) >= (Math.cos(s1.getAngle())*lengthS1S2)){
//               return true;
//       }
//       else return false;
//    }
//    public void findAdjacent(HashMap<Integer,Sensor> x){
//        x.forEach((key, value) -> {
//            x.forEach( (key2, value2) -> {
//               if(checkconnect(value,value2)){
//                   value.listAdjactent.add(key2);
//               }
//            });
//        });
//    }
//    public void addsensor(Sensor s1,Sensor s2,StoreClass s)
//    {
//        for(int i=1;i< s.getN0();i++){
//            double lengthS1S2 = Math.sqrt(Math.pow( (s2.getX()-s1.getX()) ,2 )+ Math.pow( (s2.getY()-s1.getY()) ,2));
//            double xS1S2=(s2.getX()-s1.getX());
//            double yS1S2=(s2.getY()-s1.getY());
//            double xDS1=(s1.getDx()-s1.getX());
//            double yDS1=(s1.getDy()-s1.getY());
//            if(lengthS1S2 <= s1.getRadius() && (xS1S2*xDS1+yS1S2*yDS1) >= (Math.cos(s1.getAngle())*lengthS1S2)){
//                lisadjacent.put(i,s2);
//            }
//        }
//        
//    }
    public void drawSensor()
    {
        
    }
    
}
