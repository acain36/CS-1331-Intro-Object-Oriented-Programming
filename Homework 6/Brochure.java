import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
* This class creates a Stage with a Pane displaying an image and shapes.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-07
*/
public class Brochure extends Application {
    /**
    * This main method launches args.
    * @param args is a array of arguments for main class
    */
    public static void main(String[] args) {
        launch(args);
    }

    /**
    * This method createsa stage with different aspects including pictures and shapes.
    * @param primaryStage is the stage for the display
    */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TravelBrochure");
        //Creating a Stack Pane
        Pane myPane = new Pane();

        //Adding a Rectangle Shape
        Rectangle rectangle = new Rectangle(285, 0, 200, 25);
        rectangle.setFill(Color.BLUE);

        //Adding the Text
        Text text1 = new Text(315, 17, "WELCOME TO OOP-TOPIA!");
        text1.setFill(Color.WHITE);

        //Adding the Image
        Image theImage = new Image ("myImage.png");
        ImageView iv = new ImageView();
        iv.setX(140);
        iv.setY(100);
        iv.setImage(theImage);

        //Adding Description
        Text caption = new Text(250, 400, "Pictured: Ooptopia, Here you can learn lots of coding!");
        caption.setFill(Color.BLACK);

        //Adding a Circle to the Left of the Image
        Circle circle = new Circle(75, 225, 30);
        circle.setFill(Color.AQUA);

        //Adding an Ellipse to the Left of the Image
        Circle circle2 = new Circle(725, 225, 30);
        circle2.setFill(Color.CORNFLOWERBLUE);

        //Adding the image to the pane
        myPane.getChildren().add(iv);
        myPane.getChildren().add(rectangle);
        myPane.getChildren().add(text1);
        myPane.getChildren().add(caption);
        myPane.getChildren().add(circle);
        myPane.getChildren().add(circle2);


        //Showing the things
        primaryStage.setScene(new Scene(myPane, 800, 500));
        primaryStage.show();

    }
}