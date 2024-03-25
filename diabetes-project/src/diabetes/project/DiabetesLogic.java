/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diabetes.project;

import java.util.Set;
import static org.apache.tools.ant.dispatch.DispatchUtils.execute;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;



public class DiabetesLogic {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     int choice = 1;
     switch(choice){
         case 1:    
            boolean authorized = DiabetesInterface.logIn(DiabetesInterface.promptForDoctorCredentials());
            if (authorized){
            DiabetesInterface.menu(); // This calls your custom execute method
      }
     }
     
  }
}

    