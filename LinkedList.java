class List<T> {
    private T elmt;
    private List<T> next;

    public List() {
        this.elmt = null;
        this.next = null;
    }

    public List(T elmt) {
        this.elmt = elmt;
        this.next = null;
    }

    public List(List<T> elmt) {
        this.elmt = elmt.getElmt();
        this.next = elmt.getNext();
    }

    public void setElmt(T elmt) {
        this.elmt = elmt;
    }

    public void setNext(List<T> elmt) {
        this.next = elmt;
    }

    public T getElmt() {
        return this.elmt;
    }

    public List<T> getNext() {
        return this.next;
    }
}

public class LinkedList<T> extends List<T> {
    private List<T> firstList;
    private List<T> lastList;

    public LinkedList() {
        firstList = new List<T>();
        lastList = new List<T>();
    }

     public static void main(String args[]) {
         LinkedList<Coins> linkedList = new LinkedList<Coins>();
         Snail snail = new Snail();
         Guppy guppy = new Guppy();
         Guppy guppy2 = new Guppy();
         Coins coin = new Coins(0,0,100);
         linkedList.add(coin);
         linkedList.add(coin);
//         linkedList.add(snail);
//         linkedList.add(snail);
         linkedList.remove(coin);
         linkedList.remove(coin);
         System.out.println(linkedList.getIdx());
     }

    public int find(T elmt) {
        int idx = 0;
        List<T> temp = firstList;

        if (!isEmpty()) {
            do {
                if (temp.getElmt().equals(elmt)) {
                    return idx;
                }
                temp = temp.getNext();
                idx++;
            } while (temp != null);
        }

        return -1;
    }

    public boolean isEmpty() {
        return (firstList.getElmt() == null);
    }

    public void add(T elmt) {
        if (isEmpty()) {
            firstList.setElmt(elmt);
            lastList = firstList;
        } else {
            lastList.setNext(new List<T>(elmt));
            lastList = lastList.getNext();
        }
    }

    public void remove(T elmt) {
        int idx = find(elmt);
        List<T> temp = firstList;
        if (idx != -1) {
            if (getIdx() == 1) {
                firstList.setElmt(null);
                lastList.setElmt(null);
            } else if (idx == 0) {
                firstList = firstList.getNext();
            } else if (idx == getIdx() - 1) {
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.getNext();
                }
                temp.setNext(null);
                lastList.setNext(temp);
            } else {
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.getNext();
                }
                temp.setNext((temp.getNext()).getNext());
            }
        }
    }
//    public void remove(T element) {
//    	int idx = find(element);
//    	List<T> p = firstList;
//    	if (element == firstList.getElmt()) {
//    		firstList = p.getNext();
//    		p = null;
//    	} else if (element == lastList.getElmt()) {
//    		for(int i = 0; i < idx - 1; ++i) {
//    			p = p.getNext();
//    		}
//    		p.setNext(null);
//    		lastList = p;
//    	} else if (firstList == lastList) {
//    		p = null;
//    		firstList = null;
//    		lastList = null;
//    	} else {
//    		for (int i = 0; i < idx - 1; ++i) {
//    			p = p.getNext();
//    		}
//    		p.setNext(null);
//    		p.setNext(p.getNext().getNext());
//    	}
//    }

    public T get(int idx) {
        List<T> temp = firstList;
        for (int i = 0; i < idx; i++) {
            temp = temp.getNext();
        }
        return temp.getElmt();
    }

    public int getIdx() {
    	List<T> p = firstList;
        int idx = 0;
        while(p != null){
            idx++;
            p = p.getNext();
        }
        return idx;
    }
}