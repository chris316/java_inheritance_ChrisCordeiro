package csci3444.inheritance;

public abstract class PersonBaseImpl implements Person {

	public String name;
	
	@Override
	public String getName(){
		return name;
	}

	public PersonBaseImpl(String _name) {
		name=_name;
	}
	
	

}
