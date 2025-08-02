package jdbc_assign;


public class Student_App {
    public static void main(String[] args) {
        Student_DAO dao = new Student_DAO();
        dao.getAllStudents().forEach(System.out::println);
    }
}

/*
1 | Pallavi | 21 | Computer Science | 87.0
2 | Lahari | 22 | Electronics | 80.0
3 | Kavya | 19 | Mechanical | 92.2
4 | Gayathri | 22 | Electronics| 67.8
5 | Bhanu | 20 | Civil | 88.9
6 | Bindu | 21 | AIML | 75.3
7 |Asha | 22 | Electrical | 69.5
8 | Anu | 23 | Computer Science | 94.1
*/