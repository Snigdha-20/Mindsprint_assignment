package Modifier.program;

public class EncapsulationAccess {

	public static void main(String[] args) {
		
		Encapsulation ed = new Encapsulation();
		ed.setAge(20);
		ed.setEmpid(12);
		ed.setName("Snigdha");
		
		System.out.println("EmpID = "+ed.getEmpid());

		System.out.println("Name = "+ed.getName());
		System.out.println("Age = "+ed.getAge());

		// TODO Auto-generated method stub

	}

}
