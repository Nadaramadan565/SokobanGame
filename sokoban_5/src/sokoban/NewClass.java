/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

/**
 *
 * @author pc
 */
public class NewClass {
    
    
     public int player_level;
  public int x;
 
    NewClass() {
       
      
      
         }
   

    public int getPlayer_level() {
        return player_level;
    }

    public void setPlayer_level(int player_level) {
        this.player_level = player_level;
    }

     public static void main(String[] args) {
           NewClass []n=new NewClass[61];
             NewClass o=new  NewClass();
             for(int i=0;i<n.length;i++)
             {
                 o.player_level=0;
                 n[i]=o;
             }
           
          
       //n[0]=o;
       for(int i=0;i<n.length;i++)
             {
                 o.player_level=0;
                 n[i]=o;
                 System.out.println("hhhhh");
        System.out.println(o.player_level);
             }
         
   
        
         
         
     }
    
    
}
