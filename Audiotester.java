
import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
public class Audiotester extends Application {
  Button leftbutton;
    Button rightbutton;
  int height = 500;
  int width = 500;

String leftaudiopath = "channelleft.wav";
Media leftsound = new Media(new File(leftaudiopath).toURI().toString());
MediaPlayer leftPlayer = new MediaPlayer(leftsound);

String rightaudiopath = "channelright.wav";
Media rightsound = new Media(new File(rightaudiopath).toURI().toString());
MediaPlayer rightPlayer = new MediaPlayer(rightsound);
ImageView smiley = new ImageView("smileyface.png");
    public static void main(String[] args){
   

  
    
    launch(args);  // System.out.println("Hello, World!");
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("AudioTester Java");
        
        leftbutton = new Button();
        leftbutton.setText("Left Channel");
        rightbutton = new Button();
        rightbutton.setText("Right Channel");
        leftbutton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0){
                leftPlayer.seek(Duration.ZERO);
                
               leftPlayer.play(); 
            }
           
        });




        rightbutton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0){
                rightPlayer.seek(Duration.ZERO);
                rightPlayer.play();
            }
        });
        BorderPane layout = new BorderPane();
        layout.setLeft(leftbutton);
        layout.setRight(rightbutton);
    //    layout.getChildren().add(button);
    leftbutton.setMaxHeight(height + 10);
    rightbutton.setMaxHeight(height + 10);

        layout.setCenter(smiley);

        Scene scene = new Scene(layout, width, height);
        primaryStage.setScene(scene);
        primaryStage.show();



      
    }





}











