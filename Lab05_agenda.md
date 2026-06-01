## Lab05_agenda

### Lab05: GUI Programming with JavaFX
**In this lab, you will practice with:**
* Use SceneBuilder to design a graphical user interface
* JavaFX containers: AnchorPane, BorderPane, GridPane, HBox, VBox, ...
* JavaFX data-driven UI: TableView, ListView, ...
* JavaFX property binding
* Switch scenes in JavaFX application

### Introduction to JavaFX
* Written in Java - The JavaFX library is written in Java and is available for the languages that can be executed on a JVM.
* FXML - JavaFX features a language known as FXML, which is a HTML like declarative markup language to define a user Interface.
* Scene Builder - A drag and drop design interface used to develop FXML applications.
* Built-in UI controls - JavaFX library caters UI controls to develop a full-featured application.
* CSS like Styling - JavaFX provides CSS like styling to improve application design.

### JavaFX Application Architecture & Lifecycle
* JavaFX uses the metaphor of a theater. A stage represents the top-level container (window).
* The individual controls are contained in a scene, represented in a hierarchical scene graph of nodes.
* Lifecycle methods: `init()`, `start()`, `stop()`.
* `init()`: An instance of the application class is created and method is called.
* `start()`: Called after init.
* `stop()`: The launcher waits for the application to finish and calls the stop() method.

### Exceptions
* An exception is an event that occurs in the execution of a program and breaks the expected flow.
* Scenarios: User entered invalid data, file cannot be found, network connection lost, or JVM out of memory.

### Assignments and Deadline

| Task | Section |
|---|---|
| Setup JavaFx and Scene Builder | Section 1+2 |
| GUI Painter App | 3.1 |
| Painter Controller | 3.2 |
| Painter application | 3.3 |
| Improve Painter application | 3.4 |
| Create packages for AIMS customer application | 4 |
| Design Store.fxml | 5.1 |
| Design Item.fxml, code ItemController.java | 5.2 |
| Code ViewStoreController.java | 5.3 |
| Code TestViewStoreScreen.java | 5.4 |
| Design Cart.fxml & Code CartController.java | 6 |
| Complete AIMS GUI app | 8 |
| Handle exception | 9+10+11 |
| Override equals & compareTo | 12 |
| Draw exception hierarchy tree | 14 |

**Deadline:** 23:59 - 07/06/2026
