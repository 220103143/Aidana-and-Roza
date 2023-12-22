package com.example.khayir;

import java.util.List;

public class RecommendationCommand implements Command {
    private CosmeticRecommendationService recommendationService;
    private SkinType skinType;

    public RecommendationCommand(CosmeticRecommendationService recommendationService, SkinType skinType) {
        this.recommendationService = recommendationService;
        this.skinType = skinType;
    }

    @Override
    public void execute() {
        List<Cosmetic> recommendations = recommendationService.recommendCosmetics(skinType);
        recommendationService.notifyObservers(recommendations);
    }
}
