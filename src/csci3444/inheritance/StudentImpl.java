package csci3444.inheritance;

public class StudentImpl extends PersonBaseImpl implements Student{

	public String takenCourseTitle;
	
	public StudentImpl(String _name,String takenCourseTitle) {
		super(_name);
		this.takenCourseTitle=takenCourseTitle;
	}
	
	
	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}
	
	@Override
	public String getDetails() {
		return " studies for "+studiesFor();
	}
}
