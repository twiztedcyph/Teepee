package com.example.cypher.teepee;

/**
 * Created by Cypher on 20/11/2015.
 */
public class House
{
    private String heading, lineOne, lineTwo, lineThree, lineFour;
    private int imageId;

    public House()
    {

    }

    public House(int imageId, String heading, String lineOne, String lineTwo)
    {
        this.imageId = imageId;
        this.heading = heading;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
    }

    public String getHeading()
    {
        return heading;
    }

    public void setHeading(String heading)
    {
        this.heading = heading;
    }

    public String getLineOne()
    {
        return lineOne;
    }

    public void setLineOne(String lineOne)
    {
        this.lineOne = lineOne;
    }

    public String getLineTwo()
    {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo)
    {
        this.lineTwo = lineTwo;
    }

    public String getLineThree()
    {
        return lineThree;
    }

    public void setLineThree(String lineThree)
    {
        this.lineThree = lineThree;
    }

    public String getLineFour()
    {
        return lineFour;
    }

    public void setLineFour(String lineFour)
    {
        this.lineFour = lineFour;
    }

    public int getImageId()
    {
        return imageId;
    }

    public void setImageId(int imageId)
    {
        this.imageId = imageId;
    }
}
