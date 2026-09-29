import java.util.*;
public class Graph{
    ArrayList<Node> nodes;
    int [][]matrix;
    Graph(int size){
        matrix=new int[size][size];
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src,int dst){//src=row dst=col
        matrix[src][dst]=1;
    }
    public boolean checkEdge(int src,int dst){
        if(matrix[src][dst]==1)
            return true;
        return false;
    }
    public void print(){
        System.out.println("  ");
        for(Node node:nodes){
            System.out.println(node.data+" ");
        }
        System.out.println();
        for(int i=0;i<matrix.length;i++){
            System.out.println(nodes.get(i).data+" ");
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}