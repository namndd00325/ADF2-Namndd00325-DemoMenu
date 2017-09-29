/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf2.demomenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author Nam Nguyen
 */
public class Menu extends JFrame{
    
    class Message implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null,ae.getActionCommand());
            if ("addClass".equals(ae.getActionCommand())) {
                JOptionPane.showMessageDialog(mbMenu, "Add Success!");
            }
            if("listClass".equals(ae.getActionCommand())){
                JOptionPane.showMessageDialog(mbMenu, "List Class Room!");
            }
            if("addStudent".equals(ae.getActionCommand())){
                JOptionPane.showMessageDialog(mbMenu, "Add Student Success");
            }
            if("listStudent".equals(ae.getActionCommand())){
                JOptionPane.showMessageDialog(mbMenu, "List Student");
            }
            if("me".equals(ae.getActionCommand())){
                JOptionPane.showMessageDialog(mbMenu, "List Student");
            }
           
        }
    }
    
    class MenuMessage implements MenuListener{
        @Override
        public void menuSelected(MenuEvent me) {
            JOptionPane.showMessageDialog(null, "List Student");
        }

        @Override
        public void menuDeselected(MenuEvent me) {
         
        }

        @Override
        public void menuCanceled(MenuEvent me) {
           
         }
    }
    
    
    
    private JMenuBar mbMenu;
    private JMenu mStudent;
    private JMenu mClass;
    private JMenu mAbout;
    private JMenuItem itemAddStudent;
    private JMenuItem itemListStudent;
    private JMenuItem itemAddClass;
    private JMenuItem itemListClass;
    
    public Menu() {
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        //tao JmenuBar
        this.mbMenu= new JMenuBar();
        
        //tạo JMenu
        this.mStudent= new JMenu("Student Manager");
        this.mClass = new JMenu("Class Room Manager");
        this.mAbout = new JMenu("About me");
        mAbout.setActionCommand("me");
        mAbout.addMenuListener(new MenuMessage());
        
        //tạo JMenuItem
        this.itemAddClass = new JMenuItem("Add Class");
        itemAddClass.setActionCommand("addClass");
        itemAddClass.addActionListener(new Message());
        
        
        this.itemAddStudent = new JMenuItem("Add Student ");
        itemAddStudent.setActionCommand("addStudent");
        itemAddStudent.addActionListener(new Message());
        
        this.itemListClass= new JMenuItem("List Class");
        itemListClass.setActionCommand("listClass");
        itemListClass.addActionListener(new Message());
        
        this.itemListStudent= new JMenuItem("List Student");
        itemListStudent.setActionCommand("listStudent");
        itemListStudent.addActionListener(new Message());
        //add menuBar vao JFrame
        setJMenuBar(mbMenu);
        
        //add Menu vao MenuBar
        mbMenu.add(mStudent);
        mbMenu.add(mClass);
        mbMenu.add(mAbout);
        
        // add MenuItem vao Menu
        mStudent.add(itemAddStudent);
        mStudent.add(itemListStudent);
        mClass.add(itemAddClass);
        mClass.add(itemListClass);
       // mClass.setActionCommand(string);c
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   // class About implements 
}
