package sprawdzian;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Worker {

    public static void main(String[] args) {
        Tool tool = new Tool("łopatka");
        tool.useTool();

        List<Tool> narzedzia = new ArrayList<>();
        narzedzia.add(new Tool("Młoteczek"));
        narzedzia.add(new Tool("Wiertareczka"));
        narzedzia.add(new Tool("Śrubokręcik"));
        narzedzia.add(new Tool("Obcążki"));
        narzedzia.add(new Tool("Imbusik"));


        for(Tool t: narzedzia){
            t.useTool();
        }
    }
}
