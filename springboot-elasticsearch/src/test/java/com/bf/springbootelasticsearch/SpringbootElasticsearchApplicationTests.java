package com.bf.springbootelasticsearch;

import com.bf.springbootelasticsearch.entity.Accounts;
import com.bf.springbootelasticsearch.repository.AccountsRepository;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElasticsearchApplicationTests {

    @Autowired
    private AccountsRepository accountsRepository;

    @Test
    public void test1() {
        String query = "3";
        QueryStringQueryBuilder q = new QueryStringQueryBuilder(query);

        q.field("desc");

        Iterable<Accounts> result = accountsRepository.search(q);

        for (Accounts accounts : result) {
            System.out.println(accounts.getUser());
            System.out.println(accounts.getTitle());
        }

    }
}
