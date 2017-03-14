package movil.unicauca.ejemplocheckbox;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //boolean CBRed, CBGreen, CBBlue = false;

    ImageView imprimircolor;
    CheckBox CBRed, CBGreen, CBBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);


        CBRed = (CheckBox) findViewById(R.id.CBRed);
        CBGreen = (CheckBox) findViewById(R.id.CBGreen);
        CBBlue = (CheckBox) findViewById(R.id.CBBlue);
        imprimircolor = (ImageView) findViewById(R.id.imprimircolor);


        //Eventos
        CBRed.setOnClickListener(this);
        CBGreen.setOnClickListener(this);
        CBBlue.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            imprimircolor.setBackgroundColor(Color.BLACK);
            if (CBRed.isChecked()) imprimircolor.setBackgroundColor(Color.RED);
            else imprimircolor.setBackgroundColor(Color.BLACK);
            if (CBGreen.isChecked()) imprimircolor.setBackgroundColor(Color.GREEN);
            if (CBBlue.isChecked()) imprimircolor.setBackgroundColor(Color.BLUE);
            if ((CBRed.isChecked()) && (CBBlue.isChecked())) imprimircolor.setBackgroundColor(Color.MAGENTA);
            if ((CBRed.isChecked()) && (CBGreen.isChecked())) imprimircolor.setBackgroundColor(Color.YELLOW);
            if ((CBGreen.isChecked()) && (CBBlue.isChecked())) imprimircolor.setBackgroundColor(Color.CYAN);
            if ((CBRed.isChecked()) && (CBGreen.isChecked()) && (CBBlue.isChecked())) imprimircolor.setBackgroundColor(Color.WHITE);

    }



}
