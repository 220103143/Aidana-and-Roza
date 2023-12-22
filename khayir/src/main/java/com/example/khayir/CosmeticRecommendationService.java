package com.example.khayir;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CosmeticRecommendationService {
    private static CosmeticRecommendationService instance;

    private List<Cosmetic> cosmeticsDatabase = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    // Метод для регистрации наблюдателей
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для уведомления наблюдателей
    private void notifyObservers(SkinType skinType) {
        for (Observer observer : observers) {
            observer.update(skinType);
        }
    }
    public static CosmeticRecommendationService getInstance() {
        if (instance == null) {
            instance = new CosmeticRecommendationService();
        }
        return instance;
    }

    public void initializeServiceWithData() {
        cosmeticsDatabase.add(new Cosmetic("Hydrating Moisturizer", SkinType.DRY, "HydraBrand", 30));
        cosmeticsDatabase.add(new Cosmetic("Matte Finish Moisturizer", SkinType.OILY, "MatteBrand", 28));
        cosmeticsDatabase.add(new Cosmetic("Balancing Toner", SkinType.COMBINATION, "BalanceBrand", 25));
        cosmeticsDatabase.add(new Cosmetic("Gentle Cleanser", SkinType.SENSITIVE, "GentleBrand", 22));
        cosmeticsDatabase.add(new Cosmetic("Sunscreen SPF 50", SkinType.NORMAL, "SunBrand", 20));
        // ... add more cosmetics as needed
    }

    public List<Cosmetic> recommendCosmetics(SkinType skinType) {
        List<Cosmetic> recommendations = new ArrayList<>();

        switch (skinType) {
            case DRY:
                recommendations.add(new Cosmetic("Тональко от garnier", SkinType.DRY, "Garnier", 22));
                recommendations.add(new Cosmetic("Кушон от Dior", SkinType.DRY, "Dior", 12));
                recommendations.add(new Cosmetic("Пудра от chupa chups", SkinType.DRY, "Chupa Chups", 17));
                break;

            case OILY:
                recommendations.add(new Cosmetic("Тональко от Dior", SkinType.OILY, "Dior", 25));
                recommendations.add(new Cosmetic("Кушон от chupa chups", SkinType.OILY, "Chupa Chups", 12));
                recommendations.add(new Cosmetic("Пудра от garnier", SkinType.OILY, "Garnier", 17));
                break;

            case COMBINATION:
                recommendations.add(new Cosmetic("Тональко от Pz", SkinType.COMBINATION, "Pz", 34));
                recommendations.add(new Cosmetic("Кушон от Kiko", SkinType.COMBINATION, "Kiko", 12));
                recommendations.add(new Cosmetic("Пудра от selebrity", SkinType.COMBINATION, "Selebrity", 17));
                break;

            default:
                // Если выбран неизвестный тип кожи, не добавлять рекомендации
                break;
        }

        return recommendations;
    }

    public List<String> getAvailableBrands() {
        return cosmeticsDatabase.stream()
                .map(Cosmetic::getBrand)
                .distinct()
                .collect(Collectors.toList());
    }

    public void notifyObservers(List<Cosmetic> recommendations) {
    }

    public int getPriceForCosmetic(String cosmeticName) {
        int price = 0;
        return price;
    }

    public void registerObserver(PriceObserver priceObserver) {
    }

    public void registerObserver(PriceDisplay priceDisplay) {
    }
}
