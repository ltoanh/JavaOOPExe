package view;

import java.util.List;

/**
 *
 * @author whiwf
 */
public interface View {
    <T> void addTo(T t);
    <T> void showData(List<T> ls);
}
