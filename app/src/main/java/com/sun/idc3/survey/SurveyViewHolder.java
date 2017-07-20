package com.sun.idc3.survey;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by IDC2 on 7/20/17.
 */

public class SurveyViewHolder extends RecyclerView.ViewHolder{
    public TextView policyNumber,claimNumber,vehicleRegNumber;
    public ImageView status;

    public SurveyViewHolder(View itemView) {
        super(itemView);
        policyNumber = (TextView) itemView.findViewById(R.id.phoneNumber);
        claimNumber = (TextView) itemView.findViewById(R.id.claimNumber);
        vehicleRegNumber = (TextView) itemView.findViewById(R.id.vehicleRegNumber);
        status = (ImageView) itemView.findViewById(R.id.status);
    }
}
