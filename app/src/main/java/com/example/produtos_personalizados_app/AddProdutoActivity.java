package com.example.produtos_personalizados_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AddProdutoActivity extends AppCompatActivity {

    private EditText Nome;
    private EditText Descricao;
    private EditText Cor;
    private EditText Tamanho;
    private EditText Valor;

    private ConexãoBD ConexãoDB;
    private SQLiteDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_produto);

        ConexãoDB = new ConexãoBD(this);
        database = ConexãoDB.getWritableDatabase();


        Button btSalvar = findViewById(R.id.btsalvar);
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SalvarProduto();
            }
        });

                //Salvar o conteúdo do formulario
                EditText addTextNome = findViewById(R.id.addTextNome);
                EditText addTextDescricao = findViewById(R.id.addTextdescricao);
                EditText addtTexTam = findViewById(R.id.addTexTam);
                EditText addTextCor = findViewById(R.id.addTextCor);
                EditText addTextValor = findViewById(R.id.addTextValor);

                String Nome = addTextNome.getText().toString();
                String Descricao = addTextDescricao.getText().toString();
                String Tamanho = addtTexTam.getText().toString();
                String Cor = addTextCor.getText().toString();
                String Valor = addTextValor.getText().toString();

                //para executar operações CRUD
                ContentValues values = new ContentValues();
                values.put("nome", Nome);
                values.put("descricao", Descricao);
                values.put("tamanho", Tamanho);
                values.put("cor", Cor);
                values.put("valor", Valor);

                // Exibir uma mensagem de sucesso ou erro utilizando o Toast
                long insertedRowId = database.insert("produto", null, values);

                if (insertedRowId != -1) {
                    Toast.makeText(AddProdutoActivity.this, "Produto salvo com sucesso!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(AddProdutoActivity.this, "Produto salvo com sucesso!", Toast.LENGTH_SHORT).show();
                }

                  LinearLayout llProduto = findViewById(R.id.llProduto);

                  // Criação e configuração das TextViews para cada informação do produto
                  TextView nomeTextView = new TextView(this);
                  nomeTextView.setText("Nome: " + Nome);
                  llProduto.addView(nomeTextView);

                  TextView descricaoTextView = new TextView(this);
                  descricaoTextView.setText("Descrição: " + Descricao);
                  llProduto.addView(descricaoTextView);

                  TextView tamanhoTextView = new TextView(this);
                  tamanhoTextView.setText("Tamanho: " + Tamanho);
                  llProduto.addView(tamanhoTextView);

                   TextView corTextView = new TextView(this);
                   corTextView.setText("Cor: " + Cor);
                   llProduto.addView(corTextView);

                   TextView valorTextView = new TextView(this);
                   valorTextView.setText("Valor: " + Valor);
                   llProduto.addView(valorTextView);

    }

    private void SalvarProduto() {
    }


}


