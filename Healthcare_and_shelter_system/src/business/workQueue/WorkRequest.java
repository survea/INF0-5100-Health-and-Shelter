/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.enterprise.Enterprise;
import business.network.Network;
import business.userAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Diksha Godse
 */
public class WorkRequest {
    
    private String objectName;
    
    private String typeOfRequest;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private WorkRequest request;
    
        private String nurseStatus;
    private String nurseMessage;
    private String labMessage;
    private Date requestDate;
    private Date resolveDate;
    
    //    Patient Registration
    private String patientfirstname;
    private String patientlastname;
    private int patientid;
    private int pheight;
    private int pweight;
    private String pgender;
    private String pimage;
    private String pbloodgrp;
    private String pbloodpres;
    private float pglucoselvl;
    private float pbodytemp;
    private String psymptoms;
    private String pdisease;
    private String pdiagnosis;
    private String ppriority;
    private int approxPatientFee;
    private int HospitalFee = 0;

    // Fund Raiser
    private String companyName;
    private String name;
    private String username;
    private String password;
    private String role;
    private String address;
    private String mobile;
    private String email;
    private String donarName;
    
    // Shelter Request
    private String shelterRequestName;
    private String assignedfor;
    private String assignedShelter;
    private int age;
    
    // interNetwork;
    private Enterprise requestedEnterprise;
    private Network requestedNetwork;
    private int requestedAmount;
    
    @Override
    public String toString(){
        return objectName;
    }

    public int getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(int requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    
    public Network getRequestedNetwork() {
        return requestedNetwork;
    }

    public void setRequestedNetwork(Network requestedNetwork) {
        this.requestedNetwork = requestedNetwork;
    }
    
    public Enterprise getRequestedEnterprise() {
        return requestedEnterprise;
    }

    public void setRequestedEnterprise(Enterprise requestedEnterprise) {
        this.requestedEnterprise = requestedEnterprise;
    }
    
    public String getObjectName() {
        return objectName;
    }
    
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getDonarName() {
        return donarName;
    }

    public void setDonarName(String donarName) {
        this.donarName = donarName;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShelterRequestName() {
        return shelterRequestName;
    }

    public void setShelterRequestName(String shelterRequestName) {
        this.shelterRequestName = shelterRequestName;
    }

    public String getAssignedfor() {
        return assignedfor;
    }

    public void setAssignedfor(String assignedfor) {
        this.assignedfor = assignedfor;
    }

    public String getAssignedShelter() {
        return assignedShelter;
    }

    public void setAssignedShelter(String assignedShelter) {
        this.assignedShelter = assignedShelter;
    }
    
    

    public WorkRequest getRequest() {
        return request;
    }

    public void setRequest(WorkRequest request) {
        this.request = request;
    }

    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
    
    
    
    
    public String getTypeOfRequest() {
        return typeOfRequest;
    }

    public void setTypeOfRequest(String typeOfRequest) {
        this.typeOfRequest = typeOfRequest;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String getPatientfirstname() {
        return patientfirstname;
    }

    public void setPatientfirstname(String patientfirstname) {
        this.patientfirstname = patientfirstname;
    }

    public String getPatientlastname() {
        return patientlastname;
    }

    public void setPatientlastname(String patientlastname) {
        this.patientlastname = patientlastname;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getPheight() {
        return pheight;
    }

    public void setPheight(int pheight) {
        this.pheight = pheight;
    }

    public int getPweight() {
        return pweight;
    }

    public void setPweight(int pweight) {
        this.pweight = pweight;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getPbloodgrp() {
        return pbloodgrp;
    }

    public void setPbloodgrp(String pbloodgrp) {
        this.pbloodgrp = pbloodgrp;
    }

    public String getPbloodpres() {
        return pbloodpres;
    }

    public void setPbloodpres(String pbloodpres) {
        this.pbloodpres = pbloodpres;
    }

    public float getPglucoselvl() {
        return pglucoselvl;
    }

    public void setPglucoselvl(float pglucoselvl) {
        this.pglucoselvl = pglucoselvl;
    }

    public float getPbodytemp() {
        return pbodytemp;
    }

    public void setPbodytemp(float pbodytemp) {
        this.pbodytemp = pbodytemp;
    }

    public String getPsymptoms() {
        return psymptoms;
    }

    public void setPsymptoms(String psymptoms) {
        this.psymptoms = psymptoms;
    }

    public String getPdisease() {
        return pdisease;
    }

    public void setPdisease(String pdisease) {
        this.pdisease = pdisease;
    }

    public String getPdiagnosis() {
        return pdiagnosis;
    }

    public void setPdiagnosis(String pdiagnosis) {
        this.pdiagnosis = pdiagnosis;
    }

    public String getPpriority() {
        return ppriority;
    }

    public void setPpriority(String ppriority) {
        this.ppriority = ppriority;
    }

    public int getApproxPatientFee() {
        return approxPatientFee;
    }

    public void setApproxPatientFee(int approxPatientFee) {
        this.approxPatientFee = approxPatientFee;
    }

    public int getHospitalFee() {
        return HospitalFee;
    }

    public void setHospitalFee(int HospitalFee) {
        this.HospitalFee = HospitalFee;
    }

    public String getNurseStatus() {
        return nurseStatus;
    }

    public void setNurseStatus(String nurseStatus) {
        this.nurseStatus = nurseStatus;
    }

    public String getNurseMessage() {
        return nurseMessage;
    }

    public void setNurseMessage(String nurseMessage) {
        this.nurseMessage = nurseMessage;
    }

    public String getLabMessage() {
        return labMessage;
    }

    public void setLabMessage(String labMessage) {
        this.labMessage = labMessage;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
