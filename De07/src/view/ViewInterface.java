package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author whiwf
 */
public interface ViewInterface {
    public<T> void addTo(T t);
    public<T> void showData(List<T> ls, DefaultTableModel md);
}
