public class Main
{
    public static void main(String[] args) {

        //object is created to access attributes and methods in other class
        // to set the values for variables- use setter, do not access it directly!

        Name sname=new Name();

        Teacher li=new Teacher();
        Teacher raju=new Teacher();

        Name tname1=new Name();
        tname1.setFname("Li");
        tname1.setMname("Hong");
        tname1.setLname("Yi");
        tname1.setFullname();
        li.setName(tname1); //passing object

        Name tname2=new Name();
        tname2.setFname("Raju");
        tname2.setMname("Murugam");
        tname2.setFullname();
        raju.setName(tname2);

        sname.setFname("Mikail");       //the values for attributes inside the Name is assigned only for object sname
        sname.setMname("Arman");
        sname.setLname("Mustafa");
        sname.setFullname();

        Name sname2=new Name();
        sname2.setFname("Nur");
        sname2.setMname("Alya");
        sname2.setLname("Muzamil");
        sname2.setFullname();

        //to set values to attributes inside Student class:
        Student mike=new Student();
        mike.setName(sname);    //to associate the Student object with Name object but pointing to object sname only
        mike.setLongName();
        mike.setIC("030204020000");
        mike.setAdd("Seri Iskandar","Perak");
        mike.setSchName("Universiti Teknologi Petronas");
        //mike.setTeacher(tname1,tname2);

        Student alya=new Student();
        alya.setName(sname2);
        alya.setLongName();
        alya.setIC("030204029999");
        alya.setAdd("Seri Iskandar","Perak");
        alya.setSchName("Universiti Teknologi Petronas");
        //alya.setTeacher(tname1,tname2);

        for (int i=0;i<5;i++){
            mike.setMark(60,i);
            alya.setMark(100,i);
        }

        //creating Student Batch where it stores all students' data
        StudentBatch batch=new StudentBatch();
        batch.addStudent(mike,0);
        batch.addStudent(alya,1);


        //displaying students' details
        for (int i=0;i<batch.students.length;i++){
            Student stud=batch.getStudents(i);  //stud is referring to the students array inside StudentBatch
            System.out.println("Student " + (i+1) + " details:");
            System.out.println("Full Name: " + stud.getLongName()); //stud can use also used method inside the Student class
            System.out.println("IC Number: " + stud.getIC());
            System.out.println("Address: " + stud.address);
            System.out.println("School Name: " + stud.schName);
            float avg=stud.calcAvg();
            System.out.println("Average: "+stud.average);
            float minMark=stud.findMin();
            System.out.println("Min mark: "+stud.min);
            stud.setTeacher(tname1,tname2);
            System.out.println("Teacher Name: "+stud.teacherName.getName());
            System.out.print("\n");
        }


        boolean findSb=batch.findName("Nur Alya Muzamil");
        //System.out.print(findSb);
        //System.out.print("Student Name: "+mike.name.getName());//== sname.getName()//== alya.getLongName

        //System.out.print(li.name.getName());

    }
}
