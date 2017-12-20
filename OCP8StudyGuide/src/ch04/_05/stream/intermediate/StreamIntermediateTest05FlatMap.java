package ch04._05.stream.intermediate;

import java.util.stream.Stream;

public class StreamIntermediateTest05FlatMap {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		s.map(String::length).forEach(System.out::print); // 676
	}
}
