public class Task {
    private static int count;
    private String taskId;
    private String taskName;
    private String status;


    Task(String taskName, String status){
        setTaskId("TASK_" + count++);
        setTaskName(taskName);
        setStatus(status);
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String toString(){
        return "Task Id: " + getTaskId() + " Task Name: " + getTaskName() + " Task Status " + getStatus();
    }
}
