/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Views;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import javax.swing.JPanel;

/**
 *
 * @author MaulanaKevinPradana
 */
public class V_Manager extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    static boolean maximized = true;

    /**
     * Creates new form V_Manager
     */
    public V_Manager() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="ACTION LISTENER">
    public void buttonAnimal(ActionListener a) {
        button_animal.addActionListener(a);
    }

    public void setColorAnimal(Color a) {
        color_animal.setBackground(a);
    }

    public void buttonAnimalCare(ActionListener a) {
        button_animalCare.addActionListener(a);
    }

    public void setColorAnimalCare(Color a) {
        color_animalCare.setBackground(a);
    }

    public void buttonLogout(MouseListener a) {
        button_logout.addMouseListener(a);
    }

    public void setColorButtonLogout(Color a) {
        button_logout.setForeground(a);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="WINDOW">
    public JPanel getPanel_body() {
        return panel_body;
    }

    public int getxMouse() {
        return xMouse;
    }

    public void setxMouse(int xMouse) {
        this.xMouse = xMouse;
    }

    public int getyMouse() {
        return yMouse;
    }

    public void setyMouse(int yMouse) {
        this.yMouse = yMouse;
    }

    public void buttonMinimize(MouseListener a) {
        button_minimize.addMouseListener(a);
    }

    public void setIconButtonMinimize(Icon a) {
        button_minimize.setIcon(a);
    }

    public void minimize(int State) {
        this.setState(State);
    }

    public void buttonMaximize(MouseListener a) {
        button_maximize.addMouseListener(a);
    }

    public void setIconButtonMaximize(Icon a) {
        button_maximize.setIcon(a);
    }

    public void naximize(int State) {
        this.setState(State);
    }

    public boolean isMaximized() {
        return maximized;
    }

    public void setMaximized(boolean maximized) {
        V_Admin.maximized = maximized;
    }

    public void buttonExit(MouseListener a) {
        button_exit.addMouseListener(a);
    }

    public void setIconButtonExit(Icon a) {
        button_exit.setIcon(a);
    }

    public void mousePanelUndecorated(MouseListener a) {
        panel_undercorated.addMouseListener(a);
    }

    public void dragPanelUndecorated(MouseMotionListener a) {
        panel_undercorated.addMouseMotionListener(a);
    }//</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_undercorated = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        button_exit = new javax.swing.JLabel();
        button_minimize = new javax.swing.JLabel();
        button_maximize = new javax.swing.JLabel();
        panel_header = new javax.swing.JPanel();
        textView_user = new javax.swing.JLabel();
        button_logout = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        editText_name = new javax.swing.JLabel();
        button_animal = new javax.swing.JButton();
        color_animal = new javax.swing.JLabel();
        button_animalCare = new javax.swing.JButton();
        color_animalCare = new javax.swing.JLabel();
        panel_body = new javax.swing.JPanel();
        panel_animal = new javax.swing.JPanel();
        editText_subtitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_animalCare = new javax.swing.JPanel();
        editText_subtitle1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1184, 661));
        setUndecorated(true);

        panel_undercorated.setBackground(new java.awt.Color(255, 255, 255));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/title.png"))); // NOI18N

        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png"))); // NOI18N
        button_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png"))); // NOI18N

        button_maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png"))); // NOI18N

        javax.swing.GroupLayout panel_undercoratedLayout = new javax.swing.GroupLayout(panel_undercorated);
        panel_undercorated.setLayout(panel_undercoratedLayout);
        panel_undercoratedLayout.setHorizontalGroup(
            panel_undercoratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_undercoratedLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_undercoratedLayout.setVerticalGroup(
            panel_undercoratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_maximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_header.setBackground(new java.awt.Color(255, 255, 255));

        textView_user.setText("You are login as Manager,");

        button_logout.setForeground(new java.awt.Color(0, 0, 255));
        button_logout.setText("Logout?");
        button_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_administrator_male_100px.png"))); // NOI18N

        editText_name.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        editText_name.setText("MANAGER");

        button_animal.setBackground(new java.awt.Color(255, 255, 255));
        button_animal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_animal.setText("ANIMAL");
        button_animal.setBorder(null);
        button_animal.setBorderPainted(false);
        button_animal.setContentAreaFilled(false);
        button_animal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_animal.setFocusable(false);

        color_animal.setBackground(new java.awt.Color(0, 255, 0));
        color_animal.setOpaque(true);

        button_animalCare.setBackground(new java.awt.Color(255, 255, 255));
        button_animalCare.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_animalCare.setText("ANIMAL CARE");
        button_animalCare.setBorder(null);
        button_animalCare.setBorderPainted(false);
        button_animalCare.setContentAreaFilled(false);
        button_animalCare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_animalCare.setFocusable(false);

        color_animalCare.setBackground(new java.awt.Color(255, 255, 255));
        color_animalCare.setOpaque(true);

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addComponent(editText_name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textView_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_logout))
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_animal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_animal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_animalCare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_animalCare, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textView_user)
                        .addComponent(button_logout)
                        .addComponent(editText_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addComponent(button_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(color_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addComponent(button_animalCare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(color_animalCare, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panel_body.setBackground(new java.awt.Color(255, 255, 255));
        panel_body.setMinimumSize(new java.awt.Dimension(1184, 476));
        panel_body.setPreferredSize(new java.awt.Dimension(1184, 476));
        panel_body.setLayout(new java.awt.CardLayout());

        panel_animal.setBackground(new java.awt.Color(255, 255, 255));

        editText_subtitle.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        editText_subtitle.setText("ANIMAL");

        javax.swing.GroupLayout panel_animalLayout = new javax.swing.GroupLayout(panel_animal);
        panel_animal.setLayout(panel_animalLayout);
        panel_animalLayout.setHorizontalGroup(
            panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_subtitle)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        panel_animalLayout.setVerticalGroup(
            panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(editText_subtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        panel_body.add(panel_animal, "panel_animal");

        panel_animalCare.setBackground(new java.awt.Color(255, 255, 255));

        editText_subtitle1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        editText_subtitle1.setText("ANIMAL CARE");

        javax.swing.GroupLayout panel_animalCareLayout = new javax.swing.GroupLayout(panel_animalCare);
        panel_animalCare.setLayout(panel_animalCareLayout);
        panel_animalCareLayout.setHorizontalGroup(
            panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalCareLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_subtitle1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        panel_animalCareLayout.setVerticalGroup(
            panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalCareLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(editText_subtitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        panel_body.add(panel_animalCare, "panel_animalCare");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_undercorated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_undercorated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1168, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_animal;
    private javax.swing.JButton button_animalCare;
    private javax.swing.JLabel button_exit;
    private javax.swing.JLabel button_logout;
    private javax.swing.JLabel button_maximize;
    private javax.swing.JLabel button_minimize;
    private javax.swing.JLabel color_animal;
    private javax.swing.JLabel color_animalCare;
    private javax.swing.JLabel editText_name;
    private javax.swing.JLabel editText_subtitle;
    private javax.swing.JLabel editText_subtitle1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel_animal;
    private javax.swing.JPanel panel_animalCare;
    private javax.swing.JPanel panel_body;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_undercorated;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel textView_user;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
