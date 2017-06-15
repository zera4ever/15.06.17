package org.itstep;

public class WorkWithGroup {

	public static void main(String[] args) {
		
		GroupOfStudents group = new GroupOfStudents();
		group.setName("ST20");
		
		
		
		for(int i=0; i<15; i++){
			Student student = new Student(("ametova"+(i+1)), ("myPass"+(i+1)), "Zera", "Kiev");
			if(i>8){
				student = new Student(("ametova"+(i+1)), ("myPass"+(i+1)), "Zera", "Ternopol");
			}
			group.addStudentToGroup(student);
		}	
			System.out.println("My best group is " + group.getName());
			System.out.println("List of students:");
			
			for(Student student : group.getStudents()){
				if(student.getCity().equals("Kiev")){
					System.out.println("Login: " + student.getLogin() + "Name:" + student.getName());
					System.out.println("hashCode for student - " + student.hashCode());
					System.out.println(student.getPass().hashCode());
				}
					
			}
			
			
		}
		// TODO Auto-generated method stub

	}


