package com.example.amy.sizebook;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class EditRecordClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_input_layout);
    }

    public void saveButtonClicked(View v){
       /* ArrayList<String> inputarray = new ArrayList<String>();*/

        String recordName = ((EditText)findViewById(R.id.input_name)).getText().toString();
        String recordNeck = ((EditText)findViewById(R.id.input_neck)).getText().toString();
        String recordBust = ((EditText)findViewById(R.id.input_bust)).getText().toString();
        String recordChest = ((EditText)findViewById(R.id.input_chest)).getText().toString();
        String recordWaist = ((EditText)findViewById(R.id.input_waist)).getText().toString();
        String recordHip = ((EditText)findViewById(R.id.input_hip)).getText().toString();
        String recordInseam = ((EditText)findViewById(R.id.input_inseam)).getText().toString();
        String recordComment = ((EditText)findViewById(R.id.input_comment)).getText().toString();

        /*inputarray.add(1, recordName);
        inputarray.add(2, recordNeck);
        inputarray.add(3, recordBust);
        inputarray.add(4, recordChest);
        inputarray.add(5, recordWaist);
        inputarray.add(6, recordHip);
        inputarray.add(7, recordInseam);
        inputarray.add(8, recordComment);*/

        if (recordName.equals("")) {

        }
        else{
            /*record.setName(recordName);
            record.setNeck(recordNeck);
            record.setBust(recordBust);
            record.setChest(recordChest);
            record.setWaist(recordWaist);
            record.setHip(recordHip);
            record.setInseam(recordInseam);
            record.setComment(recordComment);*/
            Intent intent = new Intent();
            intent.putExtra(Intent_Constants.INTENT_RECORD_FIELD,recordName);
            setResult(Intent_Constants.INTENT_RESULT_CODE,intent);
            finish();
        }

    }
}
