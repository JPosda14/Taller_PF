import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CollectionUtils {
    public static <T> List<T> filldata(Supplier<T> list, int size){
List<T> list1 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list1.add(list.get());
        }
        return list1;

    }


}
