/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.roles;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Diksha Godse
 */
public abstract class Role {
     EcoSystem business;

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Nurse("Nurse"),
        Pharmacy("Pharmacy"),
        Receptionist("Redirector"),
        Volunteer("Volunteer"),
        Corporate("Corporate"),
        General("General");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            EcoSystem business);

    public EcoSystem getEcoSystem() {

        return business;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }   
}
