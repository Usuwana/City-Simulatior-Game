/****************************************************************************
 *  Author: Tatenda Usuwana Mapuranga
 *  Purpose: Determines the weather conditions of the city
 *  Project: City Simulator Game
 *  Date Last modified: 13/11/2020
 ******************************************************************************/

package curtin.edu.citysimulatorgame;

public class Weather {

    private int weather;

    public Weather()
    {

    }

    public void setWeather()
    {
        weather = (int)((Math.random() * ((35 - 25) + 1)) + 25);
    }

    public double getWeather()
    {
        return weather;
    }
}
