package zzz;

public class List {
	ListElement head;
	ListElement tail;

	public void Add(int data) {

		ListElement l = new ListElement();
		l.data = data;

		if (head == null) {
			head = l;
			tail = l;

		} else {
			l.next = head;
			head = l;
		}

	}

	public void AddBack(int data) {
		ListElement l = new ListElement();
		l.data = data;
		;
		if (head == null) {
			head = l;
			tail = l;

		} else {
			tail.next = l;
			tail = l;

		}

	}

	public void delet(int data) {
		if (head == null)
			return;

		if (head == tail) {
			head = null;
			tail = null;
			return;
		}

		if (head.data == data) {
			head = head.next;
			return;
		}

		ListElement t = head;
		while (t.next != null) {
			if (t.next.data == data) {
				if (tail == t.next) {
					tail = t;
				}
				t.next = t.next.next;
				return;
			}
			t = t.next;
		}
	}

	public void printList() {
		ListElement m = head;
		while (m != null) {
			System.out.print(m.data + " | ");
			m = m.next;

		}

	}

}
