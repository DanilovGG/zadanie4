public class Main {
    public static void main(String[] args) {
        // Создаем объект сервиса
        BmiService service = new BmiService();

        // Вызываем метод расчета BMI и передаем рост и вес
        int bmiIndex = service.calculate(1.87, 98);

        // Выводим рассчитанный BMI-индекс
        System.out.println("BMI-индекс: " + bmiIndex);
    }
}