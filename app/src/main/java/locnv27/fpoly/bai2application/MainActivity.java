package locnv27.fpoly.bai2application;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener {
    private CheckBox cbAndroid, cbIos, cbServer;
    private RadioGroup radioGroup;
    private RadioButton rdNam, rdNu, rdKhac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbAndroid = findViewById(R.id.cbAndroid);
        cbIos = findViewById(R.id.cbIOS);
        cbServer = findViewById(R.id.cbServer);
        cbServer.setOnCheckedChangeListener(this);
        cbIos.setOnCheckedChangeListener(this);
        cbAndroid.setOnCheckedChangeListener(this);

        radioGroup = findViewById(R.id.rdGroupd);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int id =radioGroup.getCheckedRadioButtonId();
                switch (id){
                    case R.id.rdkhac:
                        Toast.makeText(getApplicationContext(),"Khác",
                                Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rdNam:
                        Toast.makeText(getApplicationContext(),"Nam",
                                Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rdNu:
                        Toast.makeText(getApplicationContext(),"Nữ",
                                Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        rdKhac = findViewById(R.id.rdkhac);
        rdNam = findViewById(R.id.rdNam);
        rdNu = findViewById(R.id.rdNu);
        Typeface font = Typeface.createFromAsset(getAssets(),"PRISTINA.TTF");
        cbAndroid.setTypeface(font);
        cbIos.setTypeface(font);
        cbServer.setTypeface(font);
        rdNu.setTypeface(font);
        rdNam.setTypeface(font);
        rdKhac.setTypeface(font);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        switch (compoundButton.getId()){
            case R.id.cbAndroid:
                if(b)
                Toast.makeText(getApplicationContext(),compoundButton.getText().toString(),
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.cbServer:
                if(b)
                Toast.makeText(getApplicationContext(),compoundButton.getText().toString(),
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.cbIOS:
                if(b)
                Toast.makeText(getApplicationContext(),compoundButton.getText().toString(),
                    Toast.LENGTH_LONG).show();
                break;
        }
    }
}