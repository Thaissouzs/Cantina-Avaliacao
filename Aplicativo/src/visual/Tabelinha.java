/*
package visual;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Usuario;

public class Tabelinha implements Initializable{

    @FXML
    private TableColumn<Usuario, Integer> id;

    @FXML
    private TableColumn<Usuario, String> nome;

    @FXML
    private TableColumn<Usuario, String> senha;

    @FXML
    private TableView<Usuario> tabela;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       id.setCellValueFactory(new PropertyValueFactory<>("id"));
       nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
       senha.setCellValueFactory(new PropertyValueFactory<>("senha"));
       tabela.setItems(criarLista());
    }
    private ObservableList<Usuario> criarLista(){
        return FXCollections.observableArrayList(
            new Usuario(36,"Ruan","123456"),
            new Usuario(15,"João Victor","+d8k"),
            new Usuario(8,"Emanuel","Sempre amei o guia")
        );
    }

}
*/