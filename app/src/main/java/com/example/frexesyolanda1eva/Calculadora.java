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
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    TextView txtresultado;
    double numerouno = 0.0;
    double numerodos = 0.0;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadoraa);
        Button mas = (Button) findViewById(R.id.botonmas);
        Button igual = (Button) findViewById(R.id.botonigual);
        txtresultado = findViewById(R.id.resultaocalculadora);
        Button entre = (Button) findViewById(R.id.botonbarra);
        Button por = (Button) findViewById(R.id.botonPOR);
        Button menos = (Button) findViewById(R.id.botonmenos);
        Button botoncuadrado = (Button) findViewById(R.id.cuadrado);
        botoncuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = (String) txtresultado.getText().toString();
                igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String resultadoo = "";
                        double num1 = Double.parseDouble(n1);
                        double cuadradoo = 0.0;
                        cuadradoo = Math.pow(num1 , 2);
                        resultadoo = String.valueOf(cuadradoo);
                        txtresultado.setText(resultadoo);


                    }
                });
            }
        });
        por.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = (String) txtresultado.getText().toString();
                String cero = "0";
                txtresultado.setText(cero);
                igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String n2 = (String) txtresultado.getText().toString();
                        String resultadoo = "";
                        double por = 0.0;
                        double num1 = Double.parseDouble(n1);
                        double num2 = Double.parseDouble(n2);
                        por = num1 * num2;
                        resultadoo = String.valueOf(por);
                        txtresultado.setText(resultadoo);

                    }


                });
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = (String) txtresultado.getText().toString();
                String cero = "0";
                txtresultado.setText(cero);
                igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String n2 = (String) txtresultado.getText().toString();
                        String resultadoo = "";
                        double menos = 0.0;
                        double num1 = Double.parseDouble(n1);
                        double num2 = Double.parseDouble(n2);
                        menos = num1 - num2;
                        resultadoo = String.valueOf(menos);
                        txtresultado.setText(resultadoo);
                    }

                });
            }
        });
        entre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = (String) txtresultado.getText().toString();
                String cero = "0";
                txtresultado.setText(cero);
                igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String n2 = (String) txtresultado.getText().toString();
                        String resultadoo = "";
                        double entre = 0.0;
                        double num1 = Double.parseDouble(n1);
                        double num2 = Double.parseDouble(n2);
                        entre = num1 / num2;
                        resultadoo = String.valueOf(entre);
                        if (num2 == 0.0) {
                            Toast.makeText(Calculadora.this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
                        } else {
                            txtresultado.setText(resultadoo);
                        }


                    }
                });


            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = (String) txtresultado.getText().toString();
                String cero = "0";
                txtresultado.setText(cero);
                igual.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String n2 = (String) txtresultado.getText().toString();
                        String resultadoo = "";
                        double suma = 0.0;
                        double num1 = Double.parseDouble(n1);
                        double num2 = Double.parseDouble(n2);
                        suma = num1 + num2;
                        resultadoo = String.valueOf(suma);
                        txtresultado.setText(resultadoo);


                    }
                });

            }
        });
    }

    public void Escribirsiete(View view) {
        if (txtresultado.getText().toString().contains(".")) {
            txtresultado.setText(txtresultado.getText() + "7");
            numerouno = Double.parseDouble(txtresultado.getText().toString());
        } else {
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            if (numerouno == 0.0) {
                txtresultado.setText("7");
            } else {
                txtresultado.setText(txtresultado.getText() + "7");
            }
        }
    }

    public void Escribirtres(View view) {
        if (txtresultado.getText().toString().contains(".")) {
            txtresultado.setText(txtresultado.getText() + "3");
            numerouno = Double.parseDouble(txtresultado.getText().toString());
        } else {
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            if (numerouno == 0.0) {
                txtresultado.setText("3");
            } else {
                txtresultado.setText(txtresultado.getText() + "3");
            }
        }
    }

    public void Escribircero(View view) {
        if (txtresultado.getText().toString().contains(".")) {
            txtresultado.setText(txtresultado.getText() + "0");
            numerouno = Double.parseDouble(txtresultado.getText().toString());
        } else {
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            if (numerouno == 0.0) {
                txtresultado.setText("0");
            } else {
                txtresultado.setText(txtresultado.getText() + "0");
            }
        }
    }

    public void Escribirdos(View view) {
        if (txtresultado.getText().toString().contains(".")) {
            txtresultado.setText(txtresultado.getText() + "2");
            numerouno = Double.parseDouble(txtresultado.getText().toString());
        } else {
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            if (numerouno == 0.0) {
                txtresultado.setText("2");
            } else {
                txtresultado.setText(txtresultado.getText() + "2");
            }
        }
    }

    public void Escribirseis(View view) {
        if (txtresultado.getText().toString().contains(".")) {
            txtresultado.setText(txtresultado.getText() + "6");
            numerouno = Double.parseDouble(txtresultado.getText().toString());
        } else {
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            if (numerouno == 0.0) {
                txtresultado.setText("6");
            } else {
                txtresultado.setText(txtresultado.getText() + "6");
            }
        }
    }

    public void Escribircinco(View view) {
        if (txtresultado.getText().toString().contains(".")) {
            txtresultado.setText(txtresultado.getText() + "5");
            numerouno = Double.parseDouble(txtresultado.getText().toString());
        } else {
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            if (numerouno == 0.0) {
                txtresultado.setText("5");
            } else {
                txtresultado.setText(txtresultado.getText() + "5");
            }
        }
    }

    public void Escribircuatro(View view) {
        if (txtresultado.getText().toString().contains(".")) {
            txtresultado.setText(txtresultado.getText() + "4");
            numerouno = Double.parseDouble(txtresultado.getText().toString());
        } else {
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            if (numerouno == 0.0) {
                txtresultado.setText("4");
            } else {
                txtresultado.setText(txtresultado.getText() + "4");
            }
        }
    }

        public void Escribirocho (View view){
            if (txtresultado.getText().toString().contains(".")) {
                txtresultado.setText(txtresultado.getText() + "8");
                numerouno = Double.parseDouble(txtresultado.getText().toString());
            } else {
                numerouno = Double.parseDouble(txtresultado.getText().toString());
                if (numerouno == 0.0) {
                    txtresultado.setText("8");
                } else {
                    txtresultado.setText(txtresultado.getText() + "8");
                }
            }
        }


        public void Escribirnueve (View view){
            if (txtresultado.getText().toString().contains(".")) {
                txtresultado.setText(txtresultado.getText() + "9");
                numerouno = Double.parseDouble(txtresultado.getText().toString());
            } else {
                numerouno = Double.parseDouble(txtresultado.getText().toString());
                if (numerouno == 0.0) {
                    txtresultado.setText("9");
                } else {
                    txtresultado.setText(txtresultado.getText() + "9");
                }
            }
        }

        public void Escribiruno (View view){
            if (txtresultado.getText().toString().contains(".")) {
                txtresultado.setText(txtresultado.getText() + "1");
                numerouno = Double.parseDouble(txtresultado.getText().toString());
            } else {
                numerouno = Double.parseDouble(txtresultado.getText().toString());
                if (numerouno == 0.0) {
                    txtresultado.setText("1");
                } else {
                    txtresultado.setText(txtresultado.getText() + "1");
                }
            }
        }

        public void Escribirpunto (View view){
            numerouno = Double.parseDouble(txtresultado.getText().toString());
            String n1 = (String) txtresultado.getText().toString();
            if (n1.contains(".")) {
                Toast.makeText(this, "SOLO SE PUEDE PONER UN PUNTO", Toast.LENGTH_LONG).show();
            } else {
                txtresultado.setText(txtresultado.getText() + ".");

            }

        }

        public void Limpiar (View view){
            txtresultado.setText("0");
            numerouno = 0.0;
            numerodos = 0.0;
            operacion = "";
        }


        public void operacioninvertir (View view){
            String cadena = txtresultado.getText().toString();
            String cadenaInvertida = "";
            for (int x = cadena.length() - 1; x >= 0; x--)
                cadenaInvertida = cadenaInvertida + cadena.charAt(x);
            txtresultado.setText(cadenaInvertida);
        }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu, menu);

            return true;
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String mensaje = "";
        switch (item.getItemId()){
            case R.id.MnOp1:
                Intent intent = new Intent(Calculadora.this , MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.MnOp2:
                Intent intent1 = new Intent(Calculadora.this , Calculadora.class);
                startActivity(intent1);
                return true;
            case R.id.MnOp3:
                Intent intent2 = new Intent(Calculadora.this , Contacto.class);
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
        public void onCreateContextMenu (ContextMenu menu, View view, ContextMenu.ContextMenuInfo
        menuInfo){
            super.onCreateContextMenu(menu, view, menuInfo);
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu, menu);


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


