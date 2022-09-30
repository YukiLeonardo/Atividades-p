package br.unigran.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView msgNome;
    private String nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        msgNome = findViewById(R.id.id_msgNome);
        Intent it  = getIntent();
        nome = (it.getStringExtra("Nome"));

        msgNome.setText(nome + ".\n Tudo bem ?");

    }
    public void next2 (View view){


        Intent it = new Intent(this, TerceiraActivity.class);

        startActivity(it);
    }
}