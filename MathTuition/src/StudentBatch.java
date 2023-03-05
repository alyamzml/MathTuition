public class StudentBatch{

    Student [] students=new Student[2];

    void addStudent(Student students,int i){
        this.students[i]=students;
    }

    Student getStudents(int i){
        return students[i];
    }

    //findStudents method
    boolean findName(String name){
        boolean found=false;
        for (int i=0;i<students.length;i++){
            if (students[i].getLongName().equals(name)){
                found=true;
                break;
            }
        }
        return found;
    }
}