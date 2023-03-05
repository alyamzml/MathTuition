public class Name{
    String fname;
    String mname;
    String lname;
    String fullname;

    void setFname(String fname){
        this.fname=fname;
    }

    void setMname(String mname){
        this.mname=mname;
    }

    void setLname(String lname){
        this.lname=lname;
    }

    void setFullname (){
        fullname=fname+" "+mname+" "+lname+" ";
    }

    String getName(){
        return fullname;
    }

}