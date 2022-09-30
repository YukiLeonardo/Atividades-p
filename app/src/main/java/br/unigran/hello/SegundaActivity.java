package br.unigran.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView msgNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        msgNome = findViewById(R.id.id_msgNome);
        String nome = getIntent().getStringExtra("Nome");
        msgNome.setText(nome);

    }
    public void next2 (View view){


        Intent it = new Intent(this, TerceiraActivity.class);

        startActivity(it);
    }
}