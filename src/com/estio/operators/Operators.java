package com.estio.operators;

public class Operators
{
    public enum Options
    {
        COLD,
        HOT,
        WINDY
    }

    public static void main(String[] args)
    {
        String name = "Idris";

        // if name size is longer than 5, then it's long
        String nameSize =  name.length() > 4 ? "Long" : "Short";

        System.out.println("The name is " + nameSize);

        // make one to check the number of calories in a cake.
        // Over 250 is a lot of calories
        Operators myOperators = new Operators();
        myOperators.weather();

    }

    public String weatherInfo(int weather)
    {
        // case to return a message pending on value
        return "";
    }

    public static int test(int x)
    {
        return x > 4 ? 5 : 8;
    }

    public int testNumber()
    {
        return 5;
    }

    public void weather()
    {
        String currentWeather = "Bright";

        switch(currentWeather)
        {
            case "Bright": {
                System.out.println("The sun is shining");
            }
            break;
            case "Spitting":
                System.out.println("It's actually raining");
                break;
            default:
                System.out.println("It might just be mild");
                break;
        }
    }

    public void EnumSwitch()
    {
        Options myOption = Options.COLD;

        switch (myOption)
        {
            case HOT:
            {
                System.out.println("It's sunny");
            }
            break;
            case COLD:
            {
                System.out.println("It's cold");
            }
            break;
            case WINDY:
            {
                System.out.println("Really Windy");
            }
            break;
            default:
                System.out.println("Just normal Weather");
            break;
        }
    }



}
