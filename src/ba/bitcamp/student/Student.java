package ba.bitcamp.student;

public class Student {

	private String name;
	private int indexNum;
	private double gpd;

	public Student(String name, int indexNum, double gpd) {

		this.name = name;
		this.indexNum = indexNum;
		this.gpd = gpd;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the indexNum
	 */
	public int getIndexNum() {
		return indexNum;
	}

	/**
	 * @param indexNum
	 *            the indexNum to set
	 */
	public void setIndexNum(int indexNum) {
		this.indexNum = indexNum;
	}

	/**
	 * @return the gpd
	 */
	public double getGpd() {
		return gpd;
	}

	/**
	 * @param gpd
	 *            the gpd to set
	 */
	public void setGpd(double gpd) {
		this.gpd = gpd;
	}

	public int compareTo(Student other) {
		if (this.gpd > other.gpd) {
			return -1;
		}
		if (this.gpd < other.gpd) {
			return 1;
		}

		else {
			if (this.indexNum > other.indexNum) {
				return -1;
			}
			if (this.indexNum < other.indexNum) {
				return 1;
			}

			else {
				if (this.name.compareTo(other.name) < 0) {
					return -1;
				}
				if (this.name.compareTo(other.name) > 0) {
					return 1;
				} else
					return 0;
			}
		}

	}

	@Override
	public String toString() {
		return "Student name: " + name + ", indexNum: " + indexNum + ", gpd: "
				+ gpd;
	}
}
