package net.madmenyo.triangulation;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.DelaunayTriangulator;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.ShortArray;

import java.util.Arrays;

/**
 * Created by Menyo on 3/7/2015.
 */
public class Graph {

    Edge[] edges;
    Node[] nodes;

    public Graph(Node[] nodes)
    {
        this.nodes = nodes;
        System.out.println("Indices: " + Arrays.toString(getTriangleIndices().toArray()));
        createGraph();
    }

    private ShortArray getTriangleIndices()
    {
        DelaunayTriangulator triangulator = new DelaunayTriangulator();
        float[] points = new float[nodes.length * 2];


        for (int i = 0; i < nodes.length; i++)
        {
            System.arraycopy(nodes[i].getPoints(), 0, points, 2 * i, 2);
        }
        System.out.println("Points: " + Arrays.toString(points));
        return triangulator.computeTriangles(new FloatArray(points), false);
    }

    public void createGraph()
    {

    }

    public Node[] getNodes()
    {
        return nodes;
    }
}
