package adt.linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements
		DoubleLinkedList<T> {

	protected DoubleLinkedListNode<T> last;

	@SuppressWarnings("unchecked")
	@Override
	public void insertFirst(T element) {
		DoubleLinkedListNode<T> elementIt =  (DoubleLinkedListNode<T>) element ;
		if (this.size() == 0) {
			last = elementIt;
		} else {
			last.setNext(last.getPrevious());
			last.setPrevious(elementIt);
			head = elementIt;
		}
	}

	@Override
	public void removeFirst() {
		last = (DoubleLinkedListNode<T>) last.next;
		head = last;
	}

	@Override
	public void removeLast() {
		while (last.getNext() != null) {
			last.getNext();
		}
		last = null;
	}

	public DoubleLinkedListNode<T> getLast() {
		return last;
	}

	public void setLast(DoubleLinkedListNode<T> last) {
		this.last = last;
	}

}
