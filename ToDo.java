class ToDo {
    //Attributes
    String task;
    boolean status;

    //Constructor
    public ToDo(String task){ 
        this.task = task;
        this.status = false;
    }

    //Methods
    public void setTask(String task){
        this.task = task;
    }

    public String getTask(){
        return this.task;
    }   

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void markDoneStatus(){
        this.status = true;
    }

    public void markUndoneStatus(){
        this.status = false;
    }

    @Override
    public String toString() {
        return "Task: " + task + "\nStatus: " + status + "\n"; //Prints the whole information of the task
    }
}