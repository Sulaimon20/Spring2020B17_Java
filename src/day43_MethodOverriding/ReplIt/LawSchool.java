package day43_MethodOverriding.ReplIt;

public class LawSchool extends EducationalInstitution {
    public LawSchool() {
        super(3);
    }

    public String graduationRequirements() {
        return duration+" years of study";
    }

}
