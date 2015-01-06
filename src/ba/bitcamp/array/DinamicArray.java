package ba.bitcamp.array;

public class DinamicArray {

	private int[] array;
	private int count;
	final int INIT_SIZE = 3;

	public DinamicArray(int size) {

		this.array = new int[size];
		count = 0;

	}

	public DinamicArray() {

		this.array = new int[INIT_SIZE];
		count = 0;

	}

	public int getSize() {

		return count;
	}

	public void add(int newElement) {
		if (array.length == count) {
			resize();

		}

		array[count] = newElement;
		count++;
	}

	private void resize() {

		int[] arrrray = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			arrrray[i] = array[i];

		}

		array = arrrray;
	}

	public int getAt(int index) {

		if (index < 0 || index >= count)
			throw new IndexOutOfBoundsException("Nema");
		else
			return array[index];
	}

	public void removeAt(int index) {

	}
}
