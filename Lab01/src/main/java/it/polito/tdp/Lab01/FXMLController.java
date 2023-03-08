package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import it.polito.tdp.Lab01.model.ParoleLinked;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnCancella;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;


    @FXML
    private TextArea txtPerformance;

    @FXML
    void doCancella(ActionEvent event) {
    	
    	boolean cancellata;
    	
    	String selected = txtResult.getSelectedText();
    	double start = System.nanoTime();
    	cancellata = elenco.removeParola(selected);
    	double stop = System.nanoTime();
    	
    	txtResult.clear();
    	String result = "";
    	for (String p:elenco.getElenco())
    		result +=p + "\n";
    	txtResult.setText(result);
    	
    	txtPerformance.clear();
    	if(cancellata) {
    		txtPerformance.setText("Parola Eliminata!\n");
    		txtPerformance.appendText("[REMOVE]: " + (stop - start)/1e9 + " seconds");
    	}
    	else
    		txtPerformance.setText("Parola NON Eliminata!\n");
  	
    }

    

    @FXML
    void doInsert(ActionEvent event) {
    	
    	double start = System.nanoTime();
    	String parola = txtParola.getText();
    	if(!parola.isBlank())
    		elenco.addParola(parola);
    	double stop = System.nanoTime();
    	
    	txtResult.clear();
    	String result = "";
    	for (String p:elenco.getElenco())
    		result +=p + "\n";
    	txtResult.setText(result);
    	
    	txtPerformance.clear();
    	if(parola.isBlank())
    		txtPerformance.setText("Parola non inserita!");
    	else
    		txtPerformance.setText("[INSERT]: " + (stop - start)/1e9 + " seconds");
    	
    	
    	txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.clear();
    	txtPerformance.clear();
    }


    @FXML
    void initialize() {
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPerformance != null : "fx:id=\"txtPerformance\" was not injected: check your FXML file 'Scene.fxml'.";
        
        //elenco = new Parole() ;
        elenco = new ParoleLinked();
    }

}
