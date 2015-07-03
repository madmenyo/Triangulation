package net.madmenyo.triangulation;

import com.badlogic.gdx.math.Vector2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Menyo on 3/7/2015.
 */
public class Node {
    private Vector2 location;
    private boolean visited;
    private Set<Edge> edges;

    public Node(Vector2 location)
    {
        this.location = location;
        this.visited = false;
        edges = new HashSet<Edge>();
    }

    public Vector2 getLocation()
    {
        return location;
    }

    public float[] getPoints()
    {
        return new float[] { location.x, location.y };
    }

    public boolean isVisited()
    {
        return visited;
    }

    public void setVisited(boolean visited)
    {
        this.visited = visited;
    }

    public Set<Edge> getEdges()
    {
        return edges;
    }

    public void addEdge(Edge edge)
    {
        edges.add(edge);
    }



}
