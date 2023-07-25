package basic_algorithm.sedgewick.symboltable;

/**
 * 순차 탐색(비순차 연결 리스트 기반)
 * @param <Key>
 * @param <Value>
 */
public class SequentialSearchST<Key, Value> {
    private Node first;


    private class Node {
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.val;
            }
        }
        return null;
    }

    public void put(Key key, Value val) {
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
            }
        }
        first = new Node(key, val, first);
    }

    /**
     * TODO : size(),keys(), (성급한 버전) delete() 구현하기
     */
}
