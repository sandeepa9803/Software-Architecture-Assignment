package design.pettern.builder;

public class QueryBuilder {
	private Query query;
    
    public QueryBuilder() {
        this.query = new Query();
    }
    
    public QueryBuilder select(String select) {
        query.setSelect(select);
        return this;
    }
    
    public QueryBuilder from(String from) {
        query.setFrom(from);
        return this;
    }
    
    public QueryBuilder where(String where) {
        query.setWhere(where);
        return this;
    }
    
    public QueryBuilder orderBy(String orderBy) {
        query.setOrderBy(orderBy);
        return this;
    }
    
    public Query build() {
        if (query.getSelect() == null || query.getFrom() == null) {
            throw new IllegalStateException("Query must have a SELECT and FROM");
        }
        return query;
    }
}
