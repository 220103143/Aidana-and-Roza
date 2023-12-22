package com.example.khayir;
import java.util.List;

public interface RecommendationStrategy {
    List<Cosmetic> recommend(List<Cosmetic> cosmetics);
}
