public class Main {
    public static void main(String[] args) {
        //Задача 6
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Общий вес двух бойцов - " + (boxer1 + boxer2) + "кг");
        System.out.println("Разница между весами 2-х бойцов - " + (boxer2 - boxer1) + "кг");

        //Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница между весами 2-х бойцов(1способ) - " + (boxer2 - boxer1) + "кг");
        System.out.println("Разница между весами 2-х бойцов(2способ) - " + (boxer2 % boxer1) + "кг");

        //Задача 8
        System.out.println("Задача 8");
        var totalHours = 640;
        var workHours = 8;
        var totalStaff = totalHours / workHours;
        System.out.println("Всего работников в компании - " + totalStaff + " человек");
        totalStaff = totalStaff + 94;
        totalHours = totalStaff * workHours;
        System.out.println("Если в компании работает " + totalStaff + " человека, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}