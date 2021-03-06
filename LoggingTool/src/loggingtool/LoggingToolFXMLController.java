/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loggingtool;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Danieln Johansen
 */
public class LoggingToolFXMLController implements Initializable {

	@FXML
	private AnchorPane startMenuPane;
	@FXML
	private AnchorPane createNewPane;
	@FXML
	private AnchorPane reviewExistingPane;
	@FXML
	private AnchorPane updateNewPane;
	@FXML
	private Label lblTryCounter;
	@FXML
	private AnchorPane reviewExistingChooseLogPane;
	@FXML
	private Button homeBtn;
	@FXML
	private Button createNewBtn;
	@FXML
	private Button reviewExistingBtn;
	@FXML
	private Button quitBtn;
	@FXML
	private Button settingsBtn;
	@FXML
	private TextField fileNameTxtField;
	@FXML
	private Button createLogBtn;
	@FXML
	private ChoiceBox<?> raidChoiceBox;
	@FXML
	private ChoiceBox<?> difficultyChoiceBox;
	@FXML
	private ListView<?> tryListView;
	@FXML
	private TextArea tryDescTxtArea;
	@FXML
	private ChoiceBox<?> fightChoiceBox;
	@FXML
	private TextArea newTryDescrTxtArea;
	@FXML
	private ChoiceBox<?> newBossChoiceBox;
	@FXML
	private Button addTryBtn;
	@FXML
	private Button saveLogBtn;
	@FXML
	private Button reviewSelectedLogBtn;
	@FXML
	private ListView<?> logListView;

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void handleHomeBtn(ActionEvent event) {
	}

	@FXML
	private void handleMainMenuBtns(ActionEvent event) {
	}

	@FXML
	private void handleCreateLog(ActionEvent event) {
	}

	@FXML
	private void handleAddTryBtn(ActionEvent event) {
	}

	@FXML
	private void handleSaveLog(ActionEvent event) {
	}

	@FXML
	private void handleSelectLogBtn(ActionEvent event) {
	}
	
}
