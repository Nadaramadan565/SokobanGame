/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sokoban.Sokoban.levels_open;
import static sokoban.Sokoban.player_level;

////implements Serializable

/**
 *
 * @author Dell
 */
public class player  {
    private int player_l;
    public static String best_name;
    public static int best_moves;
   private int pushes;
    private int moves ;
    private int min ;
    static int  counter=0, index=0,minmum=100;
    private static Scanner x;
    public static String player_name;
    String filepath="file.txt";
    
    static int a[]=new int[100];
   public static ArrayList<String> array=new ArrayList<String>();

    public int getPlayer_l() {
        return player_l;
    }

    public int getPushes() {
        return pushes;
    }

    public int getMoves() {
        return moves;
    }

    
    player(int player_level,int moves,int pushes,int min)
    {
    player_l=player_level;
    this.moves=moves;
    this.pushes=pushes;
    this.min=min ;
    
   
    }
    public static void saverecord(int player_level,int moves,int pushes,int min,String filepath)
    {
        try 
        {
            
            FileWriter fw= new FileWriter(filepath,true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            pw.println( player_name+","+player_level +","+" moves "+","+moves+","+" pushes "+","+pushes+","+" minutes "+","+min+",");
            pw.flush();
            pw.close();
        
        
        
        }
        catch(Exception e){}
    }
       public static void readrecord(String filepath,String level_n)
       {

            String line;
     
           try
           {
               
               x=new Scanner (new File(filepath));
               ArrayList<String> arr=new ArrayList<String>();
              counter=0;
              minmum=1000;
               while(x.hasNext())
               {
                   
                   counter++;
          line =x.nextLine().toLowerCase().toString();
          String result=line;
          String[] resultarray= result.substring(0,result.length()).split(",");
          for (String string : resultarray) {
           System.out.println(string);
          }
          int c=0;
          
          
          for(int i=1;i<8;i=i+2)
          {
              a[c]=Integer.parseInt(resultarray[i]);
              
              
              //System.out.println("re"+resultarray[i]);
              ++c;
          }
          if(a[0]==player_level) 
              {
                  System.out.println(player_level+"/////////////////////////////////////////////////////////////////////");
                  if(a[1]<minmum)
                  {
                      minmum=a[1];
                      index=counter;
                      best_name=resultarray[0];
                      best_moves= minmum;
                  }
             }
                   //System.out.println(resultarray[0]+" "+player_name);
                   
                   System.out.println("name "+best_name+" index = "+index +" minumum "+minmum);
        
        System.out.println(level_n);
        
          if (line.contains(level_n))
               {
               arr.add(line);
               }
        else 
        {
         System.out.println("Not Found");
        }  
               }
   
               //JOptionPane.showMessageDialog(null,arr.get(arr.size()-1) );
                          
               System.out.println(arr.get(arr.size()-1));
              
               
           }
           catch(Exception e)
           {
           
           }       
       }
       
       
     public static void saverecord(int player_level)
       {
          
        try 
        {
            
            FileWriter fw= new FileWriter("player level.txt",true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            pw.println(player_name+","+player_level);
           
            pw.flush();
            pw.close();
        
        
        
        }
        catch(Exception e){}
        
        
        }
         public static void readrecord(String filepath) 
       {
          String l;
        

        try {
            x=new Scanner (new File(filepath));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(player.class.getName()).log(Level.SEVERE, null, ex);
        }
                       while (x.hasNext()){

           l=x.nextLine().toString();
           String result=l;
          String[] resultarray= result.substring(0,result.length()).split(",");
              array.add(l);
                           System.out.println(resultarray[0]+" "+player_name);
            if(resultarray[0].equals(player_name))
            {
                int x=0;
                x=Integer.parseInt(resultarray[1]);
                  levels_open[x]=1;      
            }
                       
                       
                       }    
                      
          
       }
}
