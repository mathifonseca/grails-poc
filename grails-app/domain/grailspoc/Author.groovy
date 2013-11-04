package grailspoc

class Author {

	String name

    static hasMany = [fiction: Book, nonFiction: Book]

    static constraints = {
    }
    
}
