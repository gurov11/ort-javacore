package zzz;

public class List {
	private List head;
	private List tail;
	private int data;
	private List next;

	public void Add(int data) {
		List m = new List();
		m.data = data;
		if (head == null) {
			head = m;
			tail = m;

		} else {
			m.next = head;
			head = m;
		}

	}

	public void AddBack(int data) {
		List m = new List();
		m.data = data;
		if (head == null) {
			head = m;
			tail = m;

		} else {
			tail.next = m;
			tail = m;

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

		List t = head;
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
		List m = head;
		while (m != null) {
			System.out.print(m.data + " | ");
			m = m.next;

		}

	}

}
