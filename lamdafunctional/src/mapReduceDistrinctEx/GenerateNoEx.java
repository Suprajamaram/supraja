package mapReduceDistrinctEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class GenerateNoEx {
	
	public static void main(String[]args) {
		
		Stream<Integer> noStream = Stream.iterate(1, (a)->a = a+1).limit(100);
		noStream.map((a)->a%2==0?"Even Detected":"Odd Detected").limit(50).forEach(System.out::println);
		List<String> animal1 = Arrays.asList("Cat","Lion","Tiger","Leopard","Cheetah");
		List<String> animal2 = Arrays.asList("Dog","Wolf","Fox","Bear");
		List<String> animal3 = Arrays.asList("Wolf","Lion","Tiger","Bear");
		Stream<List<String>> flatStream = Stream.of(animal1,animal2,animal3);
		flatStream.flatMap((a)->a.stream()).distinct().forEach(System.out::println);
	}
		
}


