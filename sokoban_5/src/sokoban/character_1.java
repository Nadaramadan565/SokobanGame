/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Abdelrhman
 */
public class character_1 extends character{
    
  
         
    @Override
    public void Draw_character() {
        System.out.println("sokoban.character_1.Draw_character()");
          r1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\right1_1.png");
          r2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\right2_1.png");
          r3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\right3_1.png");
        
      
         l1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\left1_1.png");
         l2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\left2_1.png");
         l3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\left3_1.png");
      
         u1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\up1_1.png");
         u2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\up2_1.png");
         u3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\up3_1.png");
        
         d1=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\down1_1.png");
         d2=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\down2_1.png");
         d3=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\down3_1.png");
        right.add(0, r1.getImage()); right.add(1, r2.getImage());  
        right.add(2, r3.getImage()); 
        left.add(0, l1.getImage()); left.add(1, l2.getImage());
        left.add(2, l3.getImage()); 
        up.add(0, u1.getImage()); up.add(1, u2.getImage()); 
        up.add(2, u3.getImage()); 
        down.add(0, d1.getImage()); down.add(1, d2.getImage());
        down.add(2, d3.getImage());
        //System.out.println("sokoban.character_1.Draw_character()");
    }
         
}
