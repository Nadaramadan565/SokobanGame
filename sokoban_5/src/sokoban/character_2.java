/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import javax.swing.ImageIcon;

/**
 *
 * @author Abdelrhman
 */
public class character_2 extends character{

    

    @Override
    public void Draw_character() {
        System.out.println("sokoban.character_2.Draw_character()");
         r1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\right1.png");
         r2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\right2.png");
         r3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\right3.png");
      
        l1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\left1.png");
        l2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\left2.png");
        l3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\left3.png");
      
        u1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\up1.png");
        u2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\up2.png");
        u3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\up3.png");
        
         d1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\down1.png");
         d2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\down2.png");
         d3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\down3.png");
         right.add(0, r1.getImage()); right.add(1, r2.getImage());  
        right.add(2, r3.getImage()); 
        left.add(0, l1.getImage()); left.add(1, l2.getImage());
        left.add(2, l3.getImage()); 
        up.add(0, u1.getImage()); up.add(1, u2.getImage()); 
        up.add(2, u3.getImage()); 
        down.add(0, d1.getImage()); down.add(1, d2.getImage());
        down.add(2, d3.getImage()); 
    }
    
}
