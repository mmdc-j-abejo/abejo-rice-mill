module com.demoproject.abejoricemill {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.demoproject.abejoricemill to javafx.fxml;
    exports com.demoproject.abejoricemill;
    exports com.demoproject.abejoricemill.contoller;
    opens com.demoproject.abejoricemill.contoller to javafx.fxml;

}