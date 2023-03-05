public class Student{
    String nama;
    Name name;  //name contains all the null attributes and methods inside the Name class , name initially is null as inside Student class
    String ic;
    String address;
    String schName;
    float [] marks=new float[5];
    float average=0,min=0;
    Name teacherName;

    //to get full name from Name class to be assigned into nama attribute

    void setName(Name n){
        name=n; //attributes has values same as the object assigned
    }


    void setLongName(){
        nama=name.fname+" "+name.mname+" "+name.lname; //setting values to nama(String)
    }

    String getLongName(){
        return nama;
    }

    void setIC(String ic){
        this.ic=ic;
    }

    String getIC(){
        return ic;
    }

    void setAdd(String state,String country){
        address=state+","+country;
    }

    void setSchName(String schName){
        this.schName=schName;
    }

    void setMark(float mark,int i){
        //error checking
        try {
            if (mark >= 0 && mark <= 100) {
                marks[i] = mark;
            } else {
                throw new IllegalArgumentException("Mark is out of range (0-100): " + mark);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    float calcAvg(){
        float sum=0;
        for (int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        average=sum/marks.length;
        return average;
    }


    float findMin(){
        min=marks[0];
        for (int i=0;i<marks.length;i++){
            if (marks[i]<min){
                min=marks[i];
            }
        }
        return min;
    }

    void setTeacher(Name t1,Name t2){
        if (average>=50 && average<=70){
            teacherName=t1;
        }else if (average>=80 && average<=100) {
            teacherName=t2;
        }
    }


}
