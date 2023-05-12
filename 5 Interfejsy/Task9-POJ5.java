import java.util.Arrays;

interface RatingStrategy {
    double calculateRating(double[] scores);
}

class Product {
    String name;
    double[] scores;

    public Product(String name, double[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public double rate(RatingStrategy ratingStrategy) {
        return ratingStrategy.calculateRating(scores);
    }
}

class Main {
    public static void main(String[] args) {
        RatingStrategy averageRating = new RatingStrategy() {
            @Override
            public double calculateRating(double[] scores) {
                double sum = 0;
                for (double score : scores) {
                    sum += score;
                }
                return sum / scores.length;
            }
        };

        RatingStrategy medianRating = new RatingStrategy() {
            @Override
            public double calculateRating(double[] scores) {
                Arrays.sort(scores);
                if (scores.length % 2 == 0) {
                    int index1 = scores.length / 2 - 1;
                    int index2 = scores.length / 2;
                    return (scores[index1] + scores[index2]) / 2;
                } else {
                    int index = scores.length / 2;
                    return scores[index];
                }
            }
        };

        double[] scores = {4.5, 3.2, 5.0, 2.8, 4.0};
        Product product = new Product("Produkt 1", scores);

        double average = product.rate(averageRating);
        double median = product.rate(medianRating);

        System.out.println("Średnia ocena: " + average);
        System.out.println("Mediana ocen: " + median);

        if (average == 3.7) {
            System.out.println("Obliczanie średniej oceny działa poprawnie.");
        } else {
            System.out.println("Błąd w obliczaniu średniej oceny.");
        }

        if (median == 4.0) {
            System.out.println("Obliczanie mediany ocen działa poprawnie.");
        } else {
            System.out.println("Błąd w obliczaniu mediany ocen.");
        }
    }
}