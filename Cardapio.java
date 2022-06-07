package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class Cardapio {

    private Parent root;
    private Stage tela;
    private Scene cena; 

    @FXML
    private Button btnQuarta;

    @FXML
    private Button btnQuinta;

    @FXML
    private Button btnSegunda;

    @FXML
    private Button btnSexta;

    @FXML
    private Button btnTerca;

    @FXML
    private Button btnVoltar;

    @FXML
    private TableView<?> tabela;

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
    void VoltarParaMenu(ActionEvent event) throws Exception{

        abrirTela(event, "Menu.fxml", "Fundo.css");

    }

    @FXML
    void mostrarCardapioSegunda(ActionEvent event) {
    }

}
