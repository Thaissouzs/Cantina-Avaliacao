package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    private RadioButton terceiroAno;

    @FXML
    private Button voltarMenu;

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

    }

    @FXML
    void voltarParaMenu(ActionEvent event) throws Exception{

        abrirTela(event, "Menu.fxml", "Fundo.css");

    }

}
