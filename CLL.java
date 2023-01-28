public class CLL {
    
        private Node head;
        private Node tail;
    
        public void insert(int value) {
            Node node = new Node(value);
            if (head == null) {
                head = node;
                tail = head;
                return;
            }
            node.next = head;
            tail.next = node;
            tail = node;
    
        }
    
        public void display() {
            Node node = head;
            if (head != null) {
                do {
                    System.out.print(node.val + "->");
                    node = node.next;
    
                } while (node != head);
            }
            System.out.println("End");
        }
    
        public void delete(int val) {
            Node node = head;
            if (node == null) {
                return;
            }
            if (node.val == val) {
                head.next = head;
                tail.next = head;
                return;
            }
    
            do {
                Node n = node.next;
                if (n.val == val) {
                    node.next = n.next;
                    break;
                }
                node = node.next;
            } while (node != head);
    
        }
    
        private class Node {
            private int val;
            private Node next;
    
            public Node(int val) {
                this.val = val;
            }
        }
    
    }
    
    

