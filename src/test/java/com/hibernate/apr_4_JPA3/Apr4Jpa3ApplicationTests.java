package com.hibernate.apr_4_JPA3;

import com.hibernate.apr_4_JPA3.entities.Address;
import com.hibernate.apr_4_JPA3.entities.Author;
import com.hibernate.apr_4_JPA3.entities.ManyToMany.AuthorMany;
import com.hibernate.apr_4_JPA3.entities.ManyToMany.BookMany;
import com.hibernate.apr_4_JPA3.entities.OneToMany.AuthorOneMany;
import com.hibernate.apr_4_JPA3.entities.OneToMany.BookOneMany;
import com.hibernate.apr_4_JPA3.entities.OneToManyBi.AuthorOneManyBi;
import com.hibernate.apr_4_JPA3.entities.OneToManyBi.BookOneManyBi;
import com.hibernate.apr_4_JPA3.entities.OneToManyUni.AuthorOneManyUni;
import com.hibernate.apr_4_JPA3.entities.OneToManyUni.BookOneManyUni;
import com.hibernate.apr_4_JPA3.entities.OneToOne.AuthorOne;
import com.hibernate.apr_4_JPA3.entities.OneToOne.BookOne;
import com.hibernate.apr_4_JPA3.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class Apr4Jpa3ApplicationTests {
	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	AuthorManyRepository authorManyRepository;
	@Autowired
	AuthorOneRepository authorOneRepository;
	@Autowired
	AuthorOneManyRepository authorOneManyRepository;
	@Autowired
	AuthorOneManyUniRepository authorOneManyUniRepository;
	@Autowired
	AuthorOneManyBiRepository authorOneManyBiRepository;

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

		author.setSubjects(Arrays.asList("Java","Python"));
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

		HashSet<AuthorMany> authorManyHashSet = new HashSet<>();
		authorManyHashSet.add(authorMany);

		bookMany.setAuthorManySet(authorManyHashSet);

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
		bookOne.setAuthorOne(authorOne);

		authorOneRepository.save(authorOne);
	}

	//OneToMany
	@Test
	public void testCreateAuthorOneBookMany(){
		AuthorOneMany authorOneMany = new AuthorOneMany();
		authorOneMany.setName("Divyanshu");

		HashSet<BookOneMany> bookOneManyHashSet = new HashSet<>();
		BookOneMany bookOneMany1 = new BookOneMany();
		bookOneMany1.setName("Spring");
		bookOneManyHashSet.add(bookOneMany1);
		BookOneMany bookOneMany2 = new BookOneMany();
		bookOneMany2.setName("Spring");
		bookOneManyHashSet.add(bookOneMany2);

		authorOneMany.setBookOneManySet(bookOneManyHashSet);
		bookOneMany1.setAuthorOneMany(authorOneMany);
		bookOneMany2.setAuthorOneMany(authorOneMany);

		authorOneManyRepository.save(authorOneMany);
	}
	//OneToMany Uni
	@Test
	public void testCreateAuthorOneBookManyUni(){
		AuthorOneManyUni authorOneManyUni = new AuthorOneManyUni();
		authorOneManyUni.setName("Jai");

		HashSet<BookOneManyUni> bookOneManyUniHashSet = new HashSet<>();
		BookOneManyUni bookOneManyUni1 = new BookOneManyUni();
		bookOneManyUni1.setName("SpringBoot");
		BookOneManyUni bookOneManyUni2 = new BookOneManyUni();
		bookOneManyUni2.setName("Security");
		bookOneManyUniHashSet.add(bookOneManyUni1);
		bookOneManyUniHashSet.add(bookOneManyUni2);
		authorOneManyUni.setBookOneManyUniSet(bookOneManyUniHashSet);

		authorOneManyUniRepository.save(authorOneManyUni);
	}
	@Test
	public void testCreateAuthorOneBookManyBi(){
		AuthorOneManyBi authorOneManyBi = new AuthorOneManyBi();
		authorOneManyBi.setName("Jai");

		HashSet<BookOneManyBi> bookOneManyBiHashSet = new HashSet<>();
		BookOneManyBi bookOneManyBi1 = new BookOneManyBi();
		bookOneManyBi1.setName("SpringBoot");
		BookOneManyBi bookOneManyBi2 = new BookOneManyBi();
		bookOneManyBi2.setName("Security");
		bookOneManyBiHashSet.add(bookOneManyBi1);
		bookOneManyBiHashSet.add(bookOneManyBi2);
		authorOneManyBi.setBookOneManyBiSet(bookOneManyBiHashSet);
		bookOneManyBi1.setAuthorOneMany(authorOneManyBi);
		bookOneManyBi2.setAuthorOneMany(authorOneManyBi);
		authorOneManyBiRepository.save(authorOneManyBi);
	}
}
