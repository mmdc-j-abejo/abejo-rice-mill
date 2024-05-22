package com.demoproject.abejoricemill.contoller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainViewController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private Label lbl_fxml_path;

    @FXML
    void dashboardClicked(ActionEvent event) {
        this.lbl_fxml_path.setText("/ Dashboard /");
        loadBorderPaneRight("/com/demoproject/abejoricemill/dashboard-view.fxml");
    }

    @FXML
    void debt(ActionEvent event) {
        this.lbl_fxml_path.setText("/ Debts /");
    }

    @FXML
    protected void initialize() {
        this.lbl_fxml_path.setText("/ Dashboard /");
    }

    @FXML
    void employeeEvent(ActionEvent event) {
        if (event.getSource() instanceof ComboBox) {
            ComboBox < String > comboBox = (ComboBox < String > ) event.getSource();
            String selectedValue = comboBox.getValue();

            switch (selectedValue) {
                case "Employees":
                    this.lbl_fxml_path.setText("/ Employee /");
                    loadBorderPaneRight("/com/demoproject/abejoricemill/employees-view.fxml");
                    break;
                case "Contributions":
                    this.lbl_fxml_path.setText("/ Employee / Contributions");
                    loadBorderPaneRight("/com/demoproject/abejoricemill/contributions-view.fxml");
                    break;
                case "Add New Contribution":
                    this.lbl_fxml_path.setText("/ Employee / Add New Contribution");
                    loadBorderPaneRight("/com/demoproject/abejoricemill/add-new-contributions.fxml");
                    break;
                case "Add new employee":
                    this.lbl_fxml_path.setText("/ Employee / Add New Employee /");
                    loadBorderPaneRight("/com/demoproject/abejoricemill/add-new-employee.fxml");
                    break;
            }
        }
    }

    private void loadBorderPaneLeft(String fxmlFileName) {
        try {
            AnchorPane loader = FXMLLoader.load(getClass().getResource(fxmlFileName));
            this.borderPane.setLeft(loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadBorderPaneRight(String fxmlFileName) {
        try {
            AnchorPane loader = FXMLLoader.load(getClass().getResource(fxmlFileName));
            this.borderPane.setRight(loader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void molinoEvent(ActionEvent event) {
        if (event.getSource() instanceof ComboBox) {
            ComboBox < String > comboBox = (ComboBox < String > ) event.getSource();
            String selectedValue = comboBox.getValue();
            switch (selectedValue) {
                case "Molino List":
                    this.lbl_fxml_path.setText("/ Molino / List /");
                    break;
                case "Add New Molino":
                    this.lbl_fxml_path.setText("/ Molino / Add New Molino /");
                    break;
                case "Buy Rice Including New Molino":
                    this.lbl_fxml_path.setText("/ Molino / Add New Molino and Buy Rice /");
                    break;
            }
        }
    }

    @FXML
    void riceBranSalesEvent(ActionEvent event) {
        if (event.getSource() instanceof ComboBox) {
            ComboBox < String > comboBox = (ComboBox < String > ) event.getSource();
            String selectedValue = comboBox.getValue();
            switch (selectedValue) {
                case "Rice Bran Sales":
                    this.lbl_fxml_path.setText("/ Rice Bran / Sales /");
                    break;
                case "Add Rice Bran Stock":
                    this.lbl_fxml_path.setText("/ Rice Bran / Add Stock /");
                    break;
                case "Sell Rice Bran":
                    this.lbl_fxml_path.setText("/ Rice Bran / Sell /");
                    break;
            }
        }
    }

    @FXML
    void riceSalesEvent(ActionEvent event) {
        if (event.getSource() instanceof ComboBox) {
            ComboBox < String > comboBox = (ComboBox < String > ) event.getSource();
            String selectedValue = comboBox.getValue();

            switch (selectedValue) {
                case "Rice Sales":
                    this.lbl_fxml_path.setText("/ Rice / Sales /");
                    break;
                case "Add new rice stocks":
                    this.lbl_fxml_path.setText("/ Rice / Add New Stock /");
                    break;
                case "Sell rice/kg":
                    this.lbl_fxml_path.setText("/ Rice / Sell /");
                    break;
                case "Rice Transactions":
                    this.lbl_fxml_path.setText("/ Rice / View Transactions /");
                    break;

            }
        }
    }

    @FXML
    public void settings(ActionEvent event) {
        if (event.getSource() instanceof ComboBox < ? > ) {
            ComboBox < String > comboBox = (ComboBox < String > ) event.getSource();
            String selectedValue = comboBox.getValue();

            switch (selectedValue) {
                case "Documentation":
                    this.lbl_fxml_path.setText("/ Documentation /");
                    break;
                case "Logout":
                    Platform.exit();
                    break;
            }
        }
    }

    @FXML
    void dailyAuditEvent(ActionEvent event) {
        if (event.getSource() instanceof ComboBox < ? > ) {
            ComboBox < String > comboBox = (ComboBox < String > ) event.getSource();
            String selectedValue = comboBox.getValue();

            switch (selectedValue) {
                case "Daily Audit":
                    this.lbl_fxml_path.setText("/ Audit / Daily /");
                    break;
                case "Monthly Audit":
                    this.lbl_fxml_path.setText("/ Audit / Monthly /");
                    break;
                case "Yearly Audit":
                    this.lbl_fxml_path.setText("/ Audit / Yearly /");
                    break;
            }
        }
    }

    @FXML
    public void machineMaintenanceEvent(ActionEvent event) {
        this.lbl_fxml_path.setText("/ Machine Maintenance /");
    }

    public void minimizeClicked(MouseEvent mouseEvent) {
        Node source = (Node) mouseEvent.getSource();
        Window window = source.getScene().getWindow();
        if (window instanceof Stage) {
            ((Stage) window).setIconified(true);
        }
    }

    public void exitClicked(MouseEvent mouseEvent) {
        Platform.exit();
    }
}