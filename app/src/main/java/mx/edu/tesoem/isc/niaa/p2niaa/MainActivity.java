package mx.edu.tesoem.isc.niaa.p2niaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSig = (Button) findViewById(R.id.btnSig1);

        btnSig.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent frm2=new Intent(this, Frm2Activity.class);
        startActivity(frm2);
        finish();
    }
}
