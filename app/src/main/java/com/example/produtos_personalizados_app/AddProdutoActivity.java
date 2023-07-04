package com.example.produtos_personalizados_app;

import androidx.appcompat.app.AppCompatActivity;

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
                EditText addTextNome = findViewById(R.id.addTextNome);
                EditText addTextDescricao = findViewById(R.id.addTextdescricao);
                EditText addtTexTam = findViewById(R.id.addTexTam);
                EditText addTextCor= findViewById(R.id.addTextCor);
                EditText addTextValor= findViewById(R.id.addTextValor);

                String Nome = addTextNome.getText().toString();
                String Descricao = addTextDescricao.getText().toString();
                String Tam = addtTexTam.getText().toString();
                String Cor = addTextCor.getText().toString();
                String Valor = addTextValor.getText().toString();

                // Exibir uma mensagem de sucesso utilizando o Toast
                Toast.makeText(AddProdutoActivity.this, "Produto salvo com sucesso!", Toast.LENGTH_SHORT).show();


            }


        });


    }
}