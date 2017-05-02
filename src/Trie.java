


public class Trie {

    Node root;

    public Trie(){
        root = new Node(' ', false);
    }

    public void addWord(String word){
        char[] chars = word.toCharArray();

        Node current = root;

        for (char c : chars){
            Node child = current.findChild(c);
            if (child == null){
                Node next = new Node(c, false);
                current.addChild(next);
                current = next;
            } else {
                current = child;
            }
        }
        current.setEndpoint(true);
    }

    public void findWord(String word){
        char[] chars = word.toCharArray();

        for (Node n : root.getChildren()){
            if (n.getValue() == )
        }

    }

}
