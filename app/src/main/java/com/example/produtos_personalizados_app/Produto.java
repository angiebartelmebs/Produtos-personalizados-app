package com.example.produtos_personalizados_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Produto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        View v = findViewById(R.id.btedit);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Codigo para navegacao para a tela de add produto ao clicar no botão de incerir produto */
                Intent nav = new Intent(view.getContext(),EditarProdutoActivity.class);
                startActivity(nav);
            }
        });


        View e = findViewById(R.id.btadd);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Codigo para navegacao para a tela de add produto ao clicar no botão de incerir produto */
                Intent nav = new Intent(view.getContext(),AddProdutoActivity.class);
                startActivity(nav);
            }
        });
    }
}

