import java.util.Random;

/**
 * Created by Shao on 27.05.2017.
 */
public class StudentData {
    private Names name;
    private double averageScore;
    private boolean sport;

    public StudentData(Names name, double averageScore, boolean sport) {
        this.name = name;
        this.averageScore = averageScore;
        this.sport = sport;
    }

    public StudentData() {
        final Random random = new Random();
        name = Names.values()[random.nextInt(Names.values().length - 1)];
        averageScore = random.nextDouble() * 5;
        sport = random.nextBoolean();
        if (random.nextInt(2) == 0) {
            averageScore = 5;
            sport = true;
        }
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        String sport = isSport() ? "yes" : "no";
        return "Name: " + getName() + "  Score: " + String.format("%2.2f", getAverageScore()) + "  Sport: " + sport;
    }
}
