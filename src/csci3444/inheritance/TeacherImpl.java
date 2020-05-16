package csci3444.inheritance;

public class TeacherImpl extends PersonBaseImpl implements Teacher {

	public String taughtCourseTitle;
	
	
	public TeacherImpl(String _name, String taughtCourseTitle) {
		super(_name);
		this.taughtCourseTitle=taughtCourseTitle;
	}
	
	@Override
	public String teachesFor() {
		return taughtCourseTitle;
	}
	
	@Override
	public String getDetails() {
		return " teaches "+teachesFor();
	}
	
}
