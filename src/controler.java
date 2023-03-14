import java.util.List;

import com.sati.dao.IStudentDoa;
import com.sati.dao.StudentDao;
import com.sati.model.Student;

/**
 * 
 * @author A.Lekerand
 *
 */
public class controler {
	public static void main(String[] args) {

		IStudentDoa studentDao = new StudentDao();

        // test saveStudent
       

     // test getStudentById
        Student student2 = studentDao.getStudentById(1);
        System.out.println(student2.toString());
        
        
        List < Student > students = studentDao.getAllStudents();
        for (Student student : students) {
        	 System.out.println("---"+student.getId());
		}
		
        
     // test deleteStudent
        studentDao.deleteStudent(1); 

    }

}
