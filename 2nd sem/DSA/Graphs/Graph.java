package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
    
    public void print() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String ver1, String ver2) {
        if (adjList.get(ver1) != null && adjList.get(ver2) != null) {   
            adjList.get(ver1).add(ver2);
            adjList.get(ver2).add(ver1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String ver1, String ver2) {
        if (adjList.get(ver2) != null && adjList.get(ver1) != null) {
            adjList.get(ver1).remove(ver2);
            adjList.get(ver2).remove(ver1);
        }
        return false;
    }

    public boolean removeVertex(String ver) {
        if (adjList.get(ver) == null) return false;
        for (String otherver : adjList.get(ver)) {
            adjList.get(otherver).remove(ver);
        }
        adjList.remove(ver);
        return true;
    }
}
