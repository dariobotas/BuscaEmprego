package org.mobwell.academy.buscaemprego.activities;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import org.mobwell.academy.buscaemprego.R;
import org.mobwell.academy.buscaemprego.model.JobPosition;

public class EditJob extends Activity {

    private EditText pos, des, loc, pho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_job);

        pos = (EditText) findViewById(R.id.ejob_edpos);
        des = (EditText) findViewById(R.id.ejob_eddes);
        loc = (EditText) findViewById(R.id.ejob_edloc);
        pho = (EditText) findViewById(R.id.ejob_edcon);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_job, menu);
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

    public void saving (View v){
        JobPosition newJob = new JobPosition(pos.getText().toString(), loc.getText().toString(), null, des.getText().toString(),
                null, pho.getText().toString());
        Log.d("EDJOB", newJob.getPosition());

    }
}
