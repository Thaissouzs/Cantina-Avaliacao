package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Restricoes {

    private Parent root;
    private Stage tela;
    private Scene cena; 

    @FXML
    private Button btnEnviar;

    @FXML
    private RadioButton enfermagem;

    @FXML
    private RadioButton guia;

    @FXML
    private RadioButton informatica;

    @FXML
    private TextField nomeUsuario;

    @FXML
    private RadioButton primeiroAno;

    @FXML
    private TextArea restricaoAlimentar;

    @FXML
    private RadioButton segundoAno;

    @FXML
    private ToggleGroup serie;

    @FXML
    private RadioButton terceiroAno;

    @FXML
    private ToggleGroup turma;

    @FXML
    private Button voltarAvaliacao;

    @FXML
    private Button voltarCardapio;

    @FXML
    private Button voltarInicio;

    @FXML
    private Button voltarRodizio;

    Alert latido= new Alert(AlertType.NONE);


    private void abrirTela(ActionEvent evento, String arquivo, String css) throws Exception{
        // Coloca arquivo na memória para carregar
        root = FXMLLoader.load(getClass().getResource(arquivo));
        // Cria cena a partir do arquivo
        cena = new Scene(root);
        cena.getStylesheets().addAll(getClass().getResource(css).toString());
        // Define que a tela que será usada será a mesma da aplicação
        tela = (Stage)((Node)evento.getSource()).getScene().getWindow();
        // Define nova cena para a tela
        tela.setScene(cena);
        // Mostra a tela
        tela.show();
    }

    @FXML
    void enviarRelatorio(ActionEvent event) {
  
    if(nomeUsuario.getText().equals("") || !testarRadios() || restricaoAlimentar.getText().equals("") ){
        latido.setAlertType(AlertType.ERROR);
        latido.setTitle("DEU ERRO");
        latido.setHeaderText("Os requisitos não foram preenchidos corretamente");
        latido.show();
      
    }else{
        latido.setAlertType(AlertType.CONFIRMATION);
        latido.setTitle("DEU CERTO");
        latido.setHeaderText("Suas informações foram registradas:)");
        latido.show();
    }
    }

    private boolean testarRadios(){
        if(!informatica.isSelected() && !guia.isSelected() && !enfermagem.isSelected()){
            return false;
        }else if(!primeiroAno.isSelected() && !segundoAno.isSelected() && !terceiroAno.isSelected()){
            return false;
        }else{
            return true;
        }
    }
    
    @FXML
    void voltarParaAvaliacao(ActionEvent event) throws Exception{

        abrirTela(event, "Avaliacao.fxml", "Fundo.css");

    }

    @FXML
    void voltarParaCardapio(ActionEvent event) throws Exception{

        abrirTela(event, "Cardapio.fxml", "Fundo.css");

    }

    @FXML
    void voltarParaInicio(ActionEvent event) throws Exception{

        abrirTela(event, "Menu.fxml", "Fundo.css");

    }

    @FXML
    void voltarParaRodizio(ActionEvent event) throws Exception{

        abrirTela(event, "Rodizio.fxml", "Fundo.css");

    }

}
