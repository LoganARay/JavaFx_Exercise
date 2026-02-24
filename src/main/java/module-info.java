module edu.farmingdale.javafx_exercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.javafx_exercise to javafx.fxml;
    exports edu.farmingdale.javafx_exercise;
}