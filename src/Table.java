import com.github.freva.asciitable.AsciiTable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Table {

    private List<String> options;

    public Table(List<String> options) {
        this.options = options;
    }

    public void drawTable() {
        String[][] data = new String[options.size() +1][options.size() +1];
        for (int i = 0, m = 1; i < options.size(); i++, m++, n++) {
            for (int j = 0; j < options.size(); j++) {
                data[m][j] = options.get(j);
            }
        }

        System.out.println(AsciiTable.getTable(data));
    }
}