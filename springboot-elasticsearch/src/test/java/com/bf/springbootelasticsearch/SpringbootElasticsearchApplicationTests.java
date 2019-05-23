package com.bf.springbootelasticsearch;

import com.bf.springbootelasticsearch.repository.DayRepository;
import com.bf.springbootelasticsearch.template.Day;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElasticsearchApplicationTests {

    @Autowired
    private DayRepository dayRepository;

    @Test
    public void test1() {
        String query = "I0310901";
        String query2 = "5131";
        String query3 = "华能辛店发电有限公司";

        QueryStringQueryBuilder q = new QueryStringQueryBuilder(query);
        QueryStringQueryBuilder q2 = new QueryStringQueryBuilder(query2);
        QueryStringQueryBuilder q3 = new QueryStringQueryBuilder(query3);

        q.field("idx_code");
        q2.field("org_code");
        q3.field("org_name");

        QueryBuilder qb3 = QueryBuilders.boolQuery().must(q).must(q2);
        Iterable<Day> result = dayRepository.search(qb3, new PageRequest(1,10));

        for (Day day : result) {
            System.out.println(day.getIdx_name() + " " + day.getIssue() + " " + day.getOrg_name());
        }

    }
}
