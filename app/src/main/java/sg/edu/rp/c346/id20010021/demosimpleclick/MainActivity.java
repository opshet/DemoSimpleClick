package sg.edu.rp.c346.id20010021.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {


    Button btnDisplay;
    TextView tvmsg;
    EditText etdata;
    ToggleButton tbEnabler;
    RadioGroup rgGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay=findViewById(R.id.btnDisplay);
        etdata=findViewById(R.id.etdata);
        tvmsg=findViewById(R.id.tvmsg);
        tbEnabler=findViewById(R.id.toggleButton);
        rgGender=findViewById(R.id.rgGender);

        btnDisplay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text =etdata.getText().toString();
                tvmsg.setText(text);

                /*Toast.makeText(MainActivity.this,
                        "My First Toast",
                        Toast.LENGTH_SHORT).show();

                 */
                    String stringResponse = etdata.getText().toString();

                    int checkedRadioId = rgGender.getCheckedRadioButtonId();
                    tvmsg.setText(stringResponse);
                    if(checkedRadioId == R.id.rbMale){
                        // Write the code when male selected
                        tvmsg.setText("He says "+stringResponse);
                    }
                    else{
                        // Write the code when female selected
                        tvmsg.setText("She says "+stringResponse);
                    }
                }
            });


        tbEnabler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (tbEnabler.isChecked()==true){
                    etdata.setEnabled(true);
                    etdata.setBackgroundColor(Color.TRANSPARENT);
                } else {
                    etdata.setEnabled(false);
                    etdata.setBackgroundColor(Color.RED);
                }
            }
        });







    }
}