
public class Student {
	int rollnumber;
	String name;
	int english;
	int maths;
	int science;
	int total;
	public Student() {

	}

	public Student(int r, String n, int e, int m, int s) {
		rollnumber = r;
		name = n;
		english = e;
		maths = m;
		science = s;
		total = e+m+s;
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", english=" + english + ", maths=" + maths
				+ ", science=" + science + ", total=" + total + "]";
	}


	}

