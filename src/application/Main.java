package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Crear una imagen
            Image img = new Image("file:C://workspaceJavaPormi//funnyminds//src//resources//images/logo-funny-minds.png");
            ImageView imgView = new ImageView(img);
            imgView.getStyleClass().add("imagen-estilo");
            
            // Crear un VBox como contenedor principal
            VBox root = new VBox();
            root.getStyleClass().add("contenedor-estilo");
            
            // Crear un botón
            Button button = new Button("JUEGA");
            button.getStyleClass().add("button-estilo");
            
            // Agregar la imagen y el botón al VBox
            root.getChildren().addAll(imgView, button);
            
            // Crear una escena con el VBox y establecer el tamaño
            Scene scene = new Scene(root, 400, 400);
            
            // Aplicar estilos personalizados al VBox y al botón
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            
            // Agregar la escena al Stage principal
            primaryStage.setScene(scene);
            
            // Mostrar la ventana principal
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
