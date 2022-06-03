package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Transaction> transactions = new ArrayList<>(Arrays.asList(new Transaction(1, TransactionType.GROCERY, 100),
				new Transaction(2, TransactionType.DESK, 300), new Transaction(3, TransactionType.GROCERY, 250),
				new Transaction(4, TransactionType.GROCERY, 150), new Transaction(5, TransactionType.CHAIR, 80)));

		System.out.println("---- Non-stream (External iteration) operation ----");
		List<Integer> transactionIds = getGroceryTransactionIdsNoStream(transactions);
		transactionIds.forEach(id -> System.out.println("transaction id = " + id));

		System.out.println("---- Stream (Internal iteration) operation ----");
		transactionIds = getGroceryTransactionIdsWithStream(transactions);
		transactionIds.forEach(id -> System.out.println("transaction id = " + id));

		// <For your own exercise>
		// - Create Product, which has Integer productId, ProductType productType, 
		//   and Integer price fields
		// - Create ProductType as a enum, which has BOOK, ELECTRONICS, FOOD as possible values
		// - Add appropriate initial test data
		// - Using stream, get a list of Product Id's of the ELECTRONICS reverse sorted on the price

	}

	// Non-stream operation (external iteration)
	private static List<Integer> getGroceryTransactionIdsNoStream(List<Transaction> transactions) {

		List<Transaction> groceryTransactions = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getType() == TransactionType.GROCERY) {
				groceryTransactions.add(t);
			}
		}

		Collections.sort(groceryTransactions, new Comparator<Transaction>() {
			public int compare(Transaction t1, Transaction t2) {
				return t2
						.getValue()
						.compareTo(t1.getValue());
			}
		});

		List<Integer> transactionIds = new ArrayList<>();
		for (Transaction t : groceryTransactions) {
			transactionIds.add(t.getId());
		}

		return transactionIds;
	}

	// Stream operation (internal iteration)
	private static List<Integer> getGroceryTransactionIdsWithStream(List<Transaction> transactions) {

		return transactions
				.parallelStream()
				.filter(transaction -> transaction.getType() == TransactionType.GROCERY)
				.sorted(Comparator.comparing(Transaction::getValue).reversed())
				.map(Transaction::getId)
				.collect(Collectors.toList());

	}

}
