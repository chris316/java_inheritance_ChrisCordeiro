package csci3444.inheritance;

public class MainEntry {

	public static void main(String[] args) {
		Person p1;
		Person p2;
		Teacher t=new TeacherImpl("Ilker","Java");
		Student s=new StudentImpl("Chris","Java");
		p1=t;
		p2=s;
		
		System.out.println("Person 1:  "+p1.getName()+p1.getDetails());
		System.out.println("Person 2:  "+p2.getName()+p2.getDetails());

	}

}
