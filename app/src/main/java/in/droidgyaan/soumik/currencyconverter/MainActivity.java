package in.droidgyaan.soumik.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public void buttonPressed(View view){
        EditText dollar = (EditText)findViewById(R.id.dollarEntry);
        TextView rupeeValue = (TextView) findViewById(R.id.rupeeEntry);
        double dollarValue = Double.parseDouble(dollar.getText().toString());
        double convert = dollarValue*67.37;
        rupeeValue.setText(""+convert);
        Toast.makeText(getApplicationContext(),"The current dollar rate for $"+dollarValue +" is rupee"+convert,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
