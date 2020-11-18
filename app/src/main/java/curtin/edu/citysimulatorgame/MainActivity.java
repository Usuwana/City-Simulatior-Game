/****************************************************************************
 *  Author: Tatenda Usuwana Mapuranga
 *  Purpose: The first screen shown when opening the application. From here the user can start the game or go and modify the settings
 *  Project: City Simulator Game
 *  Date Last modified: 13/11/2020
 ******************************************************************************/

package curtin.edu.citysimulatorgame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button settings;
    private Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settings = findViewById(R.id.settings);
        map = findViewById(R.id.map);

        settings.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, Settings.class));
            }
        });

        map.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, MapScreen.class));
            }
        });
    }
}