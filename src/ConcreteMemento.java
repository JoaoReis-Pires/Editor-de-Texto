import java.time.LocalDateTime;

public class ConcreteMemento implements Memento{
    private final String state;
    private final LocalDateTime date;

    ConcreteMemento(String state){
        this.state = state;
        this.date = LocalDateTime.now();
    }

    String getState(){
        return state;
    }

    @Override
    public String getName() {
        return "Backup do Editor";
    }

    @Override
    public String getDate() {
        return date.toString();
    }
}
