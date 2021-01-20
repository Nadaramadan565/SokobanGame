
package sokoban;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import static sun.audio.AudioPlayer.player;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static sokoban.character.move;
import static sokoban.level.map;
import static sokoban.homeForm.qui;
import static sokoban.level._c;
import static sokoban.level.first;
import static sokoban.player.array;
import static sokoban.designform.chracter_number;
import static sokoban.designform.bg_number;
import static sokoban.player.best_moves;
import static sokoban.player.best_name;
import static sokoban.player.player_name;
import sun.security.pkcs11.P11Util;





public class Sokoban extends JFrame{
    
    
    class mouseHelper extends MouseAdapter {
  
         //@Override
          
        
     public void mousePressed(MouseEvent e){
              
              int XmouseCoordinate = e.getX();
              int YmouseCoordinate= e.getY();
         
           //Home Button
            
             
           if(XmouseCoordinate> 30 && XmouseCoordinate<30+39
           && YmouseCoordinate>30 && YmouseCoordinate< 30+39)
                    
           {   
//               System.out.println("Home Button !");
               new homeForm().setVisible(true);
              
               
           }
          // Step back button
          if(XmouseCoordinate> 80 && XmouseCoordinate<80+37
           && YmouseCoordinate> 30 && YmouseCoordinate< 30+40)
          {
            u=false;
            l=false;
            d=false;
            r=false;
            counter=0;
            _c=0;
            move=false;
            in=false;
            first=false;
              inter=false;
              qui=true;
             if(player_level>=1 && player_level<=20)
              {
                System.out.println("a"+player_level);
                 
                  new player_levels().setVisible(true);
                  
              }
              else if(player_level >=21 &&player_level<=40)
              {
               
              new mediumMenu().setVisible(true);
           
             }
              else if(player_level>=41 &&  player_level<=60)
              {
                 new hardMenu().setVisible(true);
              }
              else{System.out.println("else"+player_level);};
          }
         
          // Repeat button
          if(XmouseCoordinate> 130 && XmouseCoordinate<130+37
           && YmouseCoordinate> 30 && YmouseCoordinate< 30+37)
          {
            
              u=false;
            l=false;
            d=false;
            r=false;
            counter=0;
            _c=0;
            move=false;
            in=false;
            first=false;
              inter=false;
              
          }

         }
}

    
    
    
    
    String victorySoundLocaion= "D:\\sokoban_5\\src\\sokoban\\Victory_Sound.wav" ;
        sounds sound =new sounds() ;
public static  int player_x,player_y;
public static  int player_i,player_j;
public static  int block_x,block_y;
public static int number_charcter;
public static int moves,pushes;
 public static int counter=0;
 public static boolean esraa=false;
    static boolean u;
    static boolean l;
    static boolean r;
    static boolean d;
    static int counter_up=0;
    static int counter_down=0;
    static int counter_left=0;
    static int counter_right=0;
    static int player_level=0;
    public static int counter_win=0;
   public static boolean inter=false;
    public static boolean in=false,w;
     int h = 0 ;
     long delay = h * 1000;
      static int minutes ,min=0,sec=0;
    int quit_counter=0;
   public static boolean inter_menu=false;
    public static int [] levels_open=new int[61];
private Image dbImage;
static public Image bg;
private Graphics dbg;
static public ImageIcon i=new ImageIcon("D:\\sokoban_5\\src\\sokoban\\golden.jpg");
public static level level = new level();
public static character_1 c1=new character_1();
public static character_2 c2=new character_2();


    ImageIcon stepBackIcon;
    ImageIcon menuIcon;
    ImageIcon repeatIcon;
    Image repeatImg;
    Image menuImg;
    Image stepBackImg;
 

    public Sokoban(int num)
    {
        
        System.out.println("sokoban " + num);
        addKeyListener(new Al()); 
        player_level=num;
        setTitle("SOKOBAN");
        setSize(800, 800);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        if(chracter_number==1)
        c1.Draw_character();
        else
           c2.Draw_character();
        player_x=65;
        player_y=135;
        if(chracter_number==1)
        {
        player_x=65;
        player_y=0;
        }
        player_i=0;
        player_j=0;
         moves=0;
    
            u=false;
            l=false;
            d=false;
            r=false;
            counter=0;
            _c=0;
            move=false;
            in=false;
            first=false;
       this.addMouseListener(new mouseHelper());
        //System.out.println(player_level);
        
        
    }
   
