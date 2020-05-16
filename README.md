final exam inheritance repository

The program demonstrates inheritance functionality

A person interface is created with the methods getName and getDetails

An Abstract class PersonBaseImpl is then created that implements the person interface.
This class also has an attribute name, and a constructor that initializes the name attribute
Lastly, this class codes implementation of the getName method from the person interface and returns the name attribute

A Teacher interface is created that extends the person interface and has the method teachesFor

A teacherImpl class is created that extends PersonBaseImpl and implements the teacher interface
This class has an attribute taughtCourseTitle and a constructor that calls the person Instructor to initialize the name and locally initializes the taughtCourseTitle
The class also codes implementation for the teachesFor method that returns the taughtCourseTitle and implements the getDetails method to return the teacher

An interface Student is created that extends person and has the method studiesFor

Another class called studentImpl similar to teacher impl, extends PersonBaseImpl and implements the student interface
it has an attribute takenCourseTitle and in the constructor, it initializes this attribute while also callign the person constructor to initialize the name
It has implementation of the studiesFor method and the getDetails method, returning the student's name and what they study for

The main class creates to Person, a teacher which is initialized to a new TeacherImpl instance, and a Student which is initialized to a new StudentImpl instance
The two Person objects are then set equal to the created teacher and student and the system prints the teacher/student with their courses in the console.