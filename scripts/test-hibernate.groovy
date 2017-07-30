
import org.hibernate.Session
import org.hibernate.Transaction
import pure.*

import hibernate.HibernateUtil



Session session = HibernateUtil.sessionFactory.openSession()
Transaction tx = session.beginTransaction()

Author author = new Author(name: 'new author 1')
session.save author

Book book1 = new Book(title: 'book1', author: author)
Book book2 = new Book(title: 'book2', author: author)
session.save book1

session.flush()
//session.clear()


def book = session.get(Book, 1L)
println book.title
println book.author.name

session.close()



