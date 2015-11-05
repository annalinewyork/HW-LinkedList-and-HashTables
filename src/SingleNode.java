/**
 * Created by c4q-nali on 11/4/15.
 */
public class SingleNode {
    SingleNode next;
    String data;

    public SingleNode(String data) {
        this.data = data;
    }

    class SingleList {
        SingleNode head;

        public void addToHead(String data){
            SingleNode newNode = new SingleNode(data);
            newNode.next = head;
            head = newNode;
        }

        public void addToTail(String data){
            SingleNode newNode = new SingleNode(data);
            SingleNode current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next=newNode;
        }

        public void insertAfter (String prevData, String newData){
            SingleNode current = head;
            while (current != null && !current.data.equals(prevData)){
                current = current.next;
            }
            if(current!=null){
                SingleNode newNode = new SingleNode(newData);
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }
}
