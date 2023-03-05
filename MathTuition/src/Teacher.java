public class Teacher {

    Name name;
    String ic;
    String address;
    int numyearexp;
    String qualification;

    void setName(Name name){
        this.name= name;
    }

    void setAdd(String state,String country){
        address=(state+" , "+country);
    }

    void setNumExp(int year){
        numyearexp=year;
    }

    void setIC(String ic){
        this.ic=ic;
    }

    void setQualification(String qualification){
        this.qualification=qualification;
    }

}
