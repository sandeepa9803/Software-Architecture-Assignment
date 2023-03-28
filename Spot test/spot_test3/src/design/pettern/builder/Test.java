package design.pettern.builder;

public class Test {

	public static void main(String[] args) {
		Query query1 = new QueryBuilder().select("name").from("student").build();
		System.out.println(query1.toString()); // SELECT name FROM student

		Query query2 = new QueryBuilder().select("name").from("student").where("name = 'Name1'").build();
		System.out.println(query2.toString()); // SELECT name FROM student WHERE name = 'Name1'
		
		try {
			Query query3 = new QueryBuilder().select("name").where("name = 'Name1'").build();
			System.out.println(query3.toString());
		} catch (IllegalStateException e) {
			System.out.println("Exception thrown: " + e.getMessage()); // Exception thrown: Query must have a SELECT and FROM
		}
	}

}
