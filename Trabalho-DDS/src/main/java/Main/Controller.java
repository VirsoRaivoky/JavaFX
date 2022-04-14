package Main;

import User.User;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Button;
public class Controller {
    @FXML
    private TableColumn<User, String> c_nome;

    @FXML
    private TableColumn<User, String> c_sNome;

    @FXML
    private TableColumn<User, String> c_nC;

    @FXML
    private TableView<User> tabela;

    @FXML
    private Button b_bt;

}


