package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import grimarjco.gustavo.grimarj2.R;
import modelos.TestModel;


/**
 * Created by Gustavo Ramón Ibarra Maciel on 29/09/2014.
 */
public class CustomAdapter extends ArrayAdapter<TestModel> {

    Context context;
    ArrayList<TestModel> datos;
    LayoutInflater layoutInflater;


    private static class ViewHolder{
        TextView textViewMarca;
        TextView textViewProducto;
        TextView textViewCatidad;
        TextView textViewStatus;
        TextView textViewFecha;
    }


    public CustomAdapter(Context context, int resource, ArrayList<TestModel> objects) {
        super(context, resource, objects);

        this.context = context;
        this.datos = objects;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        TestModel md = datos.get(position);
        ViewHolder viewHolder;

        if(row == null){

            row = layoutInflater.inflate(R.layout.custom_row_test,null);
            viewHolder = new ViewHolder();

            viewHolder.textViewMarca = (TextView) row.findViewById(R.id.textViewMarca);
            viewHolder.textViewProducto = (TextView) row.findViewById(R.id.textViewProducto);
            viewHolder.textViewCatidad = (TextView) row.findViewById(R.id.textViewCantidad);
            viewHolder.textViewFecha = (TextView) row.findViewById(R.id.textViewFecha);
            viewHolder.textViewStatus = (TextView) row.findViewById(R.id.textViewStatus);

            row.setTag(viewHolder);


        }else {
            viewHolder = (ViewHolder) row.getTag();
        }

        viewHolder.textViewMarca.setText(md.getMarca());
        viewHolder.textViewProducto.setText(md.getProducto());
        viewHolder.textViewCatidad.setText(String.valueOf(md.getCantidad()));
        viewHolder.textViewFecha.setText(md.getFecha());
        viewHolder.textViewStatus.setText(md.getStatus());

        return row;
    }
}
