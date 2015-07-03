package net.madmenyo.triangulation;

import java.lang.reflect.Array;
import java.util.Set;

/**
 * Created by Menyo on 3/7/2015.
 */
public class Edge {
    private Node node1, node2;
    private boolean used;
    private float distance;

    Edge(Node node1, Node node2)
    {
        this.node1 = node1;
        this.node2 = node2;
        distance = setDistance(node1, node2);
    }

    private float setDistance(Node node1, Node node2)
    {
        return node1.getLocation().dst(node2.getLocation());
    }

    public float getDistance()
    {
        return distance;
    }

    /**
     * Set both nodes to visited
     */
    public void setVisited()
    {
        node1.setVisited(true);
        node2.setVisited(true);
    }

    public boolean NodesVisited()
    {
        return (node1.isVisited() & node2.isVisited());
    }

    public void setUsed()
    {
        used = true;
        setVisited();
    }

    public boolean isUsed()
    {
        return used;
    }

    public static Edge getShortEdge(Set<Edge> edges)
    {
        Edge edge = null;
        float minDistance = Float.MAX_VALUE;

        Edge[] temp = edges.toArray(new Edge[edges.size()]);

        for (int i = 0; i < temp.length; i++)
        {
            if ((temp[i].getDistance() < minDistance) &&
                    !edge.NodesVisited() && !edge.isUsed())
            {
                minDistance = temp[i].getDistance();
                edge = temp[i];
            }
        }
        return edge;
    }
}
