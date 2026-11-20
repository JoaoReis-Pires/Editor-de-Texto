import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private final Editor editor;
    private final Deque<Memento> mementos;


    public Caretaker(Editor editor) {
        this.editor = editor;
        this.mementos = new ArrayDeque<>();
    }

    public void backup(){
        Memento m = editor.saveState();
        mementos.push(m);
        System.out.println("Backup realizado!\n");
    }

    public void restore(){
        if(mementos.isEmpty()){
            System.out.println("Nenhum backup disponível.");
            return;
        }

        Memento m = mementos.pop();
        editor.restore(m);
        System.out.println("Estado restaurado!\n");
    }
}
