/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.roles.Role;
import business.roles.SystemAdminRole;
import business.workQueue.WorkQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diksha Godse
 */
public class EcoSystem extends Organization {

    public static EcoSystem business;
    public List<Network> networkList;
    public WorkQueue workqueue;

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

    public void updateNetwork(Network network, String name) {
        for (Network n : networkList) {
            if (n.equals(network)) {
                n.setName(name);
            }
        }
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
        workqueue = new WorkQueue();
    }

    public EcoSystem(List<Network> networkList) {
        super();
        this.networkList = networkList;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
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
        for (Network n : networkList) {
            if (n.equals(name)) {
                return true;
            }
        }
        return false;
    }

//    public static EcoSystem getBusiness() {
//        return business;
//    }
//
//    public static void setBusiness(EcoSystem business) {
//        EcoSystem.business = business;
//    }

    @Override
    public List<Role> getSupportedRole() {
        List<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

}
