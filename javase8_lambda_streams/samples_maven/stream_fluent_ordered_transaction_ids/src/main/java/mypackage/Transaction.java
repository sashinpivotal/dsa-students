package mypackage;

public class Transaction {
	
	private Integer id;
	private TransactionType type;
	private Integer value;
	
	public Transaction(Integer id, TransactionType type, Integer value) {
		super();
		this.id = id;
		this.type = type;
		this.value = value;
	}

	public Integer getValue() {
		return this.value;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	TransactionType getType() {
		return type;
	}

	void setType(TransactionType type) {
		this.type = type;
	}

}
