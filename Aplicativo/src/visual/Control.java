package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Control { 
    private Parent root;
    private Stage tela;
    private Scene cena;

    @FXML
    private Button btnAvaliação;

    @FXML
    private Button btnCardapio;

    @FXML
    private Button btnRestricoes;

    @FXML
    private Button btnRodizio;

    @FXML
    private AnchorPane fundo;

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
    void abrirAvaliacao(ActionEvent event) throws Exception {

        abrirTela(event,  "Avaliacao.fxml", "Fundo.css");

    }

    @FXML
    void abrirCardapio(ActionEvent event) throws Exception {

        abrirTela(event,  "Cardapio.fxml", "Fundo.css");
    }

    @FXML
    void abrirRestricoes(ActionEvent event) throws Exception {

        abrirTela(event,  "Restricoes.fxml", "Fundo.css");
    }

    @FXML
    void abrirRodizio(ActionEvent event) throws Exception {
        abrirTela(event,  "Rodizio.fxml", "Fundo.css");
    }

}
