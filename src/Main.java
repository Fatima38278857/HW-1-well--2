
public class Main {
    public static void main(String[] args) {

        String brand; // Бренд
        String model; // Модель
        String color; // Цвет
        String country; // Строна сборки
        double engineVolume; // Объем двигателя в литрах
        int year; // Год производства

        Car car1 = new Car( "Lada ", "Чёрный" ,"Granta" ,  "Япония", 1.5, 2015 );
        Car car2 = new Car("Audi", "Чёрный", "A8 50L TDI quattro", "Германия", 3.0, 2020);
        Car car3 = new Car( "BMW",  "Чёрный", "Z8", "Германия", 3.0, 2021);
        Car car4 = new Car( "Kia","Красный" , "Sportage IV", "Южная Корея", 2.4, 2018);
        Car car5 = new Car("Hyundai", "Оранжевый", "Avante",  "Южная Корея", 1.6,2016);


        System.out.println(car1 + "\n" + car2 + '\n' + car3 + '\n' + car4 + '\n' + car5);
    }

}