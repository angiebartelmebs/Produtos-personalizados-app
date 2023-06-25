package com.example.produtos_personalizados_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddProdutoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_produto);

        View v = findViewById(R.id.btsalvar);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
            public void salvarInformacoes(View view) {
                // Lógica para salvar as informações aqui

                //Salvar o conteúdo do formulario
                EditText editTextNome = findViewById(R.id.editTextNome);
                EditText editTextDescricao = findViewById(R.id.editTextdescricao);
                EditText editTexTam = findViewById(R.id.editTexTam);
                EditText editTexTam = findViewById(R.id.editTexTam);
                EditText editTextCor= findViewById(R.id.editTextCor);
                String nome = editTextNome.getText().toString();
                String descricao = editTextDescricao.getText().toString();
                String tam = editTexTam.getText().toString();
                String cor = editTextCor.getText().toString();

                // Exibir uma mensagem de sucesso utilizando o Toast
                Toast.makeText(AddProdutoActivity.this, "Produto salvo com sucesso!", Toast.LENGTH_SHORT).show();


            }


        });


    }
}