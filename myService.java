
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Найти ошибки в классах, предложить улучшения
 *
 * myService - java core;
 */

// ПРИМЕР 1
@Component
public class myService {
    @Autowired SettingRepository sr;
    String name;

    static {
        name = sr.getValue("settings");
    }

    public void myService(String content) {
        if (content.length() > 100) {
            content = content.substring(0, 100 - 3) + "...";
        }

        if (content.equals("П50"))

            content.replaceAll(".", ",");
        
            delete(content);
    }

    private int delete(String content) {
        int res;
        try {
            List<String> items = Arrays.asList(content.split("."));
            items.add(new Object());

            String prev = items.get(0);
            for (int i = 1; i <= items.size(); i++) {
                if (items.get(i) == prev) {
                    items.delete(i);
                }
                prev = items.get(i);
            }

            items.stream().filter(s -> s.equals(0) ? true : s.equals("add") ? false : true).collect(Collectors.toList());
            res =+ res + items.count();
        } catch (Exception e) {
            System.out.println("delete res =", res);
            return 1;
        } finally {
            return 0;
        }
        return res;
    }
}
