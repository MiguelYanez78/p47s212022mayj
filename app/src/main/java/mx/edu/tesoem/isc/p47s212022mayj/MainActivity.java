package mx.edu.tesoem.isc.p47s212022mayj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsuma,btnresta, btnmulti, btndivi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnresta);
        btnmulti = findViewById(R.id.btnmulti);
        btndivi = findViewById(R.id.btndivi);



       btnsuma.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent psuma = new Intent(MainActivity.this,SumaActivity.class);
               startActivity(psuma);
           }
       });
       btnresta.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,RestaActivity.class);
               startActivity(intent);
           }
       });
       btnmulti.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent pmulti = new Intent(MainActivity.this,MultiActivity.class);
               startActivity(pmulti);
           }
       });
       btndivi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent divi = new Intent(MainActivity.this,DivActivity.class);
               startActivity(divi);
           }
       });
    }
}