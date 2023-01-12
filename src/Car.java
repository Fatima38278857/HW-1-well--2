public class Car {

    String brand; // Бренд
    String model; // Модель
    String color; // Цвет
    String country; // Строна сборки
    double engineVolume; // Объем двигателя в литрах
    int year; // Год производства


    public Car(String brand, String color, String model, String country, double engineVolume, int year) {

        if (brand == null || brand.isBlank()) {
            this.brand = "Автомобиль ";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {
            this.country = "Made in ...";
        } else {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return "Car{" + "Бренд ='" + brand + '\'' + ", Модель ='" + model + '\'' + ",  Цвет ='" + color + '\'' + ",  Страна ='" + country + '\'' + ", Обьем двиголеля =" + engineVolume + ",  Год =" + year + '}';
    }
}



