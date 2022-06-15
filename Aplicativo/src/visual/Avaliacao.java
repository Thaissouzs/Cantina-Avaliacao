package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Avaliacao {

    private Parent root;
    private Stage tela;
    private Scene cena; 

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnEnviar1;

    @FXML
    private Button btnEnviar2;

    @FXML
    private Button btnEnviar3;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextArea campoDeTexto;

    Alert msg = new Alert(AlertType.NONE);

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
    void enviarInformação(ActionEvent event) {
        if(campoDeTexto.getText().equals("")){
            msg.setAlertType(AlertType.ERROR);
            msg.setTitle("DEU ERRO");
            msg.setHeaderText("Os requisitos não foram preenchidos corretamente");
            msg.show();
        }else{
            msg.setAlertType(AlertType.CONFIRMATION);
            msg.setHeaderText("Sua avaliação foi resistrada");
            msg.show();
        }
        

    }

    @FXML
    void irParaCardapio(ActionEvent event) throws Exception{

        abrirTela(event, "Cardapio.fxml", "Fundo.css");

    }

    @FXML
    void irParaRestricoes(ActionEvent event) throws Exception{

        abrirTela(event, "Restricoes.fxml", "Fundo.css");

    }

    @FXML
    void irParaRodizio(ActionEvent event) throws Exception{

        abrirTela(event, "Rodizio.fxml", "Fundo.css");

    }

    @FXML
    void voltarParaMenu(ActionEvent event) throws Exception{

        abrirTela(event, "Menu.fxml", "Fundo.css");

    }

}
