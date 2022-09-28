package mx.edu.tesoem.isc.p47s212022mayj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {

    Button btncalcular,btnregresa;
    EditText txt1, txt2;
    TextView lresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        btncalcular = findViewById(R.id.btncalcular);
        btnregresa = findViewById(R.id.btnregresa);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        lresult = findViewById(R.id.lresult);

        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               try {
                   int n1 = Integer.parseInt(txt1.getText().toString());
                   int n2 = Integer.parseInt(txt2.getText().toString());
                   int re = n1 - n2;
                   lresult.setText(lresult.getText().toString() + "" + String.valueOf(re));
               }catch (NumberFormatException ex){
                   lresult.setText("No se han colocado numeros validos");
               }
            }
        });

        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}