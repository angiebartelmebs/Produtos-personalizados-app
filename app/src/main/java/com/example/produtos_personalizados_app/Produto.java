package com.example.produtos_personalizados_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Produto extends AppCompatActivity {

    private Integer id;
    private String Nome;
    private String Cor;
    private String Tamanho;
    private String Descricao;
    private String Valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        View v = findViewById(R.id.btadd);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Codigo para navegacao para a tela de add produto ao clicar no botão de incerir produto */
                Intent nav = new Intent(view.getContext(),AddProdutoActivity.class);
                startActivity(nav);
            }
        });


        View e = findViewById(R.id.btedit);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /* Codigo para navegacao para a tela de editar produto ao clicar no botão de Editar produto */
                Intent nav = new Intent(view.getContext(),EditarProdutoActivity.class);
                startActivity(nav);
            }
        });


    }

}

