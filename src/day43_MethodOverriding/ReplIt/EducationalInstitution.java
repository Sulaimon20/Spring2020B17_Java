package day43_MethodOverriding.ReplIt;

public class EducationalInstitution {
    private int years;
    int duration;

    public EducationalInstitution(int duration){
        this.duration=duration;
    }
    public String graduationRequirements(){
        return duration + " years of study";
    }



}
