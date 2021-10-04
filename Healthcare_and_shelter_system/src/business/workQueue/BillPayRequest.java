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
public class BillPayRequest extends WorkRequest{
    
    private WorkRequest patientDetails;

    public WorkRequest getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(WorkRequest patientDetails) {
        this.patientDetails = patientDetails;
    }


}
