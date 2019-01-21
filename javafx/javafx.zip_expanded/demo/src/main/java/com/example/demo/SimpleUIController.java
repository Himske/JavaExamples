package com.example.demo;

import org.springframework.stereotype.Component;

import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

@Component
public class SimpleUIController {
	
	private final HostServices hostServices;
	
	@FXML
	public Label label;
	
	@FXML
	public Button button;
	
	SimpleUIController(HostServices hostServices) {
		this.hostServices = hostServices;
	}
	
	@FXML
	public void initialize() {
		this.button.setOnAction(actionEvent -> this.label.setText( this.hostServices.getDocumentBase()));
	}

}
