import java.util.ArrayList;

public class Node {

    private char value;
    private ArrayList<Node> children;
    private boolean endpoint;

    public Node(char value, boolean endpoint){
        this.value = value;
        this.endpoint = endpoint;
        this.children = new ArrayList<>();
    }

    public char getValue(){
        return this.value;
    }

    public void addChild(Node n){
        this.children.add(n);
    }

    public Node findChild(char target){
        for (Node n : this.children){
            if (n.value == target){
                return n;
            }
        }
        return null;
    }

}
