package dominio;

import java.util.Observable;
import java.util.Observer;

public class Contador extends Observable {
    int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor > 99) {
            this.valor = 0;
        }
        else if (valor < 0) {
            this.valor = 99;
        }
        else {
            this.valor = valor;
        }
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }
    
    
    @Override
    public String toString() {
        return Integer.toString(this.valor);
    }
    
    
}
