package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main extends Application {

    Scene scene1, scene2, scene3,scene4,scene5,scene6,scene7;
    TextField input;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        /*Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image imagecat = new Image("billeder/autismcat.png");
        ImageView imageView1 = new ImageView(imagecat);
        imageView1.setFitHeight(400);
        imageView1.setFitWidth(350);
        pane.getChildren().add(imageView1);

        Image imagebasedPepe = new Image("billeder/BASEDpepe.png");
        ImageView imageView2 = new ImageView(imagebasedPepe);

        Button button = new Button("Click me for new image");
        button.setOnAction(this);

        HBox hbox1 = new HBox();
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView2,hbox1);
        HBox root1 = new HBox();
        root1.getChildren().add(stackPane);

        Scene scene = new Scene(pane);
*/

        //Images
        Image imagecat = new Image("billeder/autismcat.png");
        ImageView imageView1 = new ImageView(imagecat);
        imageView1.setFitHeight(400);
        imageView1.setFitWidth(350);

        Image imagebasedPepe = new Image("billeder/BASEDpepe.png");
        ImageView imageView2 = new ImageView(imagebasedPepe);
        imageView2.setFitHeight(400);
        imageView2.setFitWidth(350);

        Image girlshere = new Image("billeder/girlshere.jpg");
        ImageView imageView3 = new ImageView(girlshere);
        imageView3.setFitHeight(400);
        imageView3.setFitWidth(350);

        Image obunga = new Image("billeder/obunga.jpg");
        ImageView imageView4 = new ImageView(obunga);
        imageView4.setFitHeight(400);
        imageView4.setFitWidth(350);

        Image praise = new Image("billeder/praise.jpg");
        ImageView imageView5 = new ImageView(praise);
        imageView5.setFitHeight(400);
        imageView5.setFitWidth(350);

        Image yep = new Image("billeder/yep.jpg");
        ImageView imageView6 = new ImageView(yep);
        imageView6.setFitHeight(400);
        imageView6.setFitWidth(350);

        Image dogegaming = new Image("https://i.imgur.com/yXovcc3.png");
        ImageView imageView7 = new ImageView(dogegaming);
        imageView6.setFitHeight(400);
        imageView6.setFitWidth(350);


        //File

        TextField input = new TextField();
        Button buttonFile = new Button("What do you think of this meme?");
        //buttonFile.setOnAction(e -> System.out.println(input.getText()));
        buttonFile.setAlignment(Pos.BOTTOM_CENTER);
        buttonFile.setOnAction(e -> {
            System.out.println("Clicked");
            System.out.println(input.getText());
            File file = new File("Tekstfil.txt");
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        //java.io.File Data = new java.io.File("Data.txt");
        //java.io.PrintWriter output = new java.io.PrintWriter(f);

        HBox hBoxFile = new HBox();
        hBoxFile.getChildren().addAll(input,buttonFile);
        hBoxFile.setAlignment(Pos.BOTTOM_CENTER);

        StackPane filePane = new StackPane();
        filePane.getChildren().addAll(hBoxFile);


        // 1
        Button button1 = new Button("Click me for a new meme");
        button1.setOnAction(e -> primaryStage.setScene(scene2));
        button1.setAlignment(Pos.TOP_CENTER);

        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(button1,filePane);
        hBox1.setAlignment(Pos.TOP_CENTER);


        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(imageView1,hBox1);
        Scene scene1 = new Scene(layout1, 500, 500);

        // 2
        Button button2 = new Button("Click me for a new meme");
        button2.setOnAction(e -> primaryStage.setScene(scene3));

        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(button2);
        hBox2.setAlignment(Pos.TOP_CENTER);

        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(hBox2,imageView2);
        scene2 = new Scene(layout2,500,500);

        //3
        Button button3 = new Button("Click me for a new meme");
        button3.setOnAction(e -> primaryStage.setScene(scene4));

        HBox hBox3 = new HBox();
        hBox3.getChildren().addAll(button3);
        hBox3.setAlignment(Pos.TOP_CENTER);

        StackPane layout3 = new StackPane();
        layout3.getChildren().addAll(imageView3,hBox3);
        scene3 = new Scene(layout3, 500, 500);

        //4
        Button button4 = new Button("Click me for a new meme");
        button4.setOnAction(e -> primaryStage.setScene(scene5));

        HBox hBox4 = new HBox();
        hBox4.getChildren().addAll(button4);
        hBox4.setAlignment(Pos.TOP_CENTER);

        StackPane layout4 = new StackPane();
        layout4.getChildren().addAll(imageView4,hBox4);
        scene4 = new Scene(layout4, 500, 500);

        //5
        Button button5 = new Button("Click me for a new meme");
        button5.setOnAction(e -> primaryStage.setScene(scene6));

        HBox hBox5 = new HBox();
        hBox5.getChildren().addAll(button5);
        hBox5.setAlignment(Pos.TOP_CENTER);

        StackPane layout5 = new StackPane();
        layout5.getChildren().addAll(imageView5,hBox5);
        scene5 = new Scene(layout5, 500, 500);

        //6
        Button button6 = new Button("Click me for a new meme");
        button6.setOnAction(e -> primaryStage.setScene(scene7));

        HBox hBox6 = new HBox();
        hBox6.getChildren().addAll(button6);
        hBox6.setAlignment(Pos.TOP_CENTER);

        StackPane layout6 = new StackPane();
        layout6.getChildren().addAll(imageView6,hBox6);
        scene6 = new Scene(layout6, 500, 500);

        //7
        Button button7 = new Button("Click me for a new meme");
        button7.setOnAction(e -> primaryStage.setScene(scene1));

        HBox hBox7 = new HBox();
        hBox7.getChildren().addAll(button7);
        hBox7.setAlignment(Pos.TOP_CENTER);

        StackPane layout7 = new StackPane();
        layout7.getChildren().addAll(imageView7,hBox7);
        scene7 = new Scene(layout7, 600, 600);

        //primaryStage
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Memer");
        primaryStage.show();


    }

    public void handle() {
        System.out.println("Clicked");
        System.out.println(input.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
