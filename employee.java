
public class employee {
    // constructor same name as class not return type
    // it creates/initialise objects in ram
    // you can use contructor block to initialiaze some default values

    int id;
    String dept;

    public employee(int idd, String dep) {
        id = idd;
        dept = dep;
    }

    public static void main(String[] args) {
        employee vro = new employee(34, "boomer");
        System.out.println(vro.dept);
    }
}