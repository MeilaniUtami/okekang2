package id.co.meilani.okekang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    private GridView gvNamaJasa;
    String[] jasa = {"AC","LISTRIK","ELEKTRONIK","BATU&KERAMIK",
                    "CAT","LEDENG","KUSEN","LAS","ATAP","BANGUNAN&RENOVASI","KEBUN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initView();

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,jasa);
        gvNamaJasa.setAdapter(adapter);
        gvNamaJasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MenuActivity.this,"Jasa Terpilih " + jasa [position], Toast.LENGTH_SHORT).show();

                }
        });
    }

    private void initView() {gvNamaJasa = (GridView) findViewById(R.id.gvNamaJasa); }
}
