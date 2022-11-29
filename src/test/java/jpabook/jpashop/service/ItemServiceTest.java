package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.domain.item.Movie;
import jpabook.jpashop.repository.ItemRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

  @Autowired
  ItemRepository itemRepository;
  @Autowired
  ItemService itemService;

  @Test
  public void 아이템생성() throws Exception {
    //given
    Item movie = new Movie();
    movie.setName("movies");
    //when
    long saveId = itemService.savaItem(movie);
    //thenE
    Assertions.assertEquals(movie, itemRepository.findOne(saveId));
  }
}