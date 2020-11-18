/****************************************************************************
 *  Author: Tatenda Usuwana Mapuranga
 *  Purpose: To edit and modify the settings that will be used in the game
 *  Project: City Simulator Game
 *  Date Last modified: 13/11/2020
 ******************************************************************************/

package curtin.edu.citysimulatorgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Settings extends AppCompatActivity
{
    private static int mapWidth = 50;
    private static int mapHeight = 10;
    private static int initialMoney = 1000;
    private String s;
    private String h;
    private String w;
    private String m;
    private String c;
    private String ho;
    private String co;
    private String ro;
    private static String name;
    private int familySize = 4;
    private int shopSize = 6;
    private static int salary = 50;
    private double taxRate = 0.3;
    private int serviceCost = 2;
    private static int houseBuildingCost = 100;
    private static int commBuildingCost = 500;
    private static int roadBuildingCost = 20;
    private EditText width;
    private EditText height;
    private EditText money;
    private EditText sal;
    private EditText cityname;
    private EditText house;
    private EditText comm;
    private EditText road;
    private Button wchange;
    private Button hchange;
    private Button mchange;
    private Button button;
    private Button citychange;
    private Button housechange;
    private Button commchange;
    private Button roadchange;

    public Settings()
    {

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        cityname = findViewById(R.id.name);
        house = findViewById(R.id.editTextNumber2);
        comm = findViewById(R.id.editTextNumber3);
        road = findViewById(R.id.editTextNumber);
        width = findViewById(R.id.width);
        height = findViewById(R.id.height);
        money = findViewById(R.id.money);
        sal = findViewById(R.id.salary);
        wchange = findViewById(R.id.wichange);
        hchange = findViewById(R.id.hechange);
        mchange = findViewById(R.id.mochange);
        housechange = findViewById(R.id.housechange);
        commchange = findViewById(R.id.comchange);
        roadchange = findViewById(R.id.roomchange);
        citychange = findViewById(R.id.button2);
        button = findViewById(R.id.button);

        width.setText("" + getWidth());
        height.setText("" + getHeight());
        money.setText("" + getMoney());
        sal.setText("" + getSalary());
        cityname.setText(getName());
        house.setText("" + getHouseBuildingCost());
        comm.setText("" + getCommBuildingCost());
        road.setText("" + getRoadBuildingCost());

        wchange.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                w = width.getText().toString();
                setWidth(Integer.parseInt(w));
            }
        });

        hchange.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                h = height.getText().toString();
                setHeight(Integer.parseInt(h));
            }
        });

        mchange.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                m = money.getText().toString();
                setMoney(Integer.parseInt(m));
            }
        });

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                s = sal.getText().toString();
                setSalary(Integer.parseInt(s));
            }
        });

        citychange.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                c = cityname.getText().toString();
                setName(c);
            }
        });

        housechange.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ho = house.getText().toString();
                setHouseBuildingCost(Integer.parseInt(ho));
            }
        });

        commchange.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                co = comm.getText().toString();
                setCommBuildingCost(Integer.parseInt(co));
            }
        });

        roadchange.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ro = road.getText().toString();
                setRoadBuildingCost(Integer.parseInt(ro));
            }
        });


    }

    public void setName(String name){this.name = name;}
    public void setWidth(int mapWidth)
    {
        this.mapWidth = mapWidth;
    }

    public void setHeight(int mapHeight)
    {
        this.mapHeight = mapHeight;
    }

    public void setMoney(int money)
    {
        initialMoney = money;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public void setRoadBuildingCost(int road){roadBuildingCost = road;}
    public void setHouseBuildingCost(int house){houseBuildingCost = house;}
    public void setCommBuildingCost(int comm){commBuildingCost = comm;}


    public static int getWidth()
    {
        return mapWidth;
    }

    public static int getHeight()
    {
        return mapHeight;
    }

    public static int getMoney()
    {
        return initialMoney;
    }
    public static String getName(){return name;}

    public int getFamilySize()
    {
        return familySize;
    }

    public int getShopSize()
    {
        return shopSize;
    }

    public static int getSalary()
    {
        return salary;
    }

    public double getTaxRate()
    {
        return taxRate;
    }

    public int getServiceCost()
    {
        return serviceCost;
    }

    public static int getHouseBuildingCost()
    {
        return houseBuildingCost;
    }

    public static int getCommBuildingCost()
    {
        return commBuildingCost;
    }

    public static int getRoadBuildingCost()
    {
        return roadBuildingCost;
    }
}