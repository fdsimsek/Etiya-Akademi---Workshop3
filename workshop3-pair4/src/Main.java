import Entity.Student;
import DataAccess.StudentDao;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.add(new Student("Fırat", "Şimşek", 1,1,"a"));
        studentDao.add(new Student("Ahmet","Çalık",2,2,"b"));
        studentDao.list();
        studentDao.update(1,new Student("Aybars","Mirze",1,1,"a"));
        studentDao.list();
        studentDao.delete(1);
        studentDao.list();
    }
}