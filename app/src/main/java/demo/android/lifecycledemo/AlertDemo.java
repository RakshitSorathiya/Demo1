package demo.android.lifecycledemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by ln-149 on 19/1/17.
 */

public class AlertDemo extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                // Set Dialog Icon
                .setIcon(R.drawable.androidhappy)
                // Set Dialog Title
                .setTitle("Alert DialogFragment")
                // Set Dialog Message
                .setMessage("Alert DialogFragment")

                // Positive button
                .setPositiveButton("Back to activity", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getActivity(),MainActivity.class));
                        // Do something else
                    }
                })

                // Negative Button
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,	int which) {
                        // Do something else

                    }
                }).create();
    }

}
