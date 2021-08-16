package dsntools;
import exceptionpackage.*;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author longy
 */
public class MainFarme extends javax.swing.JFrame {
    private StoreClass storeClass =  new StoreClass();
    private HashMap<Integer,Sensor> sensorMap = new HashMap();  
    private HashMap<Integer,Sensor> sensorMapTemp = new HashMap();
    /**
     * Creates new form MainFarme
     */
    public MainFarme() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRadius = new javax.swing.JTextField();
        jTextFieldOffsetAngle = new javax.swing.JTextField();
        jTextFieldLifeTime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldHeight = new javax.swing.JTextField();
        jTextFieldWidth = new javax.swing.JTextField();
        jTextFieldCoverage = new javax.swing.JTextField();
        jTextFieldT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonCal = new javax.swing.JButton();
        jButtonDrawSensor = new javax.swing.JButton();
        jButtonExcute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Directional Sensor Network Tool");

        jLabel9.setText("-----------------------------------------------------------------------------------------------------------------------------------");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Sensor Properties");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Radius(m)");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Offset angle(0<x<180)");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("LifeTime(s)");

        jTextFieldRadius.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldRadius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRadiusActionPerformed(evt);
            }
        });

        jTextFieldOffsetAngle.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldOffsetAngle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOffsetAngleActionPerformed(evt);
            }
        });

        jTextFieldLifeTime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextFieldLifeTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLifeTimeActionPerformed(evt);
            }
        });

        jLabel10.setText("-----------------------------------------------------------------------------------------------------------------------------------");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Area");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Height(m)");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Width(m)");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Coverage rate(0<p<=1)");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Lifetime of Network(s)");

        jTextFieldHeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextFieldWidth.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextFieldCoverage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextFieldT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setText("-----------------------------------------------------------------------------------------------------------------------------------");

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonCal.setText("Calculate");
        jButtonCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalActionPerformed(evt);
            }
        });

        jButtonDrawSensor.setText("Draw Network");
        jButtonDrawSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDrawSensorActionPerformed(evt);
            }
        });

        jButtonExcute.setText("Excute");
        jButtonExcute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcuteActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel14)
                                .addComponent(jLabel12)
                                .addComponent(jLabel7))
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldT, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldOffsetAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel5))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(jTextFieldLifeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldRadius, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcute)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDrawSensor)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldOffsetAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldLifeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDrawSensor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonClear)
                        .addComponent(jButtonCal)
                        .addComponent(jButtonExcute)
                        .addComponent(jButtonSave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRadiusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRadiusActionPerformed

    private void jTextFieldOffsetAngleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOffsetAngleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOffsetAngleActionPerformed

    private void jTextFieldLifeTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLifeTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLifeTimeActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldCoverage.setText("");
        jTextFieldHeight.setText("");
        jTextFieldLifeTime.setText("");
        jTextFieldOffsetAngle.setText("");
        jTextFieldRadius.setText("");
        jTextFieldT.setText("");
        jTextFieldWidth.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalActionPerformed
        // TODO add your handling code here:
        // Input value and check Exception
        try {
            checkNull();
            storeClass.setAnpla(Double.parseDouble(jTextFieldOffsetAngle.getText().trim()));
            storeClass.setH(Float.parseFloat(jTextFieldHeight.getText().trim()));
            storeClass.setP(Float.parseFloat(jTextFieldCoverage.getText().trim()));
            storeClass.setR(Double.parseDouble(jTextFieldRadius.getText().trim()));
            storeClass.setT0(Integer.parseInt(jTextFieldLifeTime.getText().trim()));
            storeClass.setT(Integer.parseInt(jTextFieldT.getText().trim()));
            storeClass.setW(Float.parseFloat(jTextFieldWidth.getText().trim()));
            checkRadius(storeClass.getR());
            checkAngle(storeClass.getAnpla());
            checkLifeTime(storeClass.getT());
            checkHeight(storeClass.getH());
            checkWidth(storeClass.getW());
            checkCoverage(storeClass.getP());
            checkTimeOfSensor(storeClass.getT0());
            jTextArea1.setText(storeClass.toString());
        } catch (NullException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Input format wrong!! Try again!!");
        }
        catch (RadiusException | OffsetAngleException | HeghtException | WidthException | LifeTimeException | CoverageException | TimeOfSensorException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        //End.
    }//GEN-LAST:event_jButtonCalActionPerformed

    private void jButtonExcuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcuteActionPerformed
        // TODO add your handling code here:
        // Make new list
        jTextArea1.setText(""); 
        try {
            Random r =  new Random();
        for(int i = 1;i<=storeClass.getN();i++)
        {
            int x = (int) (Math.abs(r.nextInt()) % storeClass.getW()); //Defind x for each sensor. 
            int y = (int) (Math.abs(r.nextInt()) % storeClass.getH()); //Defind y for each sensor.
            float mina=0;
            float maxa=(float) (Math.PI*2);
            float anpla = ( r.nextFloat()* (maxa - mina+ 1) + mina);
            int dx = (int) (x-8*Math.sin(anpla));
            int dy = (int) (y+8*Math.cos(anpla));
            sensorMapTemp.put(i,new Sensor(x, y,dx,dy, storeClass.getR(), (float) storeClass.getAnpla(),storeClass.getT0()));
        }
        
        //Print list 
        jTextArea1.append("Coordinates of sensor:\n");
        findAdjacent(sensorMapTemp);     
        for(Map.Entry m: sensorMapTemp.entrySet())
        {
            jTextArea1.append("key = "+m.getKey()+ "|");
//            jTextArea1.append(m.getKey()+ " " );
            Sensor s = (Sensor) m.getValue();
            jTextArea1.append(String.valueOf(s.getListAdjactent()) );
            
        }
         
          
////        
////        while(){
////                .addsensor(s, n, storeClass);
////                jTextArea1.append();
////            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        
        //End print list.
        //End make list.
    }//GEN-LAST:event_jButtonExcuteActionPerformed

    private void jButtonDrawSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDrawSensorActionPerformed
        //Define
        try {
            EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DefindDrawSN ex = new DefindDrawSN(storeClass.getN(),storeClass.getGroup(),(int)storeClass.getW(),(int)storeClass.getH(),sensorMap); //Defind DefinDrawSN.
                ex.setVisible(true);// Set Visible = true;
            }
        }); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDrawSensorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Make a dialog to ask user
        int result = JOptionPane.showConfirmDialog(rootPane, "Do you want to exit?", "Exit",JOptionPane.YES_NO_OPTION);
        if (result==0) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //Save sensor list
        int rs = JOptionPane.showConfirmDialog(rootPane, "Do you want to save that list? ","Save list",JOptionPane.YES_NO_OPTION);
        if(rs==0) 
        {
            for(Map.Entry m: sensorMapTemp.entrySet())
            {                
                sensorMap.put((int)m.getKey(), (Sensor) m.getValue());
            }
            sensorMapTemp.clear();   
            jTextArea1.setText("");
            for(Map.Entry m: sensorMap.entrySet())
            {
            jTextArea1.append(m.getKey()+ " " );
            Sensor s = (Sensor) m.getValue();
            jTextArea1.append(s.getX() + " " + s.getY() + s.getDx() + " " + s.getDy()+ "\n");
            }
        }
        //End.
    }//GEN-LAST:event_jButtonSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFarme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFarme().setVisible(true);
            }
        });
    }
    //Defind Exception
    private void checkNull() throws NullException{
        if(jTextFieldCoverage.getText().trim().equals("")) throw new NullException("Coverage null!! Try again!!");
        if(jTextFieldHeight.getText().trim().equals("")) throw new NullException("Height null!! Try again!!");
        if(jTextFieldLifeTime.getText().trim().equals("")) throw new NullException("LifeTime of Network null!! Try again!!");
        if(jTextFieldOffsetAngle.getText().trim().equals("")) throw new NullException("Angle null!! Try again!!");
        if(jTextFieldRadius.getText().trim().equals(""))throw new NullException("Radius null!! Try again!!");
        if(jTextFieldT.getText().trim().equals("")) throw new NullException("Time null!! Try again!!");
        if(jTextFieldWidth.getText().trim().equals("")) throw new NullException("Width null!! Try again!!");
    }
    private void checkRadius(double r) throws RadiusException{
        if(r<=0||r>100) throw new RadiusException("Radius must be between 0 and 100!! Try again");
    }
    private void checkAngle(double anpla) throws OffsetAngleException{
        if(anpla<=0||anpla>180)throw new OffsetAngleException("Angle is not in the range 0->180!!Try again");
    }
    private void checkLifeTime(int t) throws LifeTimeException{
        if(t<=0||t>18000)throw new LifeTimeException("LifeTime must be between 0 and 18000 !! Try again ");
    }
    private void checkHeight(float height) throws HeghtException{
       if(height<=0||height>1000)throw new HeghtException("Height must be between 0 and 1000 !! Try again ");
    }
    private void checkWidth(float width) throws WidthException{
        if(width<=0||width>1000)throw new WidthException("Width must be between 0 and 1000 !! Try again ");
    }
    private void checkCoverage(float p) throws CoverageException{
        if(p<=0||p>1)throw new CoverageException("Coverage must be between 0 and 1 !! Try again ");
    }
    private void checkTimeOfSensor(int t0) throws TimeOfSensorException{
       if(t0<=0||t0>3600*24)throw new TimeOfSensorException("Width must be between 0 and 86400 !! Try again ");
    }
    public boolean checkconnect(Sensor s1, Sensor s2){
       double lengthS1S2 = Math.sqrt(Math.pow( (s2.getX()-s1.getX()) ,2 )+ Math.pow( (s2.getY()-s1.getY()) ,2));
       double xS1S2=(s2.getX()-s1.getX());
       double yS1S2=(s2.getY()-s1.getY());
       double xDS1=(s1.getDx()-s1.getX());
       double yDS1=(s1.getDy()-s1.getY());
       if(lengthS1S2 <= s1.getRadius() && (xS1S2*xDS1+yS1S2*yDS1) >= (Math.cos(s1.getAngle())*lengthS1S2)){
               return true;
       }
       else return false;
    }
    public void findAdjacent(HashMap<Integer,Sensor> x){
        x.forEach((key, value) -> {
            ArrayList<Integer> temp=new ArrayList();
            x.forEach( (key2, value2) -> {
               if(checkconnect(value,value2)&&key!=key2){
                   temp.add(key2);
               }
            });
            value.setListAdjactent(temp);
        });
    }
    //End.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCal;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDrawSensor;
    private javax.swing.JButton jButtonExcute;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCoverage;
    private javax.swing.JTextField jTextFieldHeight;
    private javax.swing.JTextField jTextFieldLifeTime;
    private javax.swing.JTextField jTextFieldOffsetAngle;
    private javax.swing.JTextField jTextFieldRadius;
    private javax.swing.JTextField jTextFieldT;
    private javax.swing.JTextField jTextFieldWidth;
    // End of variables declaration//GEN-END:variables
}