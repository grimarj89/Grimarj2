package grimarjco.gustavo.grimarj2;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import adapters.CustomAdapter;
import modelos.TestModel;


public class PrincipalActivity extends Activity implements OnClickListener{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button){
            crearD();
        }

    }

    public void crearD(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        View view = getLayoutInflater().inflate(R.layout.list_layou_test,null);

        ListView listView = (ListView) view.findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.custom_row_test,getArray());

        listView.setAdapter(customAdapter);

        builder.setPositiveButton("Cerrar",null).setView(view);
        builder.create().show();
    }


    private ArrayList<TestModel> getArray(){
        ArrayList<TestModel> arrayList = new ArrayList<TestModel>();

        for (int x=0; x<=10;x++){
            final TestModel testModel = new TestModel();
            testModel.setMarca("Marca "+x);
            testModel.setProducto("Producto "+x);
            testModel.setCantidad(x+3);
            testModel.setFecha(x+"-11-2014");
            testModel.setStatus("enviado");
            arrayList.add(testModel);
        }


        return arrayList;
    }
}
