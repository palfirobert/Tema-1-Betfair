public class Main {
    public static void main(String[] args) throws InterruptedException {
        Employee employee = Employee.builder()
                .withLastName("Popa")
                .withFirstName("Vasile").build();
        Employee employee1 = Employee.builder()
                .withLastName("Popescu")
                .withFirstName("Vlad").build();
        employee.print(5, PRINT_TYPE.BLACK_AND_WHITE);
        employee1.print(9, PRINT_TYPE.COLOR);
    }
}
