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
import model.Comida;

public class Cardapio implements Initializable {

    private Parent root;
    private Stage tela;
    private Scene cena; 

    @FXML
    private Button btnAvaliacao;

    @FXML
    private Button btnQuarta;

    @FXML
    private Button btnQuinta;

    @FXML
    private Button btnRestricoes;

    @FXML
    private Button btnRodizio;

    @FXML
    private Button btnSegunda;

    @FXML
    private Button btnSexta;

    @FXML
    private Button btnTerca;

    @FXML
    private Button btnVoltar;

    @FXML
    private TableColumn<Comida, String> lancheManha;

    @FXML
    private TableColumn<Comida, String> lancheTarde;

    @FXML
    private TableColumn<Comida, String> almoco;

    @FXML
    private TableView<Comida> tabela;

    


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
       lancheManha.setCellValueFactory(new PropertyValueFactory<>("lancheManha"));
       almoco.setCellValueFactory(new PropertyValueFactory<>("almoco"));
       lancheTarde.setCellValueFactory(new PropertyValueFactory<>("lancheTarde"));
       tabela.setItems(criarLista());
    }
    private ObservableList<Comida> criarLista(){
        return FXCollections.observableArrayList(
            new Comida("", "", "" )
        );
    }






    @FXML
    void VoltarParaMenu(ActionEvent event) throws Exception{

        abrirTela(event, "Menu.fxml", "Fundo.css");

    }

    @FXML
    void mostrarCardapioSegunda(ActionEvent event) {
        tabela.getItems().clear();
        tabela.setItems(FXCollections.observableArrayList(
            new Comida("Caldo de carne e torradas", "Fricassê, Arroz,feijão,farofa,salada refogada e doce", "Café com biscoito e melancia" )
        ));

    }
    @FXML
    void VoltarParaAvaliacao(ActionEvent event) throws Exception{

        abrirTela(event, "Avaliacao.fxml", "Fundo.css");

    }
    @FXML
    void VoltarParaRestricoes(ActionEvent event) throws Exception{

        abrirTela(event, "Restricoes.fxml", "Fundo.css");

    }

    @FXML
    void VoltarParaRodizio(ActionEvent event) throws Exception{

        abrirTela(event, "Rodizio.fxml", "Fundo.css");

    }
    @FXML
    void mostrarCardapioQuarta(ActionEvent event) {

        tabela.getItems().clear();
        tabela.setItems(FXCollections.observableArrayList(
            new Comida("café com leite e pão doce", "Isca de frango, baião, purê, salada cozida e suco", "café e cuscuz com frango" )
        ));

    }

    @FXML
    void mostrarCardapioQuinta(ActionEvent event) {

        tabela.getItems().clear();
        tabela.setItems(FXCollections.observableArrayList(
            new Comida("Suco e cuscuz com ovo", "Picadinho de carne, arroz, feijão, pirão, salada crua", "Suco de fruta e bolo" )
        ));

    }

    @FXML
    void mostrarCardapioSexta(ActionEvent event) {

        tabela.getItems().clear();
        tabela.setItems(FXCollections.observableArrayList(
            new Comida("café e pão com patê de frango", " Feijoada, salada crua, arroz, farofa, e suco", "suco com bolacha doce" )
        ));

    }

    @FXML
    void mostrarCardapioTerca(ActionEvent event) {

        tabela.getItems().clear();
        tabela.setItems(FXCollections.observableArrayList(
            new Comida("Suco e cuscuz com frango", "Estrogonofe de carne, arroz, feijão, macarrão, salada crua", "suco com pão com margarina" )
        ));

    }
}
