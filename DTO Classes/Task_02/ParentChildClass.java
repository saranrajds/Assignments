package dtoclasswithattributes;

class Student {

	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {

		this.name = name;
		this.rollNo = rollNo;
	}

	public Student(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}

class ZSGSStudent extends Student {

	private String zsgsId;
	
	public ZSGSStudent(String name, int rollNo, String zsgsId) {

		super(name, rollNo);
		this.zsgsId = zsgsId;
	}

	public ZSGSStudent(String name, String zsgsId) {

		super(name);
		this.zsgsId = zsgsId;
	}

	public String getZsgsId() {
		return zsgsId;
	}

	public void setZsgsId(String zsgsId) {
		this.zsgsId = zsgsId;
	}
}

public class ParentChildClass {

	public static void main(String[] args) {

		ZSGSStudent child = new ZSGSStudent("saran", 15, "inc-01");
        System.out.println("Name: " + child.getName());
        System.out.println("RollNo: " + child.getRollNo());
        System.out.println("ZsgsId: " + child.getZsgsId());
        
        Student parent = new Student("Bob", 20);
        System.out.println("Name: " + parent.getName());
        System.out.println("RollNo: " + parent.getRollNo());
	}
}
