package pure

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 6/14/13
 * Time: 3:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name='book')
class Book {
    @Id @GeneratedValue
    @Column
    Long id

    @Column
    String title

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name='author_id')
    Author author
}
