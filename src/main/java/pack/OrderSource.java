package pack;

import java.nio.file.Path;
import java.util.List;

public interface OrderSource {
    public List<User> parseOrders();
}
