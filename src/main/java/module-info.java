module br.com.letcode.java.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.letcode.java.helloworld to javafx.fxml;
    exports br.com.letcode.java.helloworld;
}