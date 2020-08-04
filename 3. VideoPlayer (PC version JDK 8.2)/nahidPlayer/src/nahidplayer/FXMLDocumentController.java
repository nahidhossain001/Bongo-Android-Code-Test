/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nahidplayer;

import java.util.*;
import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;


/**
 *
 * @author NaHiD
 */
public class FXMLDocumentController implements Initializable {
    
    
    private MediaPlayer mediaPlayer;
    
    @FXML   //create playbutten referance variable 
    private MediaView mediaView;
    
    private String filePath;
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    
    
    @FXML
    private Slider slider;  //volume slider object
    
    @FXML
    private Slider seeSlider; // seekslider obj
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        
        //open file
        FileChooser fileChooser=new FileChooser();
        FileChooser.ExtensionFilter filter=new FileChooser.ExtensionFilter("Select a File (*.mp4)", "*.mp4");
            fileChooser.getExtensionFilters().add(filter);
            File file= fileChooser.showOpenDialog(null);
            filePath = file.toURI().toString();

            //create media object
            if(filePath !=null){
                Media media =new Media(filePath);
                mediaPlayer =new MediaPlayer(media);
                mediaView.setMediaPlayer(mediaPlayer);
                    DoubleProperty width =mediaView.fitWidthProperty();
                    DoubleProperty hight = mediaView.fitHeightProperty();
                    
                    width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
                    hight.bind(Bindings.selectDouble(mediaView.sceneProperty(), "hight"));
                    
                    //volume slider 
                    
                    slider.setValue(mediaPlayer.getVolume()*100);
                    slider.valueProperty().addListener(new InvalidationListener() {
                    @Override
                    public void invalidated(Observable observable) {
                        mediaPlayer.setVolume(slider.getValue()/100);
                        
                   }
                });
                    
                   mediaPlayer.currentTimeProperty().addListener(new ChangeListener<javafx.util.Duration>() {
                    @Override
                    public void changed(ObservableValue<? extends javafx.util.Duration> observable, javafx.util.Duration oldValue, javafx.util.Duration newValue) {
                        seeSlider.setValue(newValue.toSeconds());
                        
                    }
                });
                  
                   seeSlider.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                       
                        mediaPlayer.seek(javafx.util.Duration.seconds(seeSlider.getValue()));
                    }
                });
                   
                   
                   
                mediaPlayer.play();
            }
    }
    
    
    @FXML
    private void pauseVideo(ActionEvent event){
        mediaPlayer.pause();
        
    }
    
    
     @FXML
    private void playVideo(ActionEvent event){
        
        mediaPlayer.play();
        mediaPlayer.setRate(1);
    }
    
     @FXML
    private void stopVideo(ActionEvent event){
        
        mediaPlayer.stop();
    }
    
     @FXML
    private void fastVideo(ActionEvent event){
        
        mediaPlayer.setRate(1.5);
    }
    
    
     @FXML
    private void fasterVideo(ActionEvent event){
        mediaPlayer.setRate(2);
        
    }
    
     @FXML
    private void slowVideo(ActionEvent event){
        mediaPlayer.setRate(.75);
        
    }
    
     @FXML
    private void slowerVideo(ActionEvent event){
        mediaPlayer.setRate(.5);
        
    }
    
    @FXML
    private void normalVideo(ActionEvent event){
        mediaPlayer.setRate(1);
        
    }
    
    
     @FXML
    private void exitVideo(ActionEvent event){
        System.exit(0);
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private static class ChangeListenerImpl implements ChangeListener<Duration> {

        public ChangeListenerImpl() {
        }

        @Override
        public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
