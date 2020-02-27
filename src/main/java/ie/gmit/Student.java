package ie.gmit;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        if(name.equals("")) {
            throw new NullPointerException("Student's name was not provided");
        }
        else if(email.equals("")) {
            throw new NullPointerException("Student's email was not provided");
        }
        else {
            this.name = name;
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
