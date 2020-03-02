package ie.gmit;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        if(name.equals("") || email.equals("")) {
            throw new NullPointerException("Blank name or email entry");
        }
        else {
            this.name = name;
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
