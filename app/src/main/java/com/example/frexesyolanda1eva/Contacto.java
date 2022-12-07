package com.example.frexesyolanda1eva;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Contacto extends AppCompatActivity {
EditText tituloo , asuntoo , correoo , contenidoo;
Button enviar;
SeekBar miseek;
TextView puntuacionn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
       EditText tituloo = (EditText) findViewById(R.id.titulo);
        EditText asuntoo = (EditText) findViewById(R.id.asunto);
        EditText correoo = (EditText) findViewById(R.id.correoelectronico);
        EditText contenidoo = (EditText) findViewById(R.id.contendio);
        Button enviar = (Button) findViewById(R.id.enviar);
        SeekBar miseek = (SeekBar) findViewById(R.id.seekBar);
        TextView puntuacionn = (TextView) findViewById(R.id.puntuacion);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String titulo = tituloo.getText().toString();
                String asunto = asuntoo.getText().toString();
                String correo = correoo.getText().toString();
                String puntuacion = puntuacionn.getText().toString();
                String contenido = contenidoo.getText().toString();
                String content = "PUNTUACIÓN: " + puntuacion + "\n" +  contenido;
                if(correo.equals(""))
                {
                    Toast.makeText(Contacto.this,"ingresa un correo", Toast.LENGTH_LONG).show();
                }


                else if(asunto.equals(""))
                {
                    Toast.makeText(Contacto.this,"ingresa el asunto", Toast.LENGTH_LONG).show();
                }
                else if(titulo.equals(""))
                {
                    Toast.makeText(Contacto.this,"ingresa el titulo", Toast.LENGTH_LONG).show();
                }


                else if(contenido.equals(""))
                {
                    Toast.makeText(Contacto.this, "ingresa un mensaje", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_TITLE , titulo );
                    intent.putExtra(Intent.EXTRA_EMAIL,
                            new String[]{correo});

                    intent.putExtra(Intent.EXTRA_SUBJECT,asunto);
                    intent.putExtra(Intent.EXTRA_TEXT, content );
                    intent.setType("message/rfc822");
                    startActivity(Intent.createChooser(intent, "Elije un cliente de correo:"));

                }

            }

        });
        miseek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                puntuacionn.setText(String.valueOf(miseek.getProgress()));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });



    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);

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
                Intent intent = new Intent(Contacto.this , MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.MnOp2:
                Intent intent1 = new Intent(Contacto.this , Calculadora.class);
                startActivity(intent1);
                return true;
            case R.id.MnOp3:
                Intent intent2 = new Intent(Contacto.this , Contacto.class);
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