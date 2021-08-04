/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.organization.Organization;
import business.roles.Role;
import business.roles.SystemAdminRole;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class EcoSystem extends Organization{
        private static EcoSystem business;
    private List<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network) {
        networkList.remove(network);
    }
    
    public void updateNetwork(Network network,String name){
        for(Network n:networkList){
            if(network.equals(network)){
                network.setName(name);
            }
        }
    }

    @Override
    public List<Role> getSupportedRole() {
        List<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }

    public List<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public boolean checkIfUserIsUnique(String userName) {
        if (this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        return true;
    }

    public boolean isDuplicateNetwork(String name) {
     for(Network n:networkList){
            if(n.equals(name)){
                return true;
            }
        }    
    return false;
    }
}
