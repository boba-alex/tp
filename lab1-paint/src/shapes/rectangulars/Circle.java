package shapes.rectangulars;


import java.awt.*;

public class Circle extends Ellipse
{
    public Circle(Point theCenter, Point cornerPoint, int frameWidth, Color frameColor, Color fillColor)
    {
        super(theCenter,cornerPoint, frameWidth, frameColor, fillColor);
    }

    @Override
    protected void correctCornerPoint(Point theCenter)
    {
        super.correctCornerPoint(theCenter);
        Point cornerPoint = getCornerPoint();
        cornerPoint.setLocation(cornerPoint.x,theCenter.y-theCenter.x+cornerPoint.x);
    }



}