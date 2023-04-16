public class Printer {
    private static Printer instance;
    private static String employeeName;
    private Boolean color = false;
    private int numberOfPages;

    private Printer() {
    }

    public static synchronized Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void isColor(Boolean printType) {
        if (printType != null)
            this.color = printType;
    }

    public void setEmployeeName(String employeeName) {
        Printer.employeeName = employeeName;
    }

    public synchronized void print() throws InterruptedException {
        if (color)
            System.out.println("Selected to print in color...");
        else System.out.println("Selected to print in black and white...");

        Thread.sleep(500);

        System.out.println("Selected to print "+numberOfPages+" pages...");

        Thread.sleep(500);

        for (int i = 1; i <= this.numberOfPages; i++) {
            System.out.println(employeeName + " is printing page number " + i+"/"+this.numberOfPages);
            Thread.sleep(1000);
        }

        System.out.println("FINISHED PRINTING...");

    }


}
