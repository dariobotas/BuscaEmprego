package org.mobwell.academy.buscaemprego;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.mobwell.academy.buscaemprego.activities.EditJob;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button edPos;
    private Button vPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edPos = (Button) findViewById(R.id.main_btpos);
        vPos = (Button) findViewById(R.id.main_btsee);

        edPos.setOnClickListener(this);
        vPos.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_btpos:{
                Intent it = new Intent(this, EditJob.class);
                startActivity(it);
                break;}
            case R.id.main_btsee:
                Toast.makeText(this, "BBBAAAAMMMM!!", Toast.LENGTH_SHORT).show();
                break;

        }


    }
}
