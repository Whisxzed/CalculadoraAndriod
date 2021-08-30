 package cl.ceduc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cero =(Button) this.findViewById(R.id.btn_cero);
        Button btn_uno =(Button) this.findViewById(R.id.btn_uno);
        Button btn_dos =(Button) this.findViewById(R.id.btn_dos);
        Button btn_tres =(Button) this.findViewById(R.id.btn_tres);
        Button btn_cuatro =(Button) this.findViewById(R.id.btn_cuatro);
        Button btn_cinco =(Button) this.findViewById(R.id.btn_cinco);
        Button btn_seis =(Button) this.findViewById(R.id.btn_seis);
        Button btn_siete =(Button) this.findViewById(R.id.btn_siete);
        Button btn_ocho =(Button) this.findViewById(R.id.btn_ocho);
        Button btn_nueve =(Button) this.findViewById(R.id.btn_nueve);
        Button btn_igual =(Button) this.findViewById(R.id.btn_igual);
        Button btn_multiplicar =(Button) this.findViewById(R.id.btn_multiplicar);
        Button btn_suma =(Button) this.findViewById(R.id.btn_suma);
        Button btn_resta =(Button) this.findViewById(R.id.btn_resta);
        Button btn_dividir =(Button) this.findViewById(R.id.btn_dividir);
        Button btn_decimal =(Button) this.findViewById(R.id.btn_decimal);
        Button btn_borrar =(Button) this.findViewById(R.id.btn_borrar);
        Button btn_clear =(Button) this.findViewById(R.id.btn_clear);

        TextView txt_pantalla = (TextView) this.findViewById(R.id.txt_pantalla);

        btn_cero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("0");
            }
        });
        btn_uno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("1");
            }
        });
        btn_dos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("2");
            }
        });
        btn_tres.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("3");
            }
        });
        btn_cuatro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("4");
            }
        });
        btn_cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("5");
            }
        });
        btn_seis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("6");
            }
        });
        btn_siete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("7");
            }
        });
        btn_ocho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("8");
            }
        });
        btn_nueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("9");
            }
        });
        btn_suma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("+");
            }
        });
        btn_resta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("-");
            }
        });
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("*");
            }
        });
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("/");
            }
        });
        btn_igual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito("=");
            }
        });
        btn_decimal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setDigito(".");
            }
        });
    }
    void setDigito(String digito){
        TextView txt_pantalla = (TextView) this.findViewById(R.id.txt_pantalla);
        String actual = txt_pantalla.getText().toString();
        String nuevo = actual + digito;
        txt_pantalla.setText(nuevo);
    }
}
