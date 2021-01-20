/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static sokoban.Sokoban.counter;
import static sokoban.Sokoban.player_i;
import static sokoban.Sokoban.player_j;
import static sokoban.designform.chracter_number;
import static sokoban.Sokoban.c1;
import static sokoban.Sokoban.c2;
import static sokoban.level.map;


/**
 *
 * @author Abdelrhman
 */
public class Al extends KeyAdapter{
public static boolean back=false;
   
        
   
    public void keyPressed(KeyEvent e) {
        
	switch (e.getKeyCode()) {
            
	case KeyEvent.VK_UP:
            if(chracter_number==1)
           c1.Move_UP();
            else c2.Move_UP();
		break;
	case KeyEvent.VK_LEFT:
           if(chracter_number==1)
           c1.Move_Left();
            else c2.Move_Left();
		break;
	case KeyEvent.VK_DOWN:
            if(chracter_number==1)
           c1.Move_Down();
            else c2.Move_Down();
		break;
        case KeyEvent.VK_RIGHT:
            if(chracter_number==1)
           c1.Move_Right();
            else c2.Move_Right();
		break;
            case KeyEvent.VK_SPACE:
                if(Sokoban.u&&back==false)
                {
                    if(chracter_number==1)
                       c1.Move_Down();
                     else c2.Move_Down();
                    back=true;
                }
                    
                if(Sokoban.d&&back==false)
                {
                    if(chracter_number==1)
                       c1.Move_UP();
                    else c2.Move_UP(); 
                    back=true;
                }
                   
                if(Sokoban.l&&back==false)
                {
                    if(chracter_number==1)
                       c1.Move_Right();
                    else c2.Move_Right();
                    back=true;
                }
                    
                if(Sokoban.r&&back==false)
                {
                    if(chracter_number==1)
                    c1.Move_Left();
                    else c2.Move_Left();
                    back=true;
                }
                    
                break;

        }
    }
}
