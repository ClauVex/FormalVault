package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.List;
import java.util.regex.*;

public class Controller {
    @FXML
    private Button BotonIf;

    @FXML
    private Button BotonElse;

    @FXML
    private Button BotonSwitch;

    @FXML
    private Button botonVar;

    @FXML
    private TextArea cajaEjemplificador;

    @FXML
    private Button botonRun;

    @FXML
    private TextArea cajaComprobador;

    public String textoComprobador;
    public List<String> tokenPalabrasReservadas, tokenOperadoresLogicos,
            tokenOperadoresCondicionales, tokenTipoDato, tokenValorNumerico,
            tokenTexto, tokenSimboloAgrupacion;
    public boolean banderaTexto = false;
    public String datosTexto = " ";

    @FXML
    void correrCodigo(ActionEvent event) {
        textoComprobador = cajaComprobador.getText();
        String[] cadenas = textoComprobador.split("\n");
        String[][] vector = new String[cadenas.length][];
        for (int i = 0; i < cadenas.length; i++) {
            vector[i] = cadenas[i].split(" ");
            for (int j = 0; j < vector[i].length ; j++) {
                funcionIdentificar(vector[i][j], banderaTexto);
            }
        }
    }

    void funcionIdentificar(String input, Boolean bandera){
        Pattern pattern;
        //pattern = Pattern.compile();
        //if (input.equals()){

        //}
    }

    @FXML
    void ejemploElse(ActionEvent event) {
        cajaEjemplificador.setText("SiCondicional ( 10 == 10 ) {\n}\n SiContrario {\n}");
    }

    @FXML
    void ejemploIf(ActionEvent event) {
        cajaEjemplificador.setText("SiCondicional ( 10 == 10 ) {\n}");

    }

    @FXML
    void ejemploSwitch(ActionEvent event) {
        cajaEjemplificador.setText("Seleccion  ( variable )  {\nopcion 1(\n)\nopcion 2(\n)\n}");
    }

    @FXML
    void ejemploVar(ActionEvent event) {
        cajaEjemplificador.setText("Data entero variable ;\nData entero cantidad = 10 ;");
    }

}
