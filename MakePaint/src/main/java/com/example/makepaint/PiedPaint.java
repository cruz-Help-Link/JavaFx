package com.example.makepaint;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PiedPaint extends Application {

    @Override
    public void start(Stage stage) {
        // Create the data for the pie chart
        PieChart.Data mid = new PieChart.Data("Confused", 42);
        PieChart.Data fail = new PieChart.Data("Bugs", 48);
        PieChart.Data good = new PieChart.Data("Knowledgeable", 9);
        //ASSIGNMENT---> Change the colors of the data pieces

        // Create the pie chart
        PieChart pieChart = new PieChart();
        pieChart.getData().addAll(mid, fail, good);

        // Set up the stage
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10,10,10,10));
        root.getChildren().add(pieChart);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Pie Chart Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
