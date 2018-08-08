
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Stats {
	class Stocks {
		String symbol;
		double price;

		public String getSymbol() {
			return symbol;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

	}

	public static class StatisticsAggregatorImpl implements StatisticsAggregator {
		List<Stocks> stockList = new ArrayList<Stocks>();

		@Override
		public void putNewPrice(String symbol, double price) {
			synchronized (this) {
				Stocks stock = new Stats().new Stocks();
				stock.setPrice(price);
				stock.setSymbol(symbol);
				stockList.add(stock);
			}

		}

		@Override
		public double getAveragePrice(String symbol) {
			synchronized (this) {
				double sum = 0.0;
				int counter = 0;
				for (Stocks s : stockList) {
					if (s.getSymbol().equalsIgnoreCase(symbol)) {
						sum += s.getPrice();
						counter++;
					}
				}
				/*
				 * //System.out.println(sum + "  "+ counter); double average =
				 * sum/counter; DecimalFormat format = new
				 * DecimalFormat("#.####"); double fourDecimal =
				 * Double.valueOf(format.format(average));
				 * System.out.println(fourDecimal);
				 */
				return sum / counter;
			}
		}

		@Override
		public int getTickCount(String symbol) {
			int counter = 0;
			for (Stocks s : stockList) {
				if (s.getSymbol().equalsIgnoreCase(symbol)) {
					counter++;
				}
			}
			return counter;
		}

	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(
						String.format("%s %.4f %d", symbol, stats.getAveragePrice(symbol), stats.getTickCount(symbol)));
			}
		}
		scanner.close();

		StatisticsAggregatorImpl s = new StatisticsAggregatorImpl();
		s.putNewPrice("IBM", 22.22);
		s.putNewPrice("AAPL", 33.33);
		s.putNewPrice("IBM", 44.44);
		s.putNewPrice("AAPL", 55.55);
		s.putNewPrice("IBM", 66.66);
		s.putNewPrice("IBM", 88.88);

		System.out.println(s.getAveragePrice("IBM"));
		System.out.println(s.getTickCount("IBM"));

		System.out.println(s.getAveragePrice("AAPL"));
		System.out.println(s.getTickCount("AAPL"));

	}
}
