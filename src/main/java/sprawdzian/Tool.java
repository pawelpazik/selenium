package sprawdzian;

public class Tool {
    String toolType;

    public void useTool(){
        System.out.println("Uzyto: " + toolType);
    }

    public Tool(String toolType) {
        this.toolType = toolType;
    }

}
