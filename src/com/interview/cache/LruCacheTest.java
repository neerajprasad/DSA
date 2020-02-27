package interview.cache;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LruCacheTest {
LruCache cache =new LruCache(5);
    @BeforeEach
    public void put() {
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.put(11,1);
        cache.put(22,2);
        cache.put(33,3);
    }

    @Test
//    @Order(2)
    void get() {
        assertEquals(cache.get(1),-1);
        cache.put(5,5);
        assertEquals(cache.get(5),5);
    }
}