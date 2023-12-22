package com.example.khayir;
import java.util.List;

public abstract class CosmeticDecorator implements RecommendationStrategy {
    protected RecommendationStrategy recommendationStrategy;

    public CosmeticDecorator(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    @Override
    public List<Cosmetic> recommend(List<Cosmetic> cosmetics) {
        return recommendationStrategy.recommend(cosmetics);
    }
}
