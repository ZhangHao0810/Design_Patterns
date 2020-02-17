package 组合模式.component;

abstract class Component {
    public abstract void operation();
    public void add(Component c) {
	throw new UnsupportedOperationException();
    }
    public void remove(Component c) {
	throw new UnsupportedOperationException();
    }
    public Component getChild(int i) {
	throw new UnsupportedOperationException();
    }
}




