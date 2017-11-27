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
		int contador = 1;
		SingleLinkedListNode<T> element = head.getNext();
		while (element != null) {
			contador ++;
			element = head.getNext();
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
			SingleLinkedListNode<T> elementIt = head;
			while (elementIt != null) {
				elementIt.getNext();
			}
			head.setNext((SingleLinkedListNode<T>) element);
		}
	}

	@Override
	public void remove(T element) {
		SingleLinkedListNode<T> elementIt = head;
		while (head.getNext() != null) {
			if (head.equals(element)) {
				head.setNext(null);
				head.setData(null);
			}
			head.getNext();
		}
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented!");
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
