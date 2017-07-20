package com.sun.idc3.survey;

/**
 * Created by IDC2 on 7/20/17.
 */

public class SurveyDataHolder {
    public String id,policyNo,claimNo,status,vehicleRegNo,surveyDate,commets;

   public SurveyDataHolder(String id,String policyNo,String claimNo,String status,String vehicleRegNo,String surveyDate,String commets){
       this.id = id;
       this.policyNo = policyNo;
       this.claimNo =claimNo;
       this.status = status;
       this.vehicleRegNo = vehicleRegNo;
       this.surveyDate = surveyDate;
       this.commets = commets;
   }
}
