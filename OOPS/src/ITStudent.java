import java.util.Arrays;

public class ITStudent extends Student {

    int programmingExperience;
    String[] skill_set;

    public ITStudent(String name, String email_ID, String course,
                     String branch, int roll_no, int programmingExperience) {
        super(name, email_ID, course, branch, roll_no);
        this.programmingExperience = programmingExperience;
    }

    void add_new_skill(String value){
        //this.skill_set
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "programmingExperience=" + programmingExperience +
                '}';
    }
}


