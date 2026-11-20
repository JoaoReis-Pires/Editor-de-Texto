
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Caretaker historico = new Caretaker(editor);

        editor.escrever("Olá");
        historico.backup();

        editor.escrever("Olá Mundo");
        historico.backup();

        editor.escrever("Olá, mundo! Estou estudando Memento.");
        System.out.println("Texto atual: " + editor.getTexto());

        historico.restore();
        System.out.println("Texto antigo:" + editor.getTexto());

        historico.restore();
        System.out.println("Texto mais antigo ainda: " + editor.getTexto());
    }
}