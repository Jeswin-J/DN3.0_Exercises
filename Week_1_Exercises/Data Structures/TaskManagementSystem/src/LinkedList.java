import java.util.Objects;

public class LinkedList {
    Node head;
    int size;

    public void addNode(Task data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else{
            Node cursor = head;

            while (cursor.getNext() != null){
                cursor = cursor.getNext();
            }
            cursor.setNext(newNode);
        }

        size++;
    }

    public Task searchTask(String taskId){
        Node cursor = head;

        while (cursor.getNext() != null){
            if (Objects.equals(cursor.getData().getTaskId(), taskId)){
                break;
            } else{
                cursor = cursor.getNext();
            }
        }

        return cursor.getData();
    }

    public void traverseList(){
        Node cursor = head;

        while(cursor.getNext() != null){
            System.out.println(cursor.getData());
            cursor = cursor.getNext();
        }
        System.out.println(cursor.getData());

    }

    public void deleteTask(LinkedList ll, String taskId){
        Task toDelete = searchTask(taskId);
        Node cursor = ll.head;
        Node previous = cursor;

        if (toDelete == ll.head.getData()){
            ll.head = ll.head.getNext();
            size--;
            return;
        }

        while(cursor.getNext() != null){
            if(cursor.getData() == toDelete){
                previous.setNext(cursor.getNext());
                size--;
                return;
            }
            previous = cursor;
            cursor = cursor.getNext();
        }

    }
}
