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

        Patient patient = new Patient("Patient2", 1, 25, 23, 2, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Insulin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testInsulin2Rule is correct.");
    }
    
    @Test
    public void testMetformin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient4", 1, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testMetformin1Rule is correct.");
    }

@Test
    public void testMetformin2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient4", 1, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testMetformin2Rule is correct.");
    }

@Test
    public void testMetformin3Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient5", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testMetformin3Rule is correct.");
    }

    @Test
    public void testMetformin4Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient6", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testMetformin4Rule is correct.");
    }

    @Test
    public void testSitagliptin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient7", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testSitagliptin1Rule is correct.");
    }
    
    @Test
    public void testSaxagliptin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient8", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testSaxagliptin1Rule is correct.");
    }
    
    @Test
    public void testLinagliptin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient9", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testLinagliptin1Rule is correct.");
    }
    
    @Test
    public void testDulaglutide1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient10", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testDulaglutide1Rule is correct.");
    }
    
    @Test
    public void testDulaglutide2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient11", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testDulaglutide2Rule is correct.");
    }
    
    @Test
    public void testExenatide1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient12", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testExenatide1Rule is correct.");
    }
    
    @Test
    public void testExenatide2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient13", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testExenatide2Rule is correct.");
    }
    
    @Test
    public void testLixisenatide1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient14", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testLixisenatide1Rule is correct.");
    }
    
    @Test
    public void testLixisenatide2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient15", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testLixisenatide2Rule is correct.");
    }
    
    @Test
    public void testSemaglutide1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient16", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testSemaglutide1Rule is correct.");
    }
    
    @Test
    public void testSemaglutide2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient17", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testSemaglutide2Rule is correct.");
    }
    
    @Test
    public void testBexagliflozin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient18", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testBexagliflozin1Rule is correct.");
    }
    
    @Test
    public void testCanagliflozin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient19", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testCanagliflozin1Rule is correct.");
    }
    
    @Test
    public void testDapagliflozin1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient20", 2, 25, 23, 4, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testDapagliflozin1Rule is correct.");
    }
    
    @Test
    public void testGlimepiride1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient21", 2, 25, 23, 2, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testGlimepiride1Rule is correct.");
    }
    
    @Test
    public void testGlimepiride2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient22", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testGlimepiride2Rule is correct.");
    }
    
    @Test
    public void testGlipizide1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient23", 2, 25, 23, 2, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testGlipizide1Rule is correct.");
    }
    
    @Test
    public void testGlipizide2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient24", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testGlipizide2Rule is correct.");
    }
    
    @Test
    public void testGlyburide1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient25", 2, 25, 23, 2, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testGlyburide1Rule is correct.");
    }
    
    @Test
    public void testGlyburide2Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient26", 2, 25, 23, 3, false, false, true, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testGlyburide2Rule is correct.");
    }
    
    @Test
    public void testRosiglitazone1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient27", 2, 24, 23, 4, false, false, false, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testRosiglitazone1Rule is correct.");
    }
    
    @Test
    public void testPioglitazone1Rule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("diabetesSession");

        Patient patient = new Patient("Patient28", 2, 24, 23, 4, false, false, false, true, false, false);
        ksession.insert(patient);
        int firedRules = ksession.fireAllRules();
        ksession.dispose();

        assertEquals(1, firedRules);
        assertEquals(1, patient.getTreatments().size());
        assertEquals("Metformin", patient.getTreatments().iterator().next().getName());
        
        System.out.println("Test testPioglitazone1Rule is correct.");
    }
}