package org.x3codes.databindingapp;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ClickHandler {

    Context context;

    public ClickHandler(Context context) {
        this.context = context;
    }

    public void onButton1Clicked(View view) {
        Toast.makeText(context, "Button 1 Clicked", Toast.LENGTH_SHORT).show();
    }
}