  public  boolean win()
    {
       
         w=true;
        
        for(int i=0;i<10;++i)
        {
            for(int j=0;j<10;++j)
            {
                if (map[i][j]==3)
                    w=false;
            }
        }
        
        return  w;
       
    }
    public void quit()
    {
        setVisible(false);
        System.out.println("sokoban.Sokoban.quit()");
    }
    public void open()
    {
        setVisible(true);
        System.out.println("sokoban.Sokoban.open()");
    }
    
   
    public void close()
      {
          WindowEvent windowclosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
          Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowclosing);
          
      }
    public void paint(Graphics g)
    {
        dbImage=createImage(getWidth(),getWidth());
        dbg=dbImage.getGraphics();
        try {
            paintphoto(dbg);
        } catch (IOException ex) {
            Logger.getLogger(Sokoban.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Sokoban.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Sokoban.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(dbImage, 0, 0, this);
        
        
    }
    public  void paintphoto(Graphics g) throws FileNotFoundException, IOException, ClassNotFoundException, InterruptedException
    {
       bg=i.getImage();
       g.drawImage(bg, 0, 0, null);
          paintRepeatButton(g);
      if(in==false)
      {
         level.display_level(player_level);
         in=true;
         counter_win=0;
         setVisible(true);
      }
          g.setFont(new Font("jjjj",Font.BOLD,25));
          g.setColor(Color.WHITE);
          g.drawString("Level : "+player_level, 200,60);
          g.drawString("moves : "+moves, 350,60);
          g.drawString("pushes : "+pushes,500 ,60);
          
              
         level.paint(g);
         if(chracter_number==2)
          c2.paint(g);
         if(chracter_number==1)
          c1.paint(g);

       if (win()&&counter_win==0)
       {
           
            sound.Victory_Sound(victorySoundLocaion);
          levels_open[player_level]=1;
            esraa=true;
     
          
            
            if(player_level>=1 && player_level<=20)
              {
                System.out.println("a"+player_level);
                 
                 if(inter_menu==true)
                  new player_levels().setVisible(true);
                  player p1=new player(player_level,moves,pushes,minutes);
                  
          p1.saverecord(player_level, moves, pushes,minutes, p1.filepath);
          p1.readrecord( p1.filepath,String.valueOf(player_level) );
          p1.saverecord(player_level);
                  
              }
              else if(player_level >=21 &&player_level<=40)
              {
               if(inter_menu==true)
              new mediumMenu().setVisible(true);
             player p1=new player(player_level,moves,pushes,minutes);
          p1.saverecord(player_level, moves, pushes,minutes, p1.filepath);
          p1.readrecord( p1.filepath,String.valueOf(player_level) );
          
           p1.saverecord(player_level);
           
                  
                  
             }
              else if(player_level>=41 &&  player_level<=60)
              {
                  if(inter_menu==true)
                 new hardMenu().setVisible(true);
                  player p1=new player(player_level,moves,pushes,minutes);
          p1.saverecord(player_level, moves, pushes,minutes, p1.filepath);
          p1.readrecord( p1.filepath,String.valueOf(player_level) );
          
                  p1.saverecord(player_level);
              }
              else{System.out.println("else"+player_level);};
            board b = new board();
     
      b.setName_txt(best_name);
      b.setLevel_txt(player_level);
      b.setMoves_txt(moves);
      b.setPushes_txt(pushes);
      b.setScore_txt(best_moves);
      b.setTime_txt(min);
      b.setSec(sec);
      b.setVisible(true);
          
           
           min=0;
           sec=0; 
         
          
            u=false;
            l=false;
            d=false;
            r=false;
            counter=0;
             _c=0;
           //qui=true;
            move=false;
            first=false;
            counter_win++;
            
          
       }
       else
       {
          
  
        minutes = h / 60;
      int seconds = h % 15000;
      
      if(seconds%250==0)
      {
          sec++;
      }
      if(sec==59)
      {
          sec=0;
          min++;
      }
      
      h = h +1;
      delay = delay - 1000;
      
          // System.out.println(player_x+" "+player_y);
    
       }
       //System.out.println(map[player_i][player_j+1]);
        //System.out.println(qui+" "+quit_counter);
     if(qui==true)
     {
         quit();
         quit_counter++;
         inter=false;
     }
     else{
         if(quit_counter>0)
         open();
     }
        repaint();
        
       
    }
    
    
      public void paintRepeatButton(Graphics g){
        
        
        ImageIcon menuIcon = new ImageIcon("D:\\sokoban_5\\src\\sokoban\\menuIcon_3.png");
        menuImg= menuIcon.getImage();
        g.drawImage(menuImg, 30, 30, null);
        
        ImageIcon stepBackIcon = new ImageIcon("D:\\sokoban_5\\src\\sokoban\\stepBtn_1.png");
        stepBackImg=stepBackIcon.getImage();
        g.drawImage(stepBackImg, 80, 30, null);
        
        ImageIcon repeatIcon = new ImageIcon("D:\\sokoban_5\\src\\sokoban\\repeatBtn_1.png");
        repeatImg = repeatIcon.getImage();
        g.drawImage(repeatImg, 130, 30, null);
        
        
        
      }
     
    public static void main(String[] args) {
        String musicGameLocaion= "D:\\sokoban_5\\src\\sokoban\\Game_Music.wav" ;
        sounds sound =new sounds() ;
        sound.Game_Music(musicGameLocaion);
        
       Sokoban s ;
      String basePath = new File("").getAbsolutePath();
     System.out.println(basePath);
        
        
          
        mainMenu m=new mainMenu();
        m.setVisible(true);
        
       
    }
    
}

