package ch07._16.reviewQuestions;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class QX18 {

	public static void await(CyclicBarrier cb) {
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
		}
	}

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(10, () -> System.out.println("Stock Room Full!"));
		IntStream.iterate(1, i -> 1).limit(9).parallel().forEach(i -> await(cb));
		// F. It compiles but waits forever at runtime.
	}
}
