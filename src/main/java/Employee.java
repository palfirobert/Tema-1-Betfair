import lombok.Builder;
import lombok.Data;


@Data
@Builder(setterPrefix = "with")
public class Employee extends Thread {

    private static Printer printer = Printer.getInstance();
    private String firstName, lastName;

    @Override
    public void run() {

        try {
            printer.print();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void print(int numberPages, PRINT_TYPE printType) throws InterruptedException {
        printer.setNumberOfPages(numberPages);
        printer.isColor(printType.getType());
        printer.setEmployeeName(this.firstName);
        this.start();
        this.join();
    }
}
