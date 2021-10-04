/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

/**
 *
 * @author dhairyasheel
 */
public class ShelterRequest extends WorkRequest {
    private String shelterAssigned;

    public String getShelterAssigned() {
        return shelterAssigned;
    }

    public void setShelterAssigned(String shelterAssigned) {
        this.shelterAssigned = shelterAssigned;
    }
    
}
