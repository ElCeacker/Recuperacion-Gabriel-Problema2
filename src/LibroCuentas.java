import java.util.ArrayList;

public class LibroCuentas {
    private ArrayList<Gasto> gastos = new ArrayList<Gasto>();

    public void addGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public Gasto popGasto() {
        return gastos.remove(0);
    }

    public int size() {
        return gastos.size();
    }

    @Override
    public String toString() {
        return "gastos = " + gastos;
    }
}
