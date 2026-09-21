package factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        BookRecommender[] recommenders = {
                new FantasyRecommender(),
                new DetectiveRecommender(),
                new SciFiRecommender()
        };

        for (BookRecommender recommender : recommenders) {
            recommender.recommend();
            System.out.println();
        }
    }
}