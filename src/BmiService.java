public class BmiService {
    public int calculate(double height, double weight) {
        // Рассчитываем индекс массы тела
        double bmi = weight / (height * height);
        // Округляем до ближайшего целого числа
        return (int) (bmi);
    }
}