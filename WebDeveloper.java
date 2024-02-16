public class WebDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("Getting Web Developer's salary");
        return 40000;
    }

}