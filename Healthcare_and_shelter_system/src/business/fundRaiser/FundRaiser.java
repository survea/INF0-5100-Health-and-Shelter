/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.fundRaiser;

import business.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class FundRaiser {
    private String companyName;
    private UserAccount user;
    private String address;
    private String mobile;
    private String email;
    private List<Double> donateList = new ArrayList<>();

    public FundRaiser(String name, UserAccount user, String address, String mobile, String email) {
        this.companyName = name;
        this.user = user;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }
    

    public FundRaiser() {
    }

    public List<Double> getDonateList() {
        return donateList;
    }

    public void setDonateList(List<Double> donateList) {
        this.donateList = donateList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getCorporateName() {
        return companyName;
    }

    public void setCorporateName(String corporateName) {
        this.companyName = corporateName;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }
    
    public void addFund(double item){
        donateList.add(item);
    }
    
    @Override
    public String toString(){
        if(!companyName.isEmpty()){
            return companyName;
        }
        return user.getEmployee().getName();
    }
}
