/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author Diksha Godse
 */
public class PatientTestRequest  extends WorkRequest {

    private String patientResult;

    public String getPatientResult() {
        return patientResult;
    }

    public void setPatientResult(String patientResult) {
        this.patientResult = patientResult;
    }
   
    
}
