package id.co.meilani.okekang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MitraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitra);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
