package sokoban;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class sounds {
    
    public void Game_Music(String fileLocation)
    {
        try {
            
            File GameMusic =new File(fileLocation) ;
            if(GameMusic.exists())
            {
               AudioInputStream AIS =AudioSystem.getAudioInputStream(GameMusic) ;
               Clip gameMusic =AudioSystem.getClip() ;
               gameMusic.open(AIS);
               gameMusic.start();
               gameMusic.loop(Clip.LOOP_CONTINUOUSLY);
               
            }else{
                System.out.println("can't find file");
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void Character_Moving(String fileLocation)
    {
        try {
            
            File CharacterMoving =new File(fileLocation) ;
            if(CharacterMoving.exists())
            {
               AudioInputStream AIS =AudioSystem.getAudioInputStream(CharacterMoving) ;
               Clip characterMoving =AudioSystem.getClip() ;
               characterMoving.open(AIS);
               characterMoving.start();
               
            }else{
                System.out.println("can't find file");
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void Getting_Coin(String fileLocation)
    {
        try {
            
            File GettingCoin =new File(fileLocation) ;
            if(GettingCoin.exists())
            {
               AudioInputStream AIS =AudioSystem.getAudioInputStream(GettingCoin) ;
               Clip gettingCoin =AudioSystem.getClip() ;
               gettingCoin.open(AIS);
               gettingCoin.start();
               
            }else{
                System.out.println("can't find file_co");
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void Victory_Sound(String fileLocation)
    {
        try {
            
            File VictorySound =new File(fileLocation) ;
            if(VictorySound.exists())
            {
               AudioInputStream AIS =AudioSystem.getAudioInputStream(VictorySound) ;
               Clip victorySound =AudioSystem.getClip() ;
               victorySound.open(AIS);
               victorySound.start();
               
            }else{
                System.out.println("can't find file_win");
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}