package com.example.amy.sizebook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*Referenced youtube video "How to Build a To Do List App in Android" by channel Code Buster
* https://www.youtube.com/watch?v=3QHgJnPPnqQ*/

public class MainScreenActivity extends AppCompatActivity {
    /*
    Create the file that stores all of the records
    The format of the file is JSON
     */

    private static final String FILENAME = "file.sav";


    ListView listView;
    ArrayList<Record> testarrayList;
    ArrayAdapter<Record> testarrayAdapter;
    ArrayList<String> personarray;
    ArrayAdapter<String> personarrayAdapter;
    /*Record recordName;*/
    String recordName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        listView = (ListView) findViewById(R.id.oldRecordsList);
        /*testarrayList = new ArrayList<Record>();
        testarrayAdapter = new ArrayAdapter<Record>(this, android.R.layout.simple_list_item_1, testarrayList);*/
        personarray = new ArrayList<String>();
        personarrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, personarray);
        listView.setAdapter(personarrayAdapter);
    }


    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setClass(MainScreenActivity.this, EditRecordClass.class);
        startActivityForResult(intent, Intent_Constants.INTENT_REQUEST_CODE);
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Intent_Constants.INTENT_REQUEST_CODE) {
            /*Record recordName = data.getExtras().getParcelable("updatedRecord");*/
            String recordName = data.getStringExtra(Intent_Constants.INTENT_RECORD_FIELD);
            personarray.add(recordName);
            personarrayAdapter.notifyDataSetChanged();

        }
    }




   /* @Override
    protected void onStart() {
        super.onStart();

        loadFromFile();

        personarrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, personarray);
        listView.setAdapter(personarrayAdapter);

    }*/


    /*private void loadFromFile(){
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            Gson gson = new Gson();

            testarrayList = gson.fromJson(in, new TypeToken<ArrayList<Record>>() {
            }.getType());
            fis.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveInFile() {
        try {
            FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

            Gson gson = new Gson();
            gson.toJson(personarray, out);

            out.flush();

            fos.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }*/
}



/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/