package com.hibernate.apr_4_JPA3;

import com.hibernate.apr_4_JPA3.entities.Address;
import com.hibernate.apr_4_JPA3.entities.Author;
import com.hibernate.apr_4_JPA3.entities.ManyToMany.AuthorMany;
import com.hibernate.apr_4_JPA3.entities.ManyToMany.BookMany;
import com.hibernate.apr_4_JPA3.entities.OneToOne.AuthorOne;
import com.hibernate.apr_4_JPA3.entities.OneToOne.BookOne;
import com.hibernate.apr_4_JPA3.entities.Subject;
import com.hibernate.apr_4_JPA3.repository.AuthorManyRepository;
import com.hibernate.apr_4_JPA3.repository.AuthorOneRepository;
import com.hibernate.apr_4_JPA3.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashSet;

@SpringBootTest
class Apr4Jpa3ApplicationTests {
	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	AuthorManyRepository authorManyRepository;
	@Autowired
	AuthorOneRepository authorOneRepository;
	@Test
	void testCreateAuthor() {
		Author author = new Author();
		author.setName("Yaman");

		Address address = new Address();
		address.setStreetnumber("45");
		address.setLocation("Model Town");
		address.setState("Delhi");

		author.setAddress(address);

		authorRepository.save(author);
	}

	@Test
	void testCreateAuthorWithSubjects(){
		Author author = new Author();
		author.setName("Yaman");

		Address address = new Address();
		address.setStreetnumber("45");
		address.setLocation("Model Town");
		address.setState("Delhi");

		author.setAddress(address);

		Subject subject1 = new Subject();
		subject1.setName("Java");

		Subject subject2 = new Subject();
		subject2.setName("Python");

		Subject subject3 = new Subject();
		subject3.setName("C++");

		author.addSubject(subject1);
		author.addSubject(subject2);
		author.addSubject(subject3);
		authorRepository.save(author);
	}

	//ManyToMany
	@Test
	public void testCreateAuthorManyBookMany(){
		AuthorMany authorMany = new AuthorMany();
		authorMany.setName("Pranshu");

		HashSet<BookMany> bookManyHashSet = new HashSet<>();
		BookMany bookMany = new BookMany();
		bookMany.setName("Spring");
		bookManyHashSet.add(bookMany);

		authorMany.setBookManySet(bookManyHashSet);

		authorManyRepository.save(authorMany);
	}

	//OneToOne
	@Test
	public void testCreateAuthorOneBookOne(){
		AuthorOne authorOne = new AuthorOne();
		authorOne.setName("Tarun");

		BookOne bookOne = new BookOne();
		bookOne.setName("Python");

		authorOne.setBookOne(bookOne);

		authorOneRepository.save(authorOne);
	}
	//OneToMany

}
