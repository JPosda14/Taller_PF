import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class CollectionUtils {
    public static <T> List<T> filldata(Supplier<T> supplier, Integer size) {
List<T> list1 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list1.add(supplier.get());
        }
        return list1;
    }

    public static <T,R> List<R> transformdata(Function<T,R> function, List<T> values){
        List<R> list2 = new ArrayList<>();
        for(T value: values){
            list2.add(function.apply(value));
        }
        return list2;
    }
    public static <T,R> List<R> newlist(Function<T,R> function,List<T> values){
        return values.stream().map(function).collect(Collectors.toList());
    }
    public static <T> List<T> filterlist(List<T> values, Predicate<T> predicate){
        return values.stream().filter(predicate).collect(Collectors.toList());
    }
    public static <T> T nonlist(List<T> values, BinaryOperator<T> binaryOperator){
        return values.stream().reduce(binaryOperator).get();
    }




}
