## OOP-Lab05-JavaFX&ExeptionHandling

### Object-Oriented Programming
**Lecturer:** Tran Thi Lan Anh, anhttl@soict.hust.edu.vn
**Lab 05:** GUI Programming with JavaFX and Exception Handling

**In this lab, you will practice with:**
* Use SceneBuilder to design a graphical user interface
* JavaFX containers: AnchorPane, BorderPane, GridPane, HBox, VBox, ...
* JavaFX data-driven UI: TableView, ListView, ...
* JavaFX property binding
* Switch scenes in JavaFX application

### 0 Assignment Submission
* For this lab class, you will have to turn in your work before 23h59, 07/06/2026.
* You should include your work on all sections of this lab, and push it to a branch called "release/lab05" of the valid repository.
* After completing all the exercises in the lab, you have to update the use case diagram and the class diagram of the AIMS project.
* Each student is expected to turn in his or her work and not give or receive unpermitted aid.
* Please write down answers for all questions into a text file named "answers.txt" and submit it within your repository.

### 1 Setup JavaFX for Eclipse
* Note: This instruction is for JDK versions after 1.8.
* **1.1 Install plugin for JavaFX:** Open Eclipse, choose Help -> Eclipse MarketPlace -> search e(fx)clipse and click Install.
* **1.2 Download JavaFX:** Go to https://gluonhq.com/products/javafx/, select SDK, download and extract it.
* **1.3 Add JavaFX to Eclipse:** Window -> Preferences -> User Libraries -> New -> "JavaFX". Add External JARs from the extracted "lib" folder.
* **1.4 Configuring Build Path and Arguments:** Run Configurations -> Arguments -> VM arguments. Add `-module-path "YOUR PATH\lib" --add-modules javafx.controls,javafx.fxml`.

### 2 Setup JavaFX Scene Builder for Eclipse
* JavaFX Scene Builder is a visual layout tool that lets users quickly design JavaFX application user interfaces, without coding.
* **2.1 The requires:** e(fx)clipse plugin is required.
* **2.2 Download JavaFX Scene Builder:** Download from Oracle and install.
* **2.3 Configuring Eclipse to use the Scene Builder:** Window -> Preferences -> JavaFX -> Point to the exe file position of JavaFX Scene Builder.

### 3 JavaFX API
* A stage represents the top-level container (window).
* The individual controls are contained in a scene.
* Steps to create the Painter app: Create FXML file, Create controller class, Create application class.
* **3.1 Create the FXML file:** Create "Painter.fxml" with BorderPane as root. Add VBox on the left and Pane in the center. Add a "Clear" Button.
* **3.2 Create the controller class:** Create `PainterController`. Add `@FXML` annotations and event handlers like `drawingAreaMouseDragged` and `clearButtonPressed`.
* **3.3 Create the application:** Create `Painter` extending `Application`. Load the FXML in the `start()` method and set the scene.
* **3.4 Practice exercise:** Improve app to draw on mouse down and add Eraser functionality using RadioButton and TitledPane.

### 4 Requirements of AIMS Customer Application
* View store: Customer can view all media in the store, play a media if it is DVD/CD and add a media to the cart.
* For cart: Customers can view the cart, see total cost, filter media, play, remove, and place an order.
* Create packages: `screen.customer`, `screen.customer.controller`, `screen.customer.view`.

### 5-8 Build View Store and Cart Screens
* **View Store:** Use VBox, HBox, and ScrollPane containing a GridPane. Create `Item.fxml` (AnchorPane root) for individual media items and load them dynamically in `ViewStoreController`.
* **Cart:** Use BorderPane. Top uses HBox, Center uses VBox with TableView, Bottom uses VBox. Use `PropertyValueFactory` to bind TableView columns to Media properties.
* **Switching Screens:** Use `FXMLLoader` to load the target FXML and set it to the current Stage's Scene.

### 9-14 Exception Handling and Finalization
* Review all methods in AimsProject to catch/handle/delegate runtime exceptions.
* Create `PlayerException` inheriting from `java.lang.Exception`.
* Throw `PlayerException` in the `play()` methods of DigitalVideoDisc, Track, and CompactDisc if length is non-positive.
* Update `Aims` class to handle exceptions generated when playing media.
* Modify `equals()` and `compareTo()` methods for the Media class.
* Draw an exception hierarchical tree for all self-defined exceptions.
