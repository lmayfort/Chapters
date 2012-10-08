class Post implements Comparable {
	
	String content
	Date created = new Date()
	
	static belongsTo = [ user : User ]
	
	static hasMany = [ tags : Tag ]
	
	// we keep posts sorted by date on each entry
	public int compareTo(Object obj) {
		return created <=> obj.created
	}
	
}
