import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("april7baby@gmail.com");
		user1.setFullName("David Tobrise");
		user1.setPassword("pa55w3rd");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//Begin Transaction
		entityManager.getTransaction().begin();
		//persist transaction
		entityManager.persist(user1);
		//commit transaction
		entityManager.getTransaction().commit();
		//close entity manager
		entityManager.close();
		//close entity manager Factory
		entityManagerFactory.close();
		
		//output a message to the console
		System.out.println("A User Object was Persisted!");
		
	}

}
