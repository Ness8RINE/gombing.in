/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Views;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MaulanaKevinPradana
 */
public class V_Login extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    /**
     * Creates new form V_Login
     */
    public V_Login() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="GETTER SETTER">
    public JPasswordField getEditText_confirmPassword() {
        return editText_confirmPassword;
    }

    public void setEditText_confirmPassword(JPasswordField editText_confirmPassword) {
        this.editText_confirmPassword = editText_confirmPassword;
    }

    public JTextField getEditText_emailF() {
        return editText_emailF;
    }

    public void setEditText_emailF(JTextField editText_emailF) {
        this.editText_emailF = editText_emailF;
    }

    public JTextField getEditText_emailR() {
        return editText_emailR;
    }

    public void setEditText_emailR(JTextField editText_emailR) {
        this.editText_emailR = editText_emailR;
    }

    public JPasswordField getEditText_passwordL() {
        return editText_passwordL;
    }

    public void setEditText_passwordL(JPasswordField editText_passwordL) {
        this.editText_passwordL = editText_passwordL;
    }

    public JPasswordField getEditText_passwordR() {
        return editText_passwordR;
    }

    public void setEditText_passwordR(JPasswordField editText_passwordR) {
        this.editText_passwordR = editText_passwordR;
    }

    public JTextField getEditText_emailL() {
        return editText_emailL;
    }

    public void setEditText_emailL(JTextField editText_usernameL) {
        this.editText_emailL = editText_usernameL;
    }

    public JTextField getEditText_usernameR() {
        return editText_usernameR;
    }

    public void setEditText_usernameR(JTextField editText_usernameR) {
        this.editText_usernameR = editText_usernameR;
    }//</editor-fold>    

    // <editor-fold defaultstate="collapsed" desc="ACTION LISTENER">
    public void login(KeyListener a) {
        button_login.addKeyListener(a);
    }

    public void buttonViewLogin(MouseListener a) {
        button_viewLoginF.addMouseListener(a);
        button_viewLoginR.addMouseListener(a);
    }

    public void setColorButtonViewLogin(Color a) {
        button_viewLoginF.setForeground(a);
        button_viewLoginR.setForeground(a);
    }

    public void buttonLogin(MouseListener a) {
        button_login.addMouseListener(a);
    }

    public void setColorButtonLogin(Color a) {
        button_login.setBackground(a);
    }

    public void buttonViewForgotPassword(MouseListener a) {
        button_viewForgotPassword.addMouseListener(a);
    }

    public void setColorButtonViewForgotPassword(Color a) {
        button_viewForgotPassword.setForeground(a);
    }

    public void buttonSend(MouseListener a) {
        button_send.addMouseListener(a);
    }

    public void setColorButtonSend(Color a) {
        button_send.setBackground(a);
    }

    public void buttonViewRegister(MouseListener a) {
        button_viewRegister.addMouseListener(a);
    }

    public void setColorButtonViewRegister(Color a) {
        button_viewRegister.setForeground(a);
    }

    public void buttonRegister(MouseListener a) {
        button_register.addMouseListener(a);
    }

    public void setColorButtonRegister(Color a) {
        button_register.setBackground(a);
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
        panel_logo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panel_body = new javax.swing.JPanel();
        panel_login = new javax.swing.JPanel();
        textView_login = new javax.swing.JLabel();
        textView_emailL = new javax.swing.JLabel();
        editText_emailL = new javax.swing.JTextField();
        separator_emailL = new javax.swing.JSeparator();
        textView_passwordL = new javax.swing.JLabel();
        editText_passwordL = new javax.swing.JPasswordField();
        separator_passwordL = new javax.swing.JSeparator();
        button_viewForgotPassword = new javax.swing.JLabel();
        button_viewRegister = new javax.swing.JLabel();
        button_login = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        panel_register = new javax.swing.JPanel();
        textView_registration = new javax.swing.JLabel();
        textView_usernameR = new javax.swing.JLabel();
        separator_usernameR = new javax.swing.JSeparator();
        editText_usernameR = new javax.swing.JTextField();
        textView_emailR = new javax.swing.JLabel();
        editText_emailR = new javax.swing.JTextField();
        separator_emailR = new javax.swing.JSeparator();
        textView_passwordR = new javax.swing.JLabel();
        editText_passwordR = new javax.swing.JPasswordField();
        separator_passwordR = new javax.swing.JSeparator();
        textView_confirmPassword = new javax.swing.JLabel();
        editText_confirmPassword = new javax.swing.JPasswordField();
        separator_confirmPassword = new javax.swing.JSeparator();
        button_viewLoginR = new javax.swing.JLabel();
        button_register = new javax.swing.JPanel();
        register = new javax.swing.JLabel();
        panel_forgotPassword = new javax.swing.JPanel();
        textView_forgotPassword = new javax.swing.JLabel();
        textView_emailF = new javax.swing.JLabel();
        separator_emailF = new javax.swing.JSeparator();
        editText_emailF = new javax.swing.JTextField();
        button_viewLoginF = new javax.swing.JLabel();
        button_send = new javax.swing.JPanel();
        send = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOMBING");
        setMinimumSize(new java.awt.Dimension(700, 428));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 428));

        panel_undercorated.setBackground(new java.awt.Color(255, 255, 255));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/title.png"))); // NOI18N

        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png"))); // NOI18N
        button_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout panel_undercoratedLayout = new javax.swing.GroupLayout(panel_undercorated);
        panel_undercorated.setLayout(panel_undercoratedLayout);
        panel_undercoratedLayout.setHorizontalGroup(
            panel_undercoratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_undercoratedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(224, 224, 224)
                .addComponent(button_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_undercoratedLayout.setVerticalGroup(
            panel_undercoratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_body.setLayout(new java.awt.CardLayout());

        panel_login.setBackground(new java.awt.Color(102, 153, 255));
        panel_login.setMaximumSize(new java.awt.Dimension(320, 398));
        panel_login.setMinimumSize(new java.awt.Dimension(320, 398));
        panel_login.setPreferredSize(new java.awt.Dimension(330, 398));

        textView_login.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        textView_login.setForeground(new java.awt.Color(255, 255, 255));
        textView_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textView_login.setText("LOGIN");
        textView_login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textView_emailL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textView_emailL.setForeground(new java.awt.Color(255, 255, 255));
        textView_emailL.setText("Email");

        editText_emailL.setForeground(new java.awt.Color(255, 255, 255));
        editText_emailL.setBorder(null);
        editText_emailL.setOpaque(false);

        separator_emailL.setForeground(new java.awt.Color(255, 255, 255));

        textView_passwordL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textView_passwordL.setForeground(new java.awt.Color(255, 255, 255));
        textView_passwordL.setText("Password");

        editText_passwordL.setForeground(new java.awt.Color(255, 255, 255));
        editText_passwordL.setBorder(null);
        editText_passwordL.setOpaque(false);

        separator_passwordL.setForeground(new java.awt.Color(255, 255, 255));

        button_viewForgotPassword.setText("Forgot Password?");
        button_viewForgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button_viewRegister.setForeground(new java.awt.Color(255, 255, 255));
        button_viewRegister.setText("Create new account");
        button_viewRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button_login.setBackground(new java.awt.Color(255, 255, 255));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("LOGIN");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout button_loginLayout = new javax.swing.GroupLayout(button_login);
        button_login.setLayout(button_loginLayout);
        button_loginLayout.setHorizontalGroup(
            button_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_loginLayout.createSequentialGroup()
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        button_loginLayout.setVerticalGroup(
            button_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_loginLayout.createSequentialGroup()
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button_viewForgotPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_viewRegister))
                    .addGroup(panel_loginLayout.createSequentialGroup()
                        .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textView_login, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_loginLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textView_emailL)
                                    .addComponent(editText_emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator_emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textView_passwordL)
                                    .addComponent(button_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editText_passwordL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(separator_passwordL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textView_login)
                .addGap(70, 70, 70)
                .addComponent(textView_emailL)
                .addGap(6, 6, 6)
                .addComponent(editText_emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(separator_emailL, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(textView_passwordL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editText_passwordL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(separator_passwordL, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_viewRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_viewForgotPassword))
                .addGap(20, 20, 20))
        );

        panel_body.add(panel_login, "panel_login");

        panel_register.setBackground(new java.awt.Color(102, 153, 255));
        panel_register.setPreferredSize(new java.awt.Dimension(330, 398));

        textView_registration.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        textView_registration.setForeground(new java.awt.Color(255, 255, 255));
        textView_registration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textView_registration.setText("REGISTRATION");

        textView_usernameR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textView_usernameR.setForeground(new java.awt.Color(255, 255, 255));
        textView_usernameR.setText("Username");

        separator_usernameR.setForeground(new java.awt.Color(255, 255, 255));
        separator_usernameR.setToolTipText("");

        editText_usernameR.setForeground(new java.awt.Color(255, 255, 255));
        editText_usernameR.setBorder(null);
        editText_usernameR.setOpaque(false);

        textView_emailR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textView_emailR.setForeground(new java.awt.Color(255, 255, 255));
        textView_emailR.setText("E-Mail");

        editText_emailR.setForeground(new java.awt.Color(255, 255, 255));
        editText_emailR.setBorder(null);
        editText_emailR.setNextFocusableComponent(button_login);
        editText_emailR.setOpaque(false);

        separator_emailR.setForeground(new java.awt.Color(255, 255, 255));

        textView_passwordR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textView_passwordR.setForeground(new java.awt.Color(255, 255, 255));
        textView_passwordR.setText("Password");

        editText_passwordR.setForeground(new java.awt.Color(255, 255, 255));
        editText_passwordR.setBorder(null);
        editText_passwordR.setOpaque(false);

        separator_passwordR.setForeground(new java.awt.Color(255, 255, 255));
        separator_passwordR.setToolTipText("");

        textView_confirmPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textView_confirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        textView_confirmPassword.setText("Confirm Password");

        editText_confirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        editText_confirmPassword.setBorder(null);
        editText_confirmPassword.setOpaque(false);

        separator_confirmPassword.setForeground(new java.awt.Color(255, 255, 255));

        button_viewLoginR.setForeground(new java.awt.Color(255, 255, 255));
        button_viewLoginR.setText("Back To Login");
        button_viewLoginR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button_register.setBackground(new java.awt.Color(255, 255, 255));

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("REGISTER");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout button_registerLayout = new javax.swing.GroupLayout(button_register);
        button_register.setLayout(button_registerLayout);
        button_registerLayout.setHorizontalGroup(
            button_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        button_registerLayout.setVerticalGroup(
            button_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button_registerLayout.createSequentialGroup()
                .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panel_registerLayout = new javax.swing.GroupLayout(panel_register);
        panel_register.setLayout(panel_registerLayout);
        panel_registerLayout.setHorizontalGroup(
            panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registerLayout.createSequentialGroup()
                .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_registration, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(textView_usernameR))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator_usernameR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editText_usernameR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(textView_emailR))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editText_emailR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separator_emailR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(textView_passwordR))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editText_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(textView_confirmPassword))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(button_viewLoginR))
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separator_confirmPassword)
                            .addComponent(editText_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        panel_registerLayout.setVerticalGroup(
            panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textView_registration)
                .addGap(14, 14, 14)
                .addComponent(textView_usernameR)
                .addGap(13, 13, 13)
                .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(separator_usernameR, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(editText_usernameR, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(textView_emailR)
                .addGap(13, 13, 13)
                .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_emailR, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(separator_emailR, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(textView_passwordR)
                .addGap(13, 13, 13)
                .addGroup(panel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_registerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(separator_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(editText_passwordR, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(textView_confirmPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editText_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(separator_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(button_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(button_viewLoginR))
        );

        panel_body.add(panel_register, "panel_registration");

        panel_forgotPassword.setBackground(new java.awt.Color(102, 153, 255));
        panel_forgotPassword.setPreferredSize(new java.awt.Dimension(330, 398));

        textView_forgotPassword.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        textView_forgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        textView_forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textView_forgotPassword.setText("FORGOT PASSWORD");

        textView_emailF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textView_emailF.setForeground(new java.awt.Color(255, 255, 255));
        textView_emailF.setText("E-Mail");

        separator_emailF.setForeground(new java.awt.Color(255, 255, 255));
        separator_emailF.setToolTipText("");

        editText_emailF.setForeground(new java.awt.Color(255, 255, 255));
        editText_emailF.setBorder(null);
        editText_emailF.setOpaque(false);

        button_viewLoginF.setForeground(new java.awt.Color(255, 255, 255));
        button_viewLoginF.setText("Back To Login");
        button_viewLoginF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        button_send.setBackground(new java.awt.Color(255, 255, 255));

        send.setBackground(new java.awt.Color(255, 255, 255));
        send.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        send.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        send.setText("SEND");
        send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout button_sendLayout = new javax.swing.GroupLayout(button_send);
        button_send.setLayout(button_sendLayout);
        button_sendLayout.setHorizontalGroup(
            button_sendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        button_sendLayout.setVerticalGroup(
            button_sendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button_sendLayout.createSequentialGroup()
                .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panel_forgotPasswordLayout = new javax.swing.GroupLayout(panel_forgotPassword);
        panel_forgotPassword.setLayout(panel_forgotPasswordLayout);
        panel_forgotPasswordLayout.setHorizontalGroup(
            panel_forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textView_forgotPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panel_forgotPasswordLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(textView_emailF))
            .addGroup(panel_forgotPasswordLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_emailF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(separator_emailF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panel_forgotPasswordLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(button_send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel_forgotPasswordLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(button_viewLoginF))
        );
        panel_forgotPasswordLayout.setVerticalGroup(
            panel_forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_forgotPasswordLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textView_forgotPassword)
                .addGap(74, 74, 74)
                .addComponent(textView_emailF)
                .addGap(13, 13, 13)
                .addGroup(panel_forgotPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_emailF, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_forgotPasswordLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(separator_emailF, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(button_send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(button_viewLoginF))
        );

        panel_body.add(panel_forgotPassword, "panel_forgotPassword");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_undercorated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_undercorated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
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
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button_exit;
    private javax.swing.JPanel button_login;
    private javax.swing.JLabel button_minimize;
    private javax.swing.JPanel button_register;
    private javax.swing.JPanel button_send;
    private javax.swing.JLabel button_viewForgotPassword;
    private javax.swing.JLabel button_viewLoginF;
    private javax.swing.JLabel button_viewLoginR;
    private javax.swing.JLabel button_viewRegister;
    private javax.swing.JPasswordField editText_confirmPassword;
    private javax.swing.JTextField editText_emailF;
    private javax.swing.JTextField editText_emailL;
    private javax.swing.JTextField editText_emailR;
    private javax.swing.JPasswordField editText_passwordL;
    private javax.swing.JPasswordField editText_passwordR;
    private javax.swing.JTextField editText_usernameR;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel_body;
    private javax.swing.JPanel panel_forgotPassword;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JPanel panel_register;
    private javax.swing.JPanel panel_undercorated;
    private javax.swing.JLabel register;
    private javax.swing.JLabel send;
    private javax.swing.JSeparator separator_confirmPassword;
    private javax.swing.JSeparator separator_emailF;
    private javax.swing.JSeparator separator_emailL;
    private javax.swing.JSeparator separator_emailR;
    private javax.swing.JSeparator separator_passwordL;
    private javax.swing.JSeparator separator_passwordR;
    private javax.swing.JSeparator separator_usernameR;
    private javax.swing.JLabel textView_confirmPassword;
    private javax.swing.JLabel textView_emailF;
    private javax.swing.JLabel textView_emailL;
    private javax.swing.JLabel textView_emailR;
    private javax.swing.JLabel textView_forgotPassword;
    private javax.swing.JLabel textView_login;
    private javax.swing.JLabel textView_passwordL;
    private javax.swing.JLabel textView_passwordR;
    private javax.swing.JLabel textView_registration;
    private javax.swing.JLabel textView_usernameR;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
