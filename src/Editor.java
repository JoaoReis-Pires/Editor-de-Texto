public class Editor {
    private String texto = "";

    public void escrever(String novoTexto){
        this.texto = novoTexto;
    }

    public String getTexto(){
        return texto;
    }

    public Memento saveState(){
        return new ConcreteMemento(texto);
    }

    public void restore(Memento m){
        if(!(m instanceof ConcreteMemento)){
            throw new IllegalArgumentException("Memento inválido");
        }

        ConcreteMemento cm = (ConcreteMemento) m;
        this.texto = cm.getState();
    }
}
