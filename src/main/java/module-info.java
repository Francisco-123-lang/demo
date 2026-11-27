module com.vv.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;

    exports com.vv.demo.ejemplo1;
    exports com.vv.demo.ejemplo2;
    exports com.vv.demo.ejemplo3;
    exports com.vv.demo.ejemplo4;
    exports com.vv.demo.ejemplo5;
    exports com.vv.demo.ejemplo6;

    opens com.vv.demo.ejemplo1 to javafx.fxml;
    opens com.vv.demo.ejemplo2 to javafx.fxml;
    opens com.vv.demo.ejemplo3 to javafx.fxml;
    opens com.vv.demo.ejemplo4 to javafx.fxml;
    opens com.vv.demo.ejemplo5 to javafx.fxml;
    opens com.vv.demo.ejemplo6 to javafx.fxml;
}