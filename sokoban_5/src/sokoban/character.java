package sokoban;

import java.awt.Graphics;
import java.awt.Image;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import static sokoban.Sokoban.counter;
import static sokoban.Sokoban.counter_down;
import static sokoban.Sokoban.counter_left;
import static sokoban.Sokoban.counter_right;
import static sokoban.Sokoban.counter_up;
import static sokoban.Sokoban.d;
import static sokoban.Sokoban.l;
import static sokoban.Sokoban.player_x;
import static sokoban.Sokoban.player_y;
import static sokoban.Sokoban.player_i;
import static sokoban.Sokoban.player_j;
import static sokoban.Sokoban.pushes;
import static sokoban.Sokoban.moves;
import static sokoban.Sokoban.r;
import static sokoban.Sokoban.number_charcter;
import static sokoban.Sokoban.u;
import static sokoban.level.first;
import static sokoban.level.map;
import static sokoban.Al.back;
import static sokoban.designform.chracter_number;
/**
 *
 * @author Abdelrhman
 */
abstract public class character {
//public static int counter_right=0,counter_left=0,counter_up=0,counter_down=0;
 static ArrayList<Image> right = new ArrayList<Image>();
 static ArrayList<Image> left = new ArrayList<Image>();
 static ArrayList<Image> up = new ArrayList<Image>();
 ImageIcon r1,r2,r3,l1,l2,l3,u1,u2,u3,d1,d2,d3;
static ArrayList<Image> down = new ArrayList<Image>();

protected static boolean move=false;
   String characterMovingLocaion= "D:\\sokoban_5\\src\\sokoban\\Character_Moving.wav" ;
        sounds sound =new sounds() ;
        
   String gettingCoinLocaion= "D:\\sokoban_5\\src\\sokoban\\Getting_Coin.wav" ;
        sounds sound1 =new sounds() ;
    
        
    
   
abstract public void Draw_character();

    
    
