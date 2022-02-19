import java.util.ArrayList;

public class Course {
	private ArrayList<Student> roster;  //collection of Student objects
  
	public Course() {
		roster = new ArrayList<Student>();
	}
  
	public int courseSize() {
		return roster.size();
	}

	public int countProbation() {
	   int probation = 0;
		for (Student s : roster) {
		   if (s.getGPA() < 2.0) 
		      probation++;
		}
		return probation;
	}

  public Student findStudentHighestGpa() {
		Student top = new Student("Filler", "Student", 0.0);
		double gpa = 0.0;
		for (Student s : roster) {
		   if (s.getGPA() > gpa) {
		      top = s;
		      gpa = top.getGPA();
		   }
		}
		return top;
	}
  
  public ArrayList<Student> getDeansList() {
		ArrayList<Student> deanslist = new ArrayList<Student>();
		for (Student s : roster) {
		   if (s.getGPA() >= 3.5)
		      deanslist.add(s);
		}
		return deanslist;
	}

  public void dropStudent(String last) {
		for (Student s : roster) {
		   if (s.getLast() == last) {
		      roster.remove(s);
		      break;
		   }
		}
	}
  
	public void addStudent(Student s) {
		roster.add(s);
	}
    
  public int countStudents() {
      return roster.size();
   }
}