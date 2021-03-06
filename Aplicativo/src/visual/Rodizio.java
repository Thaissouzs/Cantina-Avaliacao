package visual;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Salas;

public class Rodizio implements Initializable {

    private Parent root;
    private Stage tela;
    private Scene cena; 

    @FXML
    private Button btnAvaliacao;

    @FXML
    private Button btnCardapio;

    @FXML
    private Button btnRestricao;

     @FXML
    private Button btnvoltar;

    @FXML
    private TableColumn<Salas, String> quarta;

    @FXML
    private TableColumn<Salas, String> quinta;

    @FXML
    private TableColumn<Salas, String> segunda;

    @FXML
    private TableColumn<Salas, String> sexta;

    @FXML
    private TableColumn<Salas, String> terca;

    @FXML
    private TableView<Salas> tabela;    

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       segunda.setCellValueFactory(new PropertyValueFactory<>("segunda"));
       terca.setCellValueFactory(new PropertyValueFactory<>("terca"));
       quarta.setCellValueFactory(new PropertyValueFactory<>("quarta"));
       quinta.setCellValueFactory(new PropertyValueFactory<>("quinta"));
       sexta.setCellValueFactory(new PropertyValueFactory<>("sexta"));
       tabela.setItems(criarLista());
    }
    private ObservableList<Salas> criarLista(){
        return FXCollections.observableArrayList(
            new Salas("1 Enfer", "2 Infor", "3 Guia", "1 Guia", "2 Guia" ),
            new Salas("1 Guia", "2 Enfer", "3 Infor", "1 Infor", "2 Infor"),
            new Salas("1 Infor", "2 Guia", "3 Enfer", "1 Enfer", "2 Enfer"),
            new Salas("2 Enfer", "3 Infor", "1 Guia", "2 Guia", "1 Guia" ),
            new Salas("2 Guia", "3 Enfer", "1 Infor", "2 Infor", "1 Infor"),
            new Salas("2 Infor", "3 Guia", "1 Enfer", "2 Enfer", "1 Enfer" ),
            new Salas("3 Enfer", "1 Infor", "2 Guia", "3 Guia", "3 Guia"),
            new Salas("3 Guia", "1 Enfer", "2 Infor", "3 Infor", "3 Infor" ),
            new Salas("3 Infor", "1 Guia", "2 Enfer", "3 Enfer", "3 Enfer")
        );
    }

    @FXML
    void voltarMenu(ActionEvent event) throws Exception{

        abrirTela(event, "Menu.fxml", "Fundo.css");

    }
    @FXML
    void voltarAvaliacao(ActionEvent event) throws Exception{

        abrirTela(event, "Avaliacao.fxml", "Fundo.css");

    }
    @FXML
    void voltarCardapio(ActionEvent event) throws Exception{

        abrirTela(event, "Cardapio.fxml", "Fundo.css");

    }

    @FXML
    void voltarRestricao(ActionEvent event) throws Exception{

        abrirTela(event, "Restricoes.fxml", "Fundo.css");

    }

}
