package datastructuredoublylinkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoublyLinkedList<R> implements List<R> {

	private Node<R> head = null;
	private Node<R> tail = null;
	private int size = 0;

	public int size() {
		return size;
	}

	public void clear() {
		size = 0;
		head = null;
		tail = null;
	}

	@Override
	public boolean contains(Object o) {
		Node<R> node = head;
		if (node.value == o || tail.value == o)
			return true;
		for (int i = 0; i < size - 1; i++) {
			node = head.next;
			if (node.value == o) {
				return true;
			}
		}

		return false;
	}
	
	@Override
	public boolean add(R e) {
		Node<R> node = new Node<R>(e);

		if (size == 0) {
			head = tail = node;
			size++;
			return true;
		} else {
			tail.next = node;
			tail = node;
			size++;
			return true;
		}
	}
	
	@Override
	public R remove(int index) {

		if (index < 0) {
			throw new IndexOutOfBoundsException();
		} else if (index > size) {
			throw new IndexOutOfBoundsException();
		} else {
			Node<R> node = head.next;

			if (index == 0) {
				head = head.next;
				size--;
				return node.value;
			} else if (index == 1) {
				head.next = node.next;
				size--;
				return node.value;
			} else {

				for (int i = 1; i < index; i++) {
					node = head.next;

				}
				node.prev.next = node.next;
				node.next.prev = node.prev;

				return node.value;
			}
		}
	}
	
	@Override
	public void add(int index, R element) {
		Node<R> node = new Node<R>(element);
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		} else if (index > size) {
			throw new IndexOutOfBoundsException();
		} else {
			if (size == 0) {
				head = tail = node;
				size++;
			} else if (size < index) {
				tail.next = node;
				tail = node;
				size++;
			} else if (size > index) {
				Node<R> prev = head;

				for (int i = 0; i < index; i++) {
					prev = prev.next;
				}
				node.next = prev.next;
				node.prev = prev;
				prev.next = node;
				size++;
			}
		}
	}

	@Override
	public R set(int index, R element) {
		Node<R> node = new Node<R>(element);
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		} else if (index > size) {
			throw new IndexOutOfBoundsException();
		} else {
			if (size == 0) {
				head = tail = node;
				size++;
				return node.value;
			} else if (size < index) {
				tail.next = node;
				tail = node;
				size++;
				return node.value;
			} else {
				Node<R> prev = head;

				for (int i = 0; i < index; i++) {
					prev = prev.next;
				}

				if (prev.next != null) {
					node.next = prev.next;
				}
				node.prev = prev.prev;
				prev.next = node;
				return prev.value;
			}
		}
	}
	
	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	/**Nested Node class */

	class Node<E> {
		private E value;
		private Node<E> next;
		private Node<E> prev;

		private Node(E value) {
			this.value = value;
		}

		private Node(Node<E> next, Node<E> prev) {
			this.next = next;
			this.prev = prev;

		}

		private Node(E value, Node<E> next, Node<E> prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}

	}

	/**DLLIterator class */
	class DLLIterator implements Iterator<R> {

		private DLLIterator() {

		}

		@Override
		public boolean hasNext() {
			int index = 0;

			return false;
		}

		@Override
		public R next() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	
	@Override
	public boolean addAll(Collection<? extends R> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends R> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public R get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<R> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<R> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<R> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<R> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
