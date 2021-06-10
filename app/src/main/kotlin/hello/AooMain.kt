package hello

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.Parent
import javafx.fxml.FXMLLoader

class AppMain: Application() {
    override fun start(stage: Stage) {
        val vname =    String.format("/%s.fxml", this.javaClass.canonicalName.replace(".", "/"))
        val fxml = this.javaClass.getResource(vname)
        val root = FXMLLoader.load<Parent>(fxml)

        stage.scene = Scene(root)
        stage.title = "Hello"
        stage.width = 800.0
        stage.height = 600.0
        stage.show()        
    }
}