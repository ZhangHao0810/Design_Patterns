/* Generated by Together */

package ObserverPattern.src.javautil;

import java.util.Observable;
public class ConcreteObservable extends Observable {
    private String name;
    public String getName(){
            return name;
    }

    public void setName(String name){
        this.name=name;
        //���ñ仯��
        setChanged();
        notifyObservers(name);
    }
}