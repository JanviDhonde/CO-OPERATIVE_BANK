
package bankingapplication;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class changestyle {
   
String change [] = {"com.jtattoo.plaf.texture.TextureLookAndFeel","com.jtattoo.plaf.noire.NoireLookAndFeel","com.jtattoo.plaf.aluminium.AluminiumLookAndFeel","com.jtattoo.plaf.graphite.GraphiteLookAndFeel","com.jtattoo.plaf.hifi.HiFiLookAndFeel","com.jtattoo.plaf.mcwin.McWinLookAndFeel"};    
   
public void chabgelock(int index){
   try{
       UIManager.setLookAndFeel(change[index]);
   }catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
   }
}

}
