import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button botaoLogin;

    @FXML
    private TextField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    void fazerlogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();

        if (usuario.equals("davillops") && senha.equals("12345")) {
            System.out.println("Fez o login com sucesso!");
        }
        else {
            System.out.println("Errou a senha!");
        }



    }

}
