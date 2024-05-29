package com.example.ontrack2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskSubmissionTest {

    @Test
    public void testSubmitTask() {
        TaskService taskService = new TaskService();
        String response = taskService.submitTask("student123", "This is my task", "taskfile.pdf");
        assertEquals("Task submitted successfully", response);
    }
}
