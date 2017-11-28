package adt.linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		int contador = 0;
		while (head.getNext() != null) {
			contador ++;
			head.getNext();
		}
		return contador;
	}

	@Override
	public T search(T element) {
		SingleLinkedListNode<T> elementIt = head.getNext();
		while (elementIt != null) {
			if (elementIt.equals(element)) {
				return element;
			}
			elementIt = head.getNext();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void insert(T element) {
		if (element != null) {
			while (head.getNext() != null) {
				head.getNext();
			}
			head.setNext((SingleLinkedListNode<T>) element);
		}
	}

	@Override
	public void remove(T element) {
		while (head.getNext() != null) {
			if (head.equals(element)) {
				head.setNext(null);
				head.setData(null);
			}
			head.getNext();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		T[] array = (T[]) new Object[this.size()];
		
		SingleLinkedListNode<T> elementTemp = head;
		int indexAtual = 0;
		
		while (indexAtual < this.size()) {
			if(elementTemp != null) {
				array[indexAtual] = (T) elementTemp.getData();
				indexAtual++;
				elementTemp.getNext(); 
				}
			}
		return array;
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
