package com.example.frexesyolanda1eva;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView miTexto;
ImageButton imagen;
Button contacto;
ImageView androide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miTexto = (TextView) findViewById(R.id.miTexto);
        imagen = (ImageButton) findViewById(R.id.imagen);
        contacto = (Button) findViewById(R.id.contacto);
         androide = (ImageView) findViewById(R.id.androide);
         Animation anim = AnimationUtils.loadAnimation(this,R.anim.nombre);
         miTexto.startAnimation(anim);
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.hyperspace_jump);
        androide.startAnimation(anim1);

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Contacto.class);

                startActivity(intent);
            }
        });
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculadora.class);


                startActivity(intent);
            }
        });
    }


    public void nombreanim(View view){
        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.nombre);
        miTexto.startAnimation(animacion);
    }

    public void imagenanim(View view){
        Animation animacion1 = AnimationUtils.loadAnimation(this,R.anim.hyperspace_jump);
        androide.startAnimation(animacion1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String mensaje = "";
        switch (item.getItemId()){
            case R.id.MnOp1:
                Intent intent = new Intent(MainActivity.this , MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.MnOp2:
                Intent intent1 = new Intent(MainActivity.this , Calculadora.class);
                startActivity(intent1);
                return true;
            case R.id.MnOp3:
                Intent intent2 = new Intent(MainActivity.this , Contacto.class);
                startActivity(intent2);
                return true;
            case R.id.MnOp4:
                searchWebb(getReferrer().getQuery());
                return true;
            case R.id.MnOp5:
                searchWeb(getReferrer().getQuery());
                return true;
            case R.id.MnOp0:
                return true;
            case R.id.MnOp9:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu , View view , ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu , view , menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);


    }
    public void searchWeb( String query) {
        query = "https://www.gmail.com/mail/help/intl/es/about.html?iframe";
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, query);
            startActivity(intent);
        }

    public void searchWebb( String query2) {
        query2 = "https://web2.0calc.es/";
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, query2);
        startActivity(intent);
    }


}