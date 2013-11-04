import grailspoc.*

class BootStrap {

    def init = { servletContext ->

    	def b1 = new Book(title: "IT")
    	def b2 = new Book(title: "On Writing: A Memoir of the Craft")

    	def a = new Author(name: "Stephen King")
             .addToFiction(b1)
             .addToNonFiction(b2)
             .save()

        println Author.list()

        println Book.list()

        println a.fiction
        println a.nonFiction

        println b1.author
        println b2.author

    }

    def destroy = {
    }

}
