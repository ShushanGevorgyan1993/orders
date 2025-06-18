package am.order.enumHomework;

public enum Season {
    SPRING(18),
    SUMMER(35),
    AUTUMN(12),
    WINTER(-8);

    final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

}