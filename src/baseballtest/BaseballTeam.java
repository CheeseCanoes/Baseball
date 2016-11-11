/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author sapin2399
 */
public class BaseballTeam extends Sports implements Stats {
    
        
       int gamesWon=0;
       int gamesLost=0;
       int gamesTied=0;
       
       public  void win(){
           gamesWon=gamesWon++;
       }
       public void lose(){
           gamesLost=gamesLost++;
       }
       public void tie(){
           gamesTied=gamesTied++;
       }
       
     
           
       
}
