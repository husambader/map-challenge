import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Vertexe implements Comparable<Vertexe>
{
    public final String name;
    public Edge1[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertexe previous;
    public Vertexe(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertexe other)
    {
        return Double.compare(minDistance, other.minDistance);
    }

}


class Edge1
{
    public final Vertexe target;
    public final double weight;
    public Edge1(Vertexe argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}

public class Dijkstra
{
    public static void computePaths(Vertexe source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertexe> vertexQueue = new PriorityQueue<Vertexe>();
    vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
        Vertexe u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge1 e : u.adjacencies)
            {
                Vertexe v = e.target;
                double weight = e.weight;
                double distanceThroughU = u.minDistance + weight;
        if (distanceThroughU < v.minDistance) {
            vertexQueue.remove(v);

            v.minDistance = distanceThroughU ;
            v.previous = u;
            vertexQueue.add(v);
        }
            }
        }
    }

    public static List<Vertexe> getShortestPathTo(Vertexe target)
    {
        List<Vertexe> path = new ArrayList<Vertexe>();
        for (Vertexe vertexe = target; vertexe != null; vertexe = vertexe.previous)
            path.add(vertexe);

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args)
    {
        // mark all the vertices 
        Vertexe A = new Vertexe("A");
        Vertexe B = new Vertexe("B");
        Vertexe D = new Vertexe("D");
        Vertexe F = new Vertexe("F");
        Vertexe K = new Vertexe("K");
        Vertexe J = new Vertexe("J");
        Vertexe M = new Vertexe("M");
        Vertexe O = new Vertexe("O");
        Vertexe P = new Vertexe("P");
        Vertexe R = new Vertexe("R");
        Vertexe Z = new Vertexe("Z");

        // set the edges and weight
        A.adjacencies = new Edge1[]{ new Edge1(M, 8) };
        B.adjacencies = new Edge1[]{ new Edge1(D, 11) };
        D.adjacencies = new Edge1[]{ new Edge1(B, 11) };
        F.adjacencies = new Edge1[]{ new Edge1(K, 23) };
        K.adjacencies = new Edge1[]{ new Edge1(O, 40) };
        J.adjacencies = new Edge1[]{ new Edge1(K, 25) };
        M.adjacencies = new Edge1[]{ new Edge1(R, 8) };
        O.adjacencies = new Edge1[]{ new Edge1(K, 40) };
        P.adjacencies = new Edge1[]{ new Edge1(Z, 18) };
        R.adjacencies = new Edge1[]{ new Edge1(P, 15) };
        Z.adjacencies = new Edge1[]{ new Edge1(P, 18) };


        computePaths(F); // run Dijkstra
        System.out.println("Distance to " + O + ": " + O.minDistance);
        List<Vertexe> path = getShortestPathTo(O);
        System.out.println("Path: " + path);
    }
}