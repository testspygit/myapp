public class myapp011 {
    private String name;
    private String id;

    public myapp011(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println(name + ", " + id);
    }

    public static void main(String[] args) {
        myapp011 student = new myapp011("Khadija", "SP21-BCT-011");
        student.displayInfo();
    }
}

