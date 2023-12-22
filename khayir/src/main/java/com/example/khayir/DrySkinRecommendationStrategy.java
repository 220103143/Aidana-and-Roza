package com.example.khayir;
import java.util.List;
import java.util.stream.Collectors;

public class DrySkinRecommendationStrategy implements RecommendationStrategy {
    @Override
    public List<Cosmetic> recommend(List<Cosmetic> cosmetics) {
        return cosmetics.stream()
                .filter(cosmetic -> cosmetic.getSkinType() == SkinType.DRY)
                .collect(Collectors.toList());
    }
}
