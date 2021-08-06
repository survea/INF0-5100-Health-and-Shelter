/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.fundRaiser;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhairyasheel
 */
public class FundRaiserDirectory {
    private List<FundRaiser> fundRaiserDirectory = new ArrayList<>();

    public List<FundRaiser> getFundRaiserDirectory() {
        return fundRaiserDirectory;
    }

    public void setFundRaiserDirectory(List<FundRaiser> fundRaiserDirectory) {
        this.fundRaiserDirectory = fundRaiserDirectory;
    }
    
    public FundRaiser create(){
        FundRaiser fundRaiser = new FundRaiser();
        fundRaiserDirectory.add(fundRaiser);
        return fundRaiser;
    }
    
    public void remove(FundRaiser encounter) {
        fundRaiserDirectory.remove(encounter);
    }
    
}
