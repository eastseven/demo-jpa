package cn.eastseven;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dongqi on 17/3/9.
 */
@Slf4j
@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class RepositoryTestsParent {
}
