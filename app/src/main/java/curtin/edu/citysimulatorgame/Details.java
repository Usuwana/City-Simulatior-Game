/****************************************************************************
 *  Author: Tatenda Usuwana Mapuranga
 *  Purpose: Shows the details of the grid layout
 *  Project: City Simulator Game
 *  Date Last modified: 13/11/2020
 ******************************************************************************/
package curtin.edu.citysimulatorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    MapScreen map = new MapScreen();
    private GridLayout grid;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //grid = view.findViewById(R.id.GridLayout2);
        text = findViewById(R.id.textView13);

        text.setText("Houses: 3" +  "\n Commercial: 5" + "\n Roads: 15\n Trees: 4\n Grid Number: 65");


    }
}