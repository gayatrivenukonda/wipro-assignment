package emp;

public class Question46 {
		
		    public static void main(String[] args) {
		        Repository<Employee, Integer> employeeRepo = new Repository<>();
		        
		        employeeRepo.save(1, new Employee(1, "Bhanu", 50000));
		        employeeRepo.save(2, new Employee(2, "Gayathri", 60000));
		        employeeRepo.save(3, new Employee(3, "Duhita", 55000));

		        
		        System.out.println("All Employees:");
		        for (Employee e : employeeRepo.findAll()) {
		            System.out.println(e);
		        }

		        System.out.println("\nEmployee with ID 2:");
		        System.out.println(employeeRepo.findById(2));

		        
		        employeeRepo.deleteById(1);

		       
		        System.out.println("\nAfter deleting ID 1:");
		        for (Employee e : employeeRepo.findAll()) {
		            System.out.println(e);
		        }
		    }
		}
/*
 All Employees:
1 - Bhanu - ₹50000.0
2 - Gayathri - ₹60000.0
3 - Duhita - ₹55000.0

Employee with ID 2:
2 - Gayathri - ₹60000.0

After deleting ID 1:
2 - Gayathri - ₹60000.0
3 - Duhita - ₹55000.0

 */

