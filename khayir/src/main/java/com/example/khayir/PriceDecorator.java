package com.example.khayir;
import java.util.List;
import java.util.stream.Collectors;

public class PriceDecorator extends CosmeticDecorator {
    public PriceDecorator(RecommendationStrategy recommendationStrategy) {
        super(recommendationStrategy);
    }


    @Override
    public List<Cosmetic> recommend(List<Cosmetic> cosmetics) {
        List<Cosmetic> recommendedCosmetics = super.recommend(cosmetics);

        for (Cosmetic cosmetic : recommendedCosmetics) {
            StringBuilder priceInfo = new StringBuilder();
            priceInfo.append("Product Name: ").append(cosmetic.getName()).append("\n");


            if (cosmetic instanceof Foundation) {
                priceInfo.append("Price: ").append("25k").append("\n");
            } else if (cosmetic instanceof Cushion) {
                priceInfo.append("Price: ").append("12k").append("\n");
            } else if (cosmetic instanceof Powder) {
                priceInfo.append("Price: ").append("17k").append("\n");
            }

            cosmetic.setDescription(priceInfo.toString());
        }

        return recommendedCosmetics;
    }
}