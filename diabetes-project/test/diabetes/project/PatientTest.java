/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diabetes.project;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

/**
 *
 * @author beatr
 */

public class PatientTest {

    @Test
    public void testInsulin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient1", 1, 25, 23, 1, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Insulin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testInsulin1Rule is correct.");
    }

    @Test
    public void testInsulin2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient2", 1, 25, 23, 1, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Insulin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testInsulin1Rule is correct.");
    }
    
    @Test
    public void testMetformin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient2", 1, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testMetformin1Rule is correct.");
    }



}