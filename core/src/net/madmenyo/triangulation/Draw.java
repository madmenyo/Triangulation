package net.madmenyo.triangulation;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Menyo on 3/7/2015.
 */
public class Draw {

    private static ShapeRenderer sr = new ShapeRenderer();

    public static void Point(Vector2 position, Matrix4 projectionMatrix)
    {
        sr.setProjectionMatrix(projectionMatrix);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(Color.WHITE);
        sr.circle(position.x, position.y, 10);
        sr.end();
    }



    public static void Point(Vector2 position, Matrix4 projectionMatrix, int size)
    {
        sr.setProjectionMatrix(projectionMatrix);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(Color.WHITE);
        sr.circle(position.x, position.y, size);
        sr.end();
    }



    public static void Point(Vector2 position, Matrix4 projectionMatrix, Color color)
    {
        sr.setProjectionMatrix(projectionMatrix);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(color);
        sr.circle(position.x, position.y, 10);
        sr.end();
    }

    public static void Point(Vector2 position, Matrix4 projectionMatrix, int size, Color color)
    {
        sr.setProjectionMatrix(projectionMatrix);
        sr.begin(ShapeRenderer.ShapeType.Filled);
        sr.setColor(color);
        sr.circle(position.x, position.y, size);
        sr.end();
    }

    public static void Line(Vector2 start, Vector2 end, Matrix4 projectionMatrix)
    {
        Gdx.gl.glLineWidth(2);
        sr.setProjectionMatrix(projectionMatrix);
        sr.begin(ShapeRenderer.ShapeType.Line);
        sr.setColor(Color.WHITE);
        sr.line(start, end);
        sr.end();
        Gdx.gl.glLineWidth(1);
    }

    public static void Line(Vector2 start, Vector2 end, Matrix4 projectionMatrix, Color color, int width)
    {
        Gdx.gl.glLineWidth(width);
        sr.setProjectionMatrix(projectionMatrix);
        sr.begin(ShapeRenderer.ShapeType.Line);
        sr.setColor(color);
        sr.line(start, end);
        sr.end();
        Gdx.gl.glLineWidth(1);
    }
}