    public void paint(Graphics g)
    {
        //System.out.println("sokoban.character.paint()");
        if (first==true)
        {
            
        
         if (u==false&&r==false&&d==false&&l==false)
        {       
            g.drawImage(down.get(0), player_x, player_y, null);
            
        }
         else if (r)
        {
            g.drawImage(right.get(counter_right), player_x, player_y, null);
            counter=counter+1;
            if (counter<65)
            player_x=player_x+1;
            
        }
         else if (l)
        {
            g.drawImage(left.get(counter_left), player_x, player_y, null);
        
              counter=counter+1;
            if (counter<65)
            player_x=player_x-1;
        }
         else if (u)
        {
            g.drawImage(up.get(counter_up), player_x, player_y, null);
            
              counter=counter+1;
            if (counter<65)
            player_y=player_y-1;
        }
         else if (d)
        {
            g.drawImage(down.get(counter_down), player_x, player_y, null);
            
              counter=counter+1;
            if (counter<65)
            player_y=player_y+1;
        }
         else
         {};
        
    }
      
    }
    public void Move_UP()
    {
         sound.Character_Moving(characterMovingLocaion);
            move=true;
            back=false;
            if (counter==0||counter>65)
            {
                counter=0;
            if (map[player_i-1][player_j]==1)
            {
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            }
            else  if (map[player_i-1][player_j]!=1)
            {
                if(map[player_i-1][player_j]==2&&map[player_i-2][player_j]==6)
                {
                    
                         map[player_i-2][player_j]=2;
                         map[player_i-1][player_j]=6;
                         pushes++;
                }
                if(map[player_i-1][player_j]==2&&map[player_i-2][player_j]==3)
                {
                    
                         map[player_i-2][player_j]=4;
                         map[player_i-1][player_j]=6;
                         sound1.Getting_Coin(gettingCoinLocaion);
                         pushes++;
                }
                 if(map[player_i-1][player_j]==4&&map[player_i-2][player_j]==6)
                {
                    
                         map[player_i-2][player_j]=2;
                         map[player_i-1][player_j]=3;
                         pushes++;
                         
                }
                 if(map[player_i-1][player_j]==4&&map[player_i-2][player_j]==3)
                {
                    
                         map[player_i-2][player_j]=4;
                         map[player_i-1][player_j]=3;
                          pushes++;
                }
                if (map[player_i-1][player_j]==6||map[player_i-1][player_j]==3)
                {
                player_i--;
            moves++;
                 Sokoban.player_y=Sokoban.player_y-1;
    
               Sokoban.u =true;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
                if (Sokoban.counter_up>=Sokoban.number_charcter)
                    Sokoban.counter_up=0;
                else
                {
                    Sokoban.counter_up++;
                    Sokoban.counter_down=0;
                    Sokoban.counter_left=0;
                    Sokoban.counter_right=0;
                }
            
            
            
            }
            else
            {
                
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            
            }
        
            }
            }  
    }
    public void Move_Down()
    {
        sound.Character_Moving(characterMovingLocaion);
            move=true;
            back=false;
            if (counter==0||counter>65)
            {
                counter=0;
             if (map[player_i+1][player_j]==1)
            {
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            }
             else if (map[player_i+1][player_j]!=1)
            {
                
                if(map[player_i+1][player_j]==2&&map[player_i+2][player_j]==6)
                {
                    map[player_i+2][player_j]=2;
                    map[player_i+1][player_j]=6;
                    pushes++;
                }
                if(map[player_i+1][player_j]==2&&map[player_i+2][player_j]==3)
                {
                    sound1.Getting_Coin(gettingCoinLocaion);
                         map[player_i+2][player_j]=4;
                         map[player_i+1][player_j]=6;
                          pushes++;
                }
                 if(map[player_i+1][player_j]==4&&map[player_i+2][player_j]==6)
                {
                    
                         map[player_i+2][player_j]=2;
                         map[player_i+1][player_j]=3;
                          pushes++;
                }
                 if(map[player_i+1][player_j]==4&&map[player_i+2][player_j]==3)
                {
                    
                         map[player_i+2][player_j]=4;
                         map[player_i+1][player_j]=3;
                          pushes++;
                }
                if (map[player_i+1][player_j]==6||map[player_i+1][player_j]==3)
                {
                 player_i++;
                 moves++;
            
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =true;
               
                  Sokoban.player_y=Sokoban.player_y+1;
                  
                if (Sokoban.counter_down>=Sokoban.number_charcter)
                    Sokoban.counter_down=0;
                else 
                {
                    Sokoban.counter_left=0;
                    Sokoban.counter_down++;
                    Sokoban.counter_right=0;
                    Sokoban.counter_up=0;
                } 
            
            }
            else{
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            }
            }
            }  
    }
    public void Move_Right()
    {
        sound.Character_Moving(characterMovingLocaion);
            move=true;
            back=false;
            if (counter==0||counter>65)
             {
                 counter=0;
            if (map[player_i][player_j+1]==1)
            {
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            }
            else  if (map[player_i][player_j+1]!=1)
            {
                if(map[player_i][player_j+1]==2&&map[player_i][player_j+2]==6)
                {
                    map[player_i][player_j+2]=2;
                    map[player_i][player_j+1]=6;
                     pushes++;
                }
                if(map[player_i][player_j+1]==2&&map[player_i][player_j+2]==3)
                {
                    sound1.Getting_Coin(gettingCoinLocaion);
                         map[player_i][player_j+2]=4;
                         map[player_i][player_j+1]=6;
                          pushes++;
                }
                 if(map[player_i][player_j+1]==4&&map[player_i][player_j+2]==6)
                {
                    
                         map[player_i][player_j+2]=2;
                         map[player_i][player_j+1]=3;
                          pushes++;
                }
                 if(map[player_i][player_j+1]==4&&map[player_i][player_j+2]==3)
                {
                    
                         map[player_i][player_j+2]=4;
                         map[player_i][player_j+1]=3;
                          pushes++;
                }
                if(map[player_i][player_j+1]==6||map[player_i][player_j+1]==3)
                {
                 player_j++;
                moves++;
                 Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =true;
               Sokoban.d =false;
               
                   Sokoban.player_x=Sokoban.player_x+1;
                
                if (Sokoban.counter_right>=Sokoban.number_charcter)
                    Sokoban.counter_right=0;
                else
                {
                    Sokoban.counter_right++;
                    Sokoban.counter_left=0;
                    Sokoban.counter_down=0;
                    Sokoban.counter_up=0;
                }
             
            }
            else
            {
                 Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            }
           
            
            } 
             }
    }
    public void Move_Left()
    {
        sound.Character_Moving(characterMovingLocaion);
            move=true;
            back=false;
            if (counter==0||counter>65)
            {
                counter=0;
            if (map[player_i][player_j-1]==1)
            {
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            }
            else  if (map[player_i][player_j-1]!=1)
            {
                if(map[player_i][player_j-1]==2&&map[player_i][player_j-2]==6)
                {
                    map[player_i][player_j-2]=2;
                    map[player_i][player_j-1]=6;
                     pushes++;
                }
                if(map[player_i][player_j-1]==2&&map[player_i][player_j-2]==3)
                {
                    sound1.Getting_Coin(gettingCoinLocaion);
                    
                         map[player_i][player_j-2]=4;
                         map[player_i][player_j-1]=6;
                          pushes++;
                }
                 if(map[player_i][player_j-1]==4&&map[player_i][player_j-2]==6)
                {
                    
                         map[player_i][player_j-2]=2;
                         map[player_i][player_j-1]=3;
                          pushes++;
                }
                  if(map[player_i][player_j-1]==4&&map[player_i][player_j-2]==3)
                {
                    
                         map[player_i][player_j-2]=4;
                         map[player_i][player_j-1]=3;
                          pushes++;
                }
                if(map[player_i][player_j-1]==6||map[player_i][player_j-1]==3)
                {
                 player_j--;
               moves++;
              Sokoban.u =false;
               Sokoban.l =true;
               Sokoban.r =false;
               Sokoban.d =false;
		Sokoban.player_x=Sokoban.player_x-1;
                
                if (Sokoban.counter_left>=Sokoban.number_charcter)
                    Sokoban.counter_left=0;
                else 
                {
                Sokoban.counter_left++;
                Sokoban.counter_down=0;
                Sokoban.counter_right=0;
                Sokoban.counter_up=0;
                }  
            
            }
            else
            {
                Sokoban.u =false;
               Sokoban.l =false;
               Sokoban.r =false;
               Sokoban.d =false;
            }
            
           
            
            }
            }  
    }
}
