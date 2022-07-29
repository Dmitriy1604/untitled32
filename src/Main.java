public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = " Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = (firstName + lastName + middleName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета" + fullName);

    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String Upper = fullName.toUpperCase();
        System.out.println("Oригинал строки " + fullName);
        System.out.println("Большие буквы все " + Upper);

    }


    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника " + fullName.replace("ё", "е"));
    }

}