package streamdemo;
import java.util.stream.*;
import java.util.stream.Stream.Builder;

public class buildered {
   public static void main(String[] args) {
	   Stream<String> stream =Stream.of("coffee","banana","papaya","pinapple","strawberry","tea","Expresso");
	   stream.forEach(System.out::println);
   }

}
