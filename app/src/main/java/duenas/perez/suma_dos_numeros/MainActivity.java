package duenas.perez.suma_dos_numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText num1, num2;
Button btnsuma;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.et1);
        num2=(EditText)findViewById(R.id.et2);
        res=(TextView)findViewById(R.id.resultado);
        btnsuma=(Button)findViewById(R.id.btn1);
        btnsuma.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    int val1 = Integer.parseInt(num1.getText().toString());
    int val2 = Integer.parseInt(num2.getText().toString());
    int s = val1 + val2;
        res.setText(s+"");
    }
}
