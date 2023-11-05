import java.util.Scanner;

public class Main {
    public interface Test {
        void run();
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        Test country = () -> {
            int countryid;
            String name;
            System.out.print("\nВведите ИД данной страны: ");
            countryid = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите название данной страны: ");
            name = scann.nextLine();
            System.out.println("\n" + countryid + "| " + name);
        };

        Test region = () -> {
            int regionid;
            int countryid;
            String name;
            System.out.print("\nВведите ИД данного региона: ");
            regionid = scann.nextInt();
            System.out.print("Введите ИД страны для данного региона: ");
            countryid = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите название данного региона: ");
            name = scann.nextLine();
            System.out.println("\n" + regionid + "| " + name + " (" + countryid + ")");
        };

        Test city = () -> {
            int cityid;
            int regionid;
            String name;
            System.out.print("\nВведите ИД данного города: ");
            cityid = scann.nextInt();
            System.out.print("Введите ИД региона для данного города: ");
            regionid = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите название данного города: ");
            name = scann.nextLine();
            System.out.println("\n" + cityid + "| " + name + " (" + regionid + ")");

        };

        Test address = () -> {
            int id;
            int cityid;
            String person, street, building, office;
            System.out.print("\nВведите ИД клиента: ");
            id = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите ФИО клиента: ");
            person = scann.nextLine();
            System.out.print("Введите ИД города клиента: ");
            cityid = scann.nextInt();
            scann.nextLine();
            System.out.print("Введите наименование улицы клиента: ");
            street = scann.nextLine();
            System.out.print("Введите номер строения клиента: ");
            building = scann.nextLine();
            System.out.print("Введите номер квартиры/офиса: ");
            office = scann.nextLine();
            System.out.print("\nКлиент №" + id + "\nФИО: " + person + "\nГород: " + cityid + "\nУлица: " + street + "\nНомер строения: " + building + "\nНомер квартиры/офиса: " + office);
        };

        country.run();
        region.run();
        city.run();
        address.run();
    }
}
