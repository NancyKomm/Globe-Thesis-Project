package com.example.globe;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingDialog {

    Activity activity;
    AlertDialog dialog;

    public LoadingDialog(Activity myActivity) {
        activity = myActivity;
    }

    // Method to show the loading dialog
    void startLoadingDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.custom_layout,null));
        builder.setCancelable(false);
        dialog = builder.create();
        dialog.show();
    }

    // Method to dismiss the loading dialog
    void dismissDialog(){
        dialog.dismiss();
    }
}
