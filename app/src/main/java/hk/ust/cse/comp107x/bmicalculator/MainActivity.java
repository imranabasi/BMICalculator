package hk.ust.cse.comp107x.bmicalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void btnCalculateBMI(View v){

            EditText editTextHeight = (EditText) findViewById(R.id.userHeight);
            EditText editTextWeight = (EditText) findViewById(R.id.userWeight);
            TextView textViewResult = (TextView) findViewById(R.id.resultBMI);
            Double height = Double.parseDouble(editTextHeight.getText().toString());
            Double weight = Double.parseDouble(editTextWeight.getText().toString());
            Double BMI = weight/(height * height);
            textViewResult.setText(Double.toString(BMI));


    }
}
