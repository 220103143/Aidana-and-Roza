package com.example.khayir;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp extends Application {

    private CosmeticRecommendationService recommendationService = CosmeticRecommendationService.getInstance();

    private PriceDisplay priceDisplay = new PriceDisplay();

    @Override
    public void start(Stage primaryStage) {
        recommendationService.initializeServiceWithData();
        recommendationService.registerObserver(priceDisplay);

        ComboBox<SkinType> skinTypeComboBox = new ComboBox<>(FXCollections.observableArrayList(SkinType.values()));
        skinTypeComboBox.setPromptText("Select Your Skin Type");

        Button btnRecommend = new Button("Recommend Cosmetics");
        ListView<String> recommendationsList = new ListView<>();


        btnRecommend.setOnAction(e -> {
            SkinType selectedType = skinTypeComboBox.getValue();
            if (selectedType != null) {
                List<Cosmetic> recommendations = recommendationService.recommendCosmetics(selectedType);
                recommendationsList.getItems().clear();
                recommendationsList.getItems().addAll(recommendations.stream().map(Cosmetic::getName).collect(Collectors.toList()));
            } else {
                showAlert("Please select a skin type.");
            }
        });

        Button btnShowPrices = new Button("Show Prices");
        btnShowPrices.setOnAction(e -> priceDisplay.displayPrices());

        VBox root = new VBox(10, skinTypeComboBox, btnRecommend, recommendationsList, btnShowPrices);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Cosmetics Selection System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
