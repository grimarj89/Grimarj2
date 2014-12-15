package grimarjco.gustavo.grimarj2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Gustavo Ramón Ibarra Maciel on 17/11/2014.
 */
public class HelloBrodcastREceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Brodcast receiver","Power is connected");
    }
}
