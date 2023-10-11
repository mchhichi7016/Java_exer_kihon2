package java_exer_kihon2.q42;

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public void dispay(){
        System.out.println(value);
    }

  package java_exer_kihon2.q42;

public class Main {
    public static void main(String[] args){
        Node n1 = new Node(5);
        Node n2 = new Node(8);
        Node n3 = new Node(12);
        Node n4 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node now = n1;
        while (now != null){
            now.dispay();
            now = now.next;
        }

    }
}

}
