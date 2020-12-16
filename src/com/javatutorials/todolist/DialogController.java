package com.javatutorials.todolist;

import com.javatutorials.todolist.datamodel.ToDoData;
import com.javatutorials.todolist.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescription;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public ToDoItem processResults(){
        String shortDescriptionText = shortDescription.getText().trim();
        String details = detailsArea.getText().trim();
        LocalDate deadlineValue = deadlinePicker.getValue();

        ToDoItem newItem = new ToDoItem(shortDescriptionText, details, deadlineValue);
        ToDoData.getInstance().addToDoItems(newItem);
        return newItem;
    }
}
