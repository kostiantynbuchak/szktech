package pl.edu.wsiz.lab3;

import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    @FXML
    private TableColumn col_imie;
    @FXML
    private TableColumn col_nazwisko;
    @FXML
    private TableView tabela;
    @FXML
    private TextField textFieldImie;
    @FXML
    private TextField textFieldNazwisko;
    @FXML
    private Button Dodaj;

    ObservableList<Osoba> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        col_imie.setCellValueFactory(
                new PropertyValueFactory<>("imie"));
        col_nazwisko.setCellValueFactory(
                new PropertyValueFactory<>("nazwisko"));

        lista.add(new Osoba("Adam", "Nowak"));
        lista.add(new Osoba("Piotr", "Kowalski"));
        lista.add(new Osoba("Katarzyna", "Biegacz"));

        tabela.setItems(lista);

        TableView.TableViewSelectionModel<Osoba> selectionModel = tabela.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.SINGLE);// Może być multiple
        ObservableList<Osoba>selectedItems =
                selectionModel.getSelectedItems();

        selectedItems.addListener(
                new ListChangeListener<Osoba>(){
                    @Override
                    public void onChanged(
                            Change<? extends Osoba> change){
                        Osoba os=change.getList().get(0);
                    }
                }
        );
    }

    @FXML
    public void dodajOsobe(){
        String imie = textFieldImie.getText();
        String nazwisko = textFieldNazwisko.getText();

        lista.add(new Osoba(imie, nazwisko));

        textFieldImie.clear();
        textFieldNazwisko.clear();
    }
}
