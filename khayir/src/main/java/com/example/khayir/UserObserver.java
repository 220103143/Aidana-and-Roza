package com.example.khayir;
import javafx.scene.control.ListView;

import java.util.List;
import java.util.stream.Collectors;

public class UserObserver implements Observer {
    private ListView<String> recommendationsList;

    public UserObserver(ListView<String> recommendationsList) {
        this.recommendationsList = recommendationsList;
    }

    @Override
    public void update(List<Cosmetic> recommendations) {
        recommendationsList.getItems().clear();
        recommendationsList.getItems().addAll(recommendations.stream().map(Cosmetic::getName).collect(Collectors.toList()));
    }
}
