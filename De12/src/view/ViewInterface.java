package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author whiwf
 */
public interface ViewInterface {
    public<T> void addToList(T t, List<T> ls);
    public<T> void showData(List<T> ls, DefaultTableModel md);
}
