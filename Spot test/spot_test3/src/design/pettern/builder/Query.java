package design.pettern.builder;

public class Query {
	 private String select;
    private String from;
    private String where;
    private String orderBy;
    
    public void setSelect(String select) {
        this.select = select;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    
    public void setWhere(String where) {
        this.where = where;
    }
    
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
    
    public String getSelect() {
		return select;
	}

	public String getFrom() {
		return from;
	}

	public String getWhere() {
		return where;
	}

	public String getOrderBy() {
		return orderBy;
	}
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(select);
        sb.append(" FROM ");
        sb.append(from);
        if (where != null) {
            sb.append(" WHERE ");
            sb.append(where);
        }
        if (orderBy != null) {
            sb.append(" ORDER BY ");
            sb.append(orderBy);
        }
        return sb.toString();
    }

	
}
